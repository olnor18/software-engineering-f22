/*
 * generated by Xtext 2.25.0
 */
package xtext.factoryLang.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import xtext.factoryLang.generator.subgenerators.CsprojGenerator
import xtext.factoryLang.generator.subgenerators.ProgramGenerator
import xtext.factoryLang.generator.subgenerators.MqttGenerator
import xtext.factoryLang.factoryLang.Model
import xtext.factoryLang.factoryLang.Crane
import xtext.factoryLang.generator.subgenerators.EntityGenerator
import xtext.factoryLang.factoryLang.Disk
import xtext.factoryLang.factoryLang.Camera
import xtext.factoryLang.generator.subgenerators.UppaalGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FactoryLangGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.filter(Model).next
		val devices = model.configurations.map[device]
		val statements = model.statements
		try { 
			ProgramGenerator.generate(fsa, devices, statements)
			CsprojGenerator.generate(fsa)
			MqttGenerator.generate(fsa)
			EntityGenerator.generate(fsa, 
				devices.filter[it instanceof Crane].size> 0, 
				devices.filter[it instanceof Disk].size> 0, 
				devices.filter[it instanceof Camera].size> 0
			)
			UppaalGenerator.generate(fsa, resource)
		} catch (Exception e) {
			e.printStackTrace()
		}
		
		

	}
}
