/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import xtext.factoryLang.FactoryLangRuntimeModule;
import xtext.factoryLang.FactoryLangStandaloneSetup;
import xtext.factoryLang.ide.FactoryLangIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class FactoryLangWebSetup extends FactoryLangStandaloneSetup {
  private final IResourceBaseProvider resourceBaseProvider;
  
  @Override
  public Injector createInjector() {
    FactoryLangRuntimeModule _factoryLangRuntimeModule = new FactoryLangRuntimeModule();
    FactoryLangIdeModule _factoryLangIdeModule = new FactoryLangIdeModule();
    FactoryLangWebModule _factoryLangWebModule = new FactoryLangWebModule(this.resourceBaseProvider);
    return Guice.createInjector(
      Modules2.mixin(_factoryLangRuntimeModule, _factoryLangIdeModule, _factoryLangWebModule));
  }
  
  public FactoryLangWebSetup(final IResourceBaseProvider resourceBaseProvider) {
    super();
    this.resourceBaseProvider = resourceBaseProvider;
  }
}
