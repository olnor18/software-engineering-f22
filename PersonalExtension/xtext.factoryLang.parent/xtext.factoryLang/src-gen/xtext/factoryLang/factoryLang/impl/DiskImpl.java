/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.factoryLang.factoryLang.Disk;
import xtext.factoryLang.factoryLang.DiskParameter;
import xtext.factoryLang.factoryLang.FactoryLangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.factoryLang.factoryLang.impl.DiskImpl#getSlotParameter <em>Slot Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiskImpl extends DeviceImpl implements Disk
{
  /**
   * The cached value of the '{@link #getSlotParameter() <em>Slot Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlotParameter()
   * @generated
   * @ordered
   */
  protected DiskParameter slotParameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiskImpl()
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
    return FactoryLangPackage.Literals.DISK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskParameter getSlotParameter()
  {
    return slotParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSlotParameter(DiskParameter newSlotParameter, NotificationChain msgs)
  {
    DiskParameter oldSlotParameter = slotParameter;
    slotParameter = newSlotParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FactoryLangPackage.DISK__SLOT_PARAMETER, oldSlotParameter, newSlotParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSlotParameter(DiskParameter newSlotParameter)
  {
    if (newSlotParameter != slotParameter)
    {
      NotificationChain msgs = null;
      if (slotParameter != null)
        msgs = ((InternalEObject)slotParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FactoryLangPackage.DISK__SLOT_PARAMETER, null, msgs);
      if (newSlotParameter != null)
        msgs = ((InternalEObject)newSlotParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FactoryLangPackage.DISK__SLOT_PARAMETER, null, msgs);
      msgs = basicSetSlotParameter(newSlotParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FactoryLangPackage.DISK__SLOT_PARAMETER, newSlotParameter, newSlotParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FactoryLangPackage.DISK__SLOT_PARAMETER:
        return basicSetSlotParameter(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FactoryLangPackage.DISK__SLOT_PARAMETER:
        return getSlotParameter();
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
      case FactoryLangPackage.DISK__SLOT_PARAMETER:
        setSlotParameter((DiskParameter)newValue);
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
      case FactoryLangPackage.DISK__SLOT_PARAMETER:
        setSlotParameter((DiskParameter)null);
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
      case FactoryLangPackage.DISK__SLOT_PARAMETER:
        return slotParameter != null;
    }
    return super.eIsSet(featureID);
  }

} //DiskImpl
