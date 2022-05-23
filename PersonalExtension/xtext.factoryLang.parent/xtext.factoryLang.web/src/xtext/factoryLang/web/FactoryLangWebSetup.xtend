/*
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import xtext.factoryLang.FactoryLangRuntimeModule
import xtext.factoryLang.FactoryLangStandaloneSetup
import xtext.factoryLang.ide.FactoryLangIdeModule
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
class FactoryLangWebSetup extends FactoryLangStandaloneSetup {
	val IResourceBaseProvider resourceBaseProvider
	
	override Injector createInjector() {
		return Guice.createInjector(
			Modules2.mixin(
				new FactoryLangRuntimeModule, 
				new FactoryLangIdeModule, 
				new FactoryLangWebModule(resourceBaseProvider)
			)
		)
	}
}
