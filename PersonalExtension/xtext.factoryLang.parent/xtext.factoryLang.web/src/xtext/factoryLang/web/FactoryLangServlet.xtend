/*
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.web

import javax.servlet.annotation.WebServlet
import org.eclipse.xtext.util.DisposableRegistry
import org.eclipse.xtext.web.servlet.XtextServlet
import org.eclipse.xtext.web.server.persistence.ResourceBaseProviderImpl

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = 'XtextServices', urlPatterns = '/xtext-service/*')
class FactoryLangServlet extends XtextServlet {
	
	static final long serialVersionUID = 1L
	
	DisposableRegistry disposableRegistry
	
	override init() {
		super.init()
		val resourceBaseProvider = new ResourceBaseProviderImpl('./saveFiles')
		val injector = new FactoryLangWebSetup(resourceBaseProvider).createInjectorAndDoEMFRegistration()
		disposableRegistry = injector.getInstance(DisposableRegistry)
	}
	
	override destroy() {
		if (disposableRegistry !== null) {
			disposableRegistry.dispose()
			disposableRegistry = null
		}
		super.destroy()
	}
	
}