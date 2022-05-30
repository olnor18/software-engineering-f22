/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Scan Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.factoryLang.CameraScanOperation#getDevice <em>Device</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.CameraScanOperation#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getCameraScanOperation()
 * @model
 * @generated
 */
public interface CameraScanOperation extends CameraOperation
{
  /**
   * Returns the value of the '<em><b>Device</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' reference.
   * @see #setDevice(Camera)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getCameraScanOperation_Device()
   * @model
   * @generated
   */
  Camera getDevice();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.CameraScanOperation#getDevice <em>Device</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' reference.
   * @see #getDevice()
   * @generated
   */
  void setDevice(Camera value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getCameraScanOperation_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.CameraScanOperation#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // CameraScanOperation