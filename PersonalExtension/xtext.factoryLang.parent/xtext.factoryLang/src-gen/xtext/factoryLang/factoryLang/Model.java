/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.factoryLang.Model#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.Model#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
   * The list contents are of type {@link xtext.factoryLang.factoryLang.Configuration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configurations</em>' containment reference list.
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getModel_Configurations()
   * @model containment="true"
   * @generated
   */
  EList<Configuration> getConfigurations();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link xtext.factoryLang.factoryLang.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getModel_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Model
