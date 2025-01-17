/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.factoryLang.factoryLang.CranePositionParameter;
import xtext.factoryLang.factoryLang.FactoryLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crane Position Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.factoryLang.impl.CranePositionParameterImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link xtext.factoryLang.factoryLang.impl.CranePositionParameterImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CranePositionParameterImpl extends CraneParameterImpl implements CranePositionParameter
{
  /**
   * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegree()
   * @generated
   * @ordered
   */
  protected static final int DEGREE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDegree()
   * @generated
   * @ordered
   */
  protected int degree = DEGREE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CranePositionParameterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FactoryLangPackage.Literals.CRANE_POSITION_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDegree()
  {
    return degree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDegree(int newDegree)
  {
    int oldDegree = degree;
    degree = newDegree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FactoryLangPackage.CRANE_POSITION_PARAMETER__DEGREE, oldDegree, degree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FactoryLangPackage.CRANE_POSITION_PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FactoryLangPackage.CRANE_POSITION_PARAMETER__DEGREE:
        return getDegree();
      case FactoryLangPackage.CRANE_POSITION_PARAMETER__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FactoryLangPackage.CRANE_POSITION_PARAMETER__DEGREE:
        setDegree((Integer)newValue);
        return;
      case FactoryLangPackage.CRANE_POSITION_PARAMETER__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FactoryLangPackage.CRANE_POSITION_PARAMETER__DEGREE:
        setDegree(DEGREE_EDEFAULT);
        return;
      case FactoryLangPackage.CRANE_POSITION_PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FactoryLangPackage.CRANE_POSITION_PARAMETER__DEGREE:
        return degree != DEGREE_EDEFAULT;
      case FactoryLangPackage.CRANE_POSITION_PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (degree: ");
    result.append(degree);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //CranePositionParameterImpl
