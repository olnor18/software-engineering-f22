/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class FactoryLangStandaloneSetup extends FactoryLangStandaloneSetupGenerated {
  public static void doSetup() {
    new FactoryLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}