/**
 * generated by Xtext 2.25.0
 */
package xtext.factoryLogicLang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLogicLang.Loop#getLoopvar <em>Loopvar</em>}</li>
 *   <li>{@link xtext.factoryLogicLang.Loop#getSTRING1 <em>STRING1</em>}</li>
 *   <li>{@link xtext.factoryLogicLang.Loop#getSTRING2 <em>STRING2</em>}</li>
 * </ul>
 *
 * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Declaration
{
  /**
   * Returns the value of the '<em><b>Loopvar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loopvar</em>' attribute.
   * @see #setLoopvar(String)
   * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getLoop_Loopvar()
   * @model
   * @generated
   */
  String getLoopvar();

  /**
   * Sets the value of the '{@link xtext.factoryLogicLang.Loop#getLoopvar <em>Loopvar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loopvar</em>' attribute.
   * @see #getLoopvar()
   * @generated
   */
  void setLoopvar(String value);

  /**
   * Returns the value of the '<em><b>STRING1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING1</em>' attribute.
   * @see #setSTRING1(String)
   * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getLoop_STRING1()
   * @model
   * @generated
   */
  String getSTRING1();

  /**
   * Sets the value of the '{@link xtext.factoryLogicLang.Loop#getSTRING1 <em>STRING1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING1</em>' attribute.
   * @see #getSTRING1()
   * @generated
   */
  void setSTRING1(String value);

  /**
   * Returns the value of the '<em><b>STRING2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>STRING2</em>' attribute.
   * @see #setSTRING2(String)
   * @see xtext.factoryLogicLang.FactoryLogicLangPackage#getLoop_STRING2()
   * @model
   * @generated
   */
  String getSTRING2();

  /**
   * Sets the value of the '{@link xtext.factoryLogicLang.Loop#getSTRING2 <em>STRING2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>STRING2</em>' attribute.
   * @see #getSTRING2()
   * @generated
   */
  void setSTRING2(String value);

} // Loop
