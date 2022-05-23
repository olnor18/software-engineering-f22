package xtext.factoryLang.web

import org.eclipse.xtext.web.server.model.IWebResourceSetProvider
import org.eclipse.xtext.web.server.IServiceContext
import javax.inject.Inject
import javax.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet

class FactoryLangResourceSetProvider implements IWebResourceSetProvider {
	
	static val MULTI_RESOURCE_PREFIX = 'multi-resource'
		
	@Inject Provider<ResourceSet> provider
	
	override get(String resourceId, IServiceContext serviceContext) {
		if (resourceId !== null && resourceId.startsWith(MULTI_RESOURCE_PREFIX)) {
			val pathEnd = Math.max(resourceId.indexOf('/'), MULTI_RESOURCE_PREFIX.length)
			return serviceContext.session.get(ResourceSet -> resourceId.substring(0, pathEnd), [provider.get])
		} else
			return provider.get
	}
	
}