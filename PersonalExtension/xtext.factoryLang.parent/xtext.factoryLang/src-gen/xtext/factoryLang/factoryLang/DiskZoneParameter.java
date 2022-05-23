/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk Zone Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.factoryLang.DiskZoneParameter#getName <em>Name</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.DiskZoneParameter#getSlot <em>Slot</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getDiskZoneParameter()
 * @model
 * @generated
 */
public interface DiskZoneParameter extends DiskParameter
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getDiskZoneParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.DiskZoneParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Slot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slot</em>' attribute.
   * @see #setSlot(int)
   * @see xtext.factoryLang.factoryLang.FactoryLangPackage#getDiskZoneParameter_Slot()
   * @model
   * @generated
   */
  int getSlot();

  /**
   * Sets the value of the '{@link xtext.factoryLang.factoryLang.DiskZoneParameter#getSlot <em>Slot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slot</em>' attribute.
   * @see #getSlot()
   * @generated
   */
  void setSlot(int value);

} // DiskZoneParameter
