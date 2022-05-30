/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crane Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.factoryLang.CraneOperation#getDevice <em>Device</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.CraneOperation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getCraneOperation()
 * @model
 * @generated
 */
public interface CraneOperation extends Operation
{
  /**
   * Returns the value of the '<em><b>Device</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' reference.
   * @see #setDevice(Crane)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getCraneOperation_Device()
   * @model
   * @generated
   */
  Crane getDevice();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.CraneOperation#getDevice <em>Device</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' reference.
   * @see #getDevice()
   * @generated
   */
  void setDevice(Crane value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(CraneParameter)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getCraneOperation_Target()
   * @model
   * @generated
   */
  CraneParameter getTarget();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.CraneOperation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(CraneParameter value);

} // CraneOperation