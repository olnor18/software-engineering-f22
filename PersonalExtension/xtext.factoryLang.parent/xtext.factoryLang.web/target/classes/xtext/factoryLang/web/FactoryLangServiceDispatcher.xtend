package xtext.factoryLang.web;

import java.io.File
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths
import javax.inject.Inject
import javax.inject.Singleton
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.concurrent.CancelableUnitOfWork
import org.eclipse.xtext.util.internal.Log
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.web.server.IServiceContext
import org.eclipse.xtext.web.server.InvalidRequestException
import org.eclipse.xtext.web.server.XtextServiceDispatcher
import org.eclipse.xtext.web.server.XtextServiceDispatcher.ServiceDescriptor
import org.eclipse.xtext.web.server.generator.GeneratorService
import org.eclipse.xtext.web.server.model.IXtextWebDocument
import org.eclipse.xtext.web.server.validation.ValidationResult.Issue
import org.eclipse.xtext.web.server.validation.ValidationService
import xtext.factoryLang.validation.UppaalHelper

@Log
@Singleton
class FactoryLangServiceDispatcher extends XtextServiceDispatcher {
	@Inject
  	private GeneratorService generatorService;
  	
  	@Inject
  	private ValidationService validationService;
	
	override protected ServiceDescriptor getValidationService(IServiceContext context) throws InvalidRequestException {
		val document = getDocumentAccess(context);
		val serviceDescriptor = new ServiceDescriptor();
		(validationService as FactoryLangValidationService).checkMode = CheckMode.NORMAL_AND_FAST
		serviceDescriptor.service = [ | {
			try {
				document.readOnly(new CancelableUnitOfWork<FactoryLangValidationService, IXtextWebDocument>(){	
					override exec(IXtextWebDocument state, CancelIndicator cancelIndicator) throws Exception {
						validationService.compute(state, cancelIndicator);
						return validationService as FactoryLangValidationService
					}
					
				})
				return validationService.getResult(document);
			} catch (Throwable throwable) {
				return handleError(serviceDescriptor, throwable);
			}
		}];
		return serviceDescriptor;
	}
	
	override protected def createServiceDescriptor(String serviceType, IServiceContext context) {
		if (serviceType == "generate") {
			return getGeneratorAllService(context)
		}
		if (serviceType == "check-uppaal") {
			return getUppaalValidationService(context)
		}
		super.createServiceDescriptor(serviceType, context)
	}
	
	protected def getUppaalValidationService(IServiceContext context) throws InvalidRequestException {
		val document = getDocumentAccess(context);
		val serviceDescriptor = new ServiceDescriptor();
		(validationService as FactoryLangValidationService).checkMode = CheckMode.EXPENSIVE_ONLY
		serviceDescriptor.service = [ | {
			try {
				document.readOnly(new CancelableUnitOfWork<FactoryLangValidationService, IXtextWebDocument>(){	
					override exec(IXtextWebDocument state, CancelIndicator cancelIndicator) throws Exception {
						validationService.compute(state, cancelIndicator);
						return validationService as FactoryLangValidationService
					}
					
				})
				return validationService.getResult(document);
			} catch (Throwable throwable) {
				return handleError(serviceDescriptor, throwable);
			}
		}];
		return serviceDescriptor;
	}

	protected def getGeneratorAllService(IServiceContext context) throws InvalidRequestException {
		val document = getDocumentAccess(context)
		new ServiceDescriptor => [
			service = [
				try {
					(validationService as FactoryLangValidationService).checkMode = CheckMode.ALL
					document.readOnly(new CancelableUnitOfWork<FactoryLangValidationService, IXtextWebDocument>(){	
						override exec(IXtextWebDocument state, CancelIndicator cancelIndicator) throws Exception {
							validationService.compute(state, cancelIndicator);
							return validationService as FactoryLangValidationService
						}
						
					})
					
					val result = generatorService.getResult(document)
					val folder = "output/"
					result.getArtifacts().forEach[a | {
						var name = a.name
						if (name.startsWith(IFileSystemAccess.DEFAULT_OUTPUT)){
							name = name.replaceFirst(IFileSystemAccess.DEFAULT_OUTPUT, "")
						}
						val file = new File(folder+name)
						Files.createDirectories(Paths.get(file.getParentFile().toURI()));
						val fw = new FileWriter(file);
			            fw.write(a.content);
			            fw.close();
					}]
					val output = UppaalHelper.getOutputFromProgram("bash -c 'dos2unix ./output/OrchestratorService/build.sh && ./output/OrchestratorService/build.sh'")
					val returnValue = validationService.getResult(document)
					if (output.startsWith("ERROR:")){
						returnValue.issues.add(new Issue("Deployment failed with:\n"+output.substring(6), "", 0, 0, 0, 0))
					}
					return returnValue
				} catch (Throwable throwable) {
					handleError(throwable)
				}
			]
		]
	}
}
