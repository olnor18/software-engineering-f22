/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.factoryLang.ForEach#getVariable <em>Variable</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.ForEach#getDevice <em>Device</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.ForEach#getOperator <em>Operator</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.ForEach#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.ForEach#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends Loop
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getForEach_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.ForEach#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Device</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' reference.
   * @see #setDevice(Device)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getForEach_Device()
   * @model
   * @generated
   */
  Device getDevice();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.ForEach#getDevice <em>Device</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' reference.
   * @see #getDevice()
   * @generated
   */
  void setDevice(Device value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getForEach_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.ForEach#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Variable Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Value</em>' containment reference.
   * @see #setVariableValue(VariableValue)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getForEach_VariableValue()
   * @model containment="true"
   * @generated
   */
  VariableValue getVariableValue();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.ForEach#getVariableValue <em>Variable Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Value</em>' containment reference.
   * @see #getVariableValue()
   * @generated
   */
  void setVariableValue(VariableValue value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link xtext.factoryLang.factoryLang.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getForEach_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // ForEach
