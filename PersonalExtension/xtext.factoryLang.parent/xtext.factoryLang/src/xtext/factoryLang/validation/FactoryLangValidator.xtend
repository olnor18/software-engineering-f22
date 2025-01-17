/*
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.validation

import java.io.File
import java.io.FileWriter
import java.io.StringReader
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Arrays
import java.util.concurrent.Executors
import java.util.stream.Collectors
import javax.xml.parsers.DocumentBuilderFactory
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.validation.Check
import org.xml.sax.InputSource
import xtext.factoryLang.factoryLang.Camera
import xtext.factoryLang.factoryLang.ColorValue
import xtext.factoryLang.factoryLang.Crane
import xtext.factoryLang.factoryLang.CranePositionParameter
import xtext.factoryLang.factoryLang.DeviceConditional
import xtext.factoryLang.factoryLang.Disk
import xtext.factoryLang.factoryLang.DiskMarkSlotOperation
import xtext.factoryLang.factoryLang.DiskSlotParameter
import xtext.factoryLang.factoryLang.DiskStateValue
import xtext.factoryLang.factoryLang.DiskZoneParameter
import xtext.factoryLang.factoryLang.FactoryLangPackage.Literals
import xtext.factoryLang.factoryLang.Model
import xtext.factoryLang.factoryLang.TIME
import xtext.factoryLang.generator.subgenerators.UppaalGenerator
import xtext.factoryLang.validation.UppaalHelper.StreamGobbler

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class FactoryLangValidator extends AbstractFactoryLangValidator {

	public static val INVALID_VALUE = 'invalidValue'
	
	@Check(NORMAL)
	def checkUPPAAL(Model model){
		val path = "uppaal/system.xml"
		val fsa = new InMemoryFileSystemAccess();
		UppaalGenerator.generate(fsa, model.eResource);
		
		val file = new File(path)
		Files.createDirectories(Paths.get(file.getParentFile().toURI()));
		val fw = new FileWriter(file);
		val data = fsa.readTextFile(path).toString();
        fw.write(data);
        fw.close();
        
        val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        val queriesText = data.substring(data.lastIndexOf("<queries>"), data.lastIndexOf("</nta>"))
        val doc = builder.parse(new InputSource(new StringReader("<?xml version=\"1.0\"?>\n"+queriesText)))
        doc.getDocumentElement().normalize();
        val queries = doc.getElementsByTagName("query");
		/*val uppaalModel = UppaalHelper.loadModel(path)
		val engine = UppaalHelper.connectToEngine
		val system = UppaalHelper.compile(engine, uppaalModel)
		val res = engine.query(system, "", new Query("A[] !deadlock or EmergencyButton.Stopped", "Check for deadlocks"), UppaalHelper.qf)
		System.out.println("Result: "+res);*/
		
		var executablePath = ""
		if (!System.getProperty("os.name").equals("Linux")){
			executablePath = "./bin-Windows/verifyta"
		} else {
			executablePath = "./bin-Linux/verifyta"
		}
		
		val process = Runtime.getRuntime().exec(executablePath+" -q -s " + path )
		val streamGobbler = new StreamGobbler(process.getInputStream());
		Executors.newSingleThreadExecutor().submit(streamGobbler);
		process.waitFor();
		if (!streamGobbler.output.empty && streamGobbler.output.contains("Formula is NOT satisfied")) {
			val stream = Arrays.stream(streamGobbler.output.split("\\."))
			val streamArr = stream.collect(Collectors.toList())
			val filtered = streamArr.stream.filter([it | it.contains("Formula is NOT satisfied")])
			val filteredArr = filtered.collect(Collectors.toList())
			val queriesFailed = filteredArr.map([it | queries.item(streamArr.indexOf(it)).textContent.trim()]).join("\n")
			//val errormessage = filteredArr.stream.collect(Collectors.joining(".\n"))
			error('UPPAAL verification failed the following queries:\n'+queriesFailed,
				Literals.MODEL__STATEMENTS, INVALID_VALUE)
			System.out.println("ERROR")
			System.out.println(streamGobbler.output)
		}
	}
	
	
	@Check(FAST)
	def checkCranePositionParameter(CranePositionParameter parameter) {
		if (!(parameter.degree>= 0 && parameter.degree <= 359)) {
			error('Degree value should be between 0 and 359 degrees (inclusive)',
				Literals.CRANE_POSITION_PARAMETER__DEGREE, INVALID_VALUE)
		}
	}

	@Check(FAST)
	def checkDiskZoneParameter(DiskZoneParameter parameter) {
		val disk = EcoreUtil2.getContainerOfType(parameter, Disk) as Disk
		val nSlots = (disk.slotParameter as DiskSlotParameter).size

		if (!(parameter.slot> 0 && parameter.slot <= nSlots)) {
			error('''Slot must be within available slots (1-�nSlots�)''', Literals.DISK_ZONE_PARAMETER__SLOT,
				INVALID_VALUE)
		}
	}

	@Check(FAST)
	def checkDiskMarkSlotOperation(DiskMarkSlotOperation operation) {
		if (!operation.eIsSet(Literals.DISK_MARK_SLOT_OPERATION__QUANTITY) ||
			!operation.eIsSet(Literals.DISK_MARK_SLOT_OPERATION__MEASURE)) {
			return
		}

		val quantity = operation.quantity
		val measure = operation.measure

		if (quantity < 1) {
			error('The time to finish should be>= 1', (Literals.DISK_MARK_SLOT_OPERATION__QUANTITY), INVALID_VALUE)
			return
		}
		if (quantity == 1) {
			if (!(measure == TIME.SECOND || measure == TIME.MINUTE || measure == TIME.HOUR)) {
				error('Use singular unit notation when quantity is <= 1', (Literals.DISK_MARK_SLOT_OPERATION__MEASURE),
					INVALID_VALUE)
			}
			return
		} else {
			if (!(measure == TIME.SECONDS || measure == TIME.MINUTES || measure == TIME.HOURS)) {
				error('Use plural unit notation when quantity is> 1', Literals.DISK_MARK_SLOT_OPERATION__MEASURE,
					INVALID_VALUE)
			}
		}
	}

	// needs to be implemented
	@Check(FAST)
	def checkDeviceConditionalValues(DeviceConditional conditional) {
		if (!conditional.eIsSet(Literals.DEVICE_CONDITIONAL__DEVICE) ||
			!conditional.eIsSet(Literals.DEVICE_CONDITIONAL__DEVICE_VALUE)) {
			return
		}

		val device = conditional.device
		val value = conditional.deviceValue.value

		switch (device) {
			case device instanceof Crane: {
				if (value instanceof DiskStateValue) {
					error(device.name + ' cannot be compared to disk states', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
			case device instanceof Disk: {
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
			}
			case device instanceof Camera: {
				if (value instanceof DiskStateValue) {
					error(device.name + ' cannot be compared to disk states', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				if (value instanceof ColorValue) {
					error(device.name + ' cannot be compared to colors', Literals.DEVICE_CONDITIONAL__DEVICE_VALUE,
						INVALID_VALUE)
					return
				}
				return
			}
		}
	}
	
//	@Check
//	def checkVariableConditionalValues(VariableConditional variableConditional) {
//		if (!variableConditional.eIsSet(Literals.VARIABLE_CONDITIONAL__VARIABLE) ||
//			!variableConditional.eIsSet(Literals.VARIABLE_CONDITIONAL__VARIABLE_VALUE)) {
//			return
//		}
//
//		val variable = variableConditional.variable
//		val value = variableConditional.variableValue.value
//	}
}
