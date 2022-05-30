/**
 * generated by Xtext 2.26.0
 */
package xtext.factoryLang.factoryLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xtext.factoryLang.factoryLang.COLOR;
import xtext.factoryLang.factoryLang.COMPARISON_OPERATOR;
import xtext.factoryLang.factoryLang.Camera;
import xtext.factoryLang.factoryLang.CameraColorParameter;
import xtext.factoryLang.factoryLang.CameraOperation;
import xtext.factoryLang.factoryLang.CameraParameter;
import xtext.factoryLang.factoryLang.CameraScanOperation;
import xtext.factoryLang.factoryLang.ColorValue;
import xtext.factoryLang.factoryLang.Conditional;
import xtext.factoryLang.factoryLang.Configuration;
import xtext.factoryLang.factoryLang.Crane;
import xtext.factoryLang.factoryLang.CraneDropOperation;
import xtext.factoryLang.factoryLang.CraneOperation;
import xtext.factoryLang.factoryLang.CraneParameter;
import xtext.factoryLang.factoryLang.CranePickupOperation;
import xtext.factoryLang.factoryLang.CranePositionParameter;
import xtext.factoryLang.factoryLang.DISK_SLOT_STATES;
import xtext.factoryLang.factoryLang.DISK_STATES;
import xtext.factoryLang.factoryLang.Device;
import xtext.factoryLang.factoryLang.DeviceConditional;
import xtext.factoryLang.factoryLang.DeviceValue;
import xtext.factoryLang.factoryLang.Disk;
import xtext.factoryLang.factoryLang.DiskMarkSlotOperation;
import xtext.factoryLang.factoryLang.DiskMoveEmptySlotOperation;
import xtext.factoryLang.factoryLang.DiskMoveSlotOperation;
import xtext.factoryLang.factoryLang.DiskMoveVariableSlotOperation;
import xtext.factoryLang.factoryLang.DiskOperation;
import xtext.factoryLang.factoryLang.DiskParameter;
import xtext.factoryLang.factoryLang.DiskSlotParameter;
import xtext.factoryLang.factoryLang.DiskSlotStateValue;
import xtext.factoryLang.factoryLang.DiskSlotValue;
import xtext.factoryLang.factoryLang.DiskStateValue;
import xtext.factoryLang.factoryLang.DiskWaitOperation;
import xtext.factoryLang.factoryLang.DiskZoneParameter;
import xtext.factoryLang.factoryLang.FactoryLangFactory;
import xtext.factoryLang.factoryLang.FactoryLangPackage;
import xtext.factoryLang.factoryLang.ForEach;
import xtext.factoryLang.factoryLang.GlobalVariable;
import xtext.factoryLang.factoryLang.LocalVariable;
import xtext.factoryLang.factoryLang.Loop;
import xtext.factoryLang.factoryLang.Model;
import xtext.factoryLang.factoryLang.Operation;
import xtext.factoryLang.factoryLang.Parameter;
import xtext.factoryLang.factoryLang.Statement;
import xtext.factoryLang.factoryLang.TIME;
import xtext.factoryLang.factoryLang.Variable;
import xtext.factoryLang.factoryLang.VariableConditional;
import xtext.factoryLang.factoryLang.VariableValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FactoryLangFactoryImpl extends EFactoryImpl implements FactoryLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FactoryLangFactory init()
  {
    try
    {
      FactoryLangFactory theFactoryLangFactory = (FactoryLangFactory)EPackage.Registry.INSTANCE.getEFactory(FactoryLangPackage.eNS_URI);
      if (theFactoryLangFactory != null)
      {
        return theFactoryLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FactoryLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactoryLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FactoryLangPackage.MODEL: return createModel();
      case FactoryLangPackage.CONFIGURATION: return createConfiguration();
      case FactoryLangPackage.DEVICE: return createDevice();
      case FactoryLangPackage.PARAMETER: return createParameter();
      case FactoryLangPackage.CRANE_PARAMETER: return createCraneParameter();
      case FactoryLangPackage.DISK_PARAMETER: return createDiskParameter();
      case FactoryLangPackage.CAMERA_PARAMETER: return createCameraParameter();
      case FactoryLangPackage.STATEMENT: return createStatement();
      case FactoryLangPackage.CONDITIONAL: return createConditional();
      case FactoryLangPackage.OPERATION: return createOperation();
      case FactoryLangPackage.CRANE_OPERATION: return createCraneOperation();
      case FactoryLangPackage.DISK_OPERATION: return createDiskOperation();
      case FactoryLangPackage.CAMERA_OPERATION: return createCameraOperation();
      case FactoryLangPackage.LOOP: return createLoop();
      case FactoryLangPackage.VARIABLE: return createVariable();
      case FactoryLangPackage.DEVICE_VALUE: return createDeviceValue();
      case FactoryLangPackage.DISK_SLOT_VALUE: return createDiskSlotValue();
      case FactoryLangPackage.VARIABLE_VALUE: return createVariableValue();
      case FactoryLangPackage.DISK_STATE_VALUE: return createDiskStateValue();
      case FactoryLangPackage.DISK_SLOT_STATE_VALUE: return createDiskSlotStateValue();
      case FactoryLangPackage.COLOR_VALUE: return createColorValue();
      case FactoryLangPackage.NUMBER: return createNumber();
      case FactoryLangPackage.CRANE: return createCrane();
      case FactoryLangPackage.CRANE_POSITION_PARAMETER: return createCranePositionParameter();
      case FactoryLangPackage.DISK: return createDisk();
      case FactoryLangPackage.DISK_SLOT_PARAMETER: return createDiskSlotParameter();
      case FactoryLangPackage.DISK_ZONE_PARAMETER: return createDiskZoneParameter();
      case FactoryLangPackage.CAMERA: return createCamera();
      case FactoryLangPackage.CAMERA_COLOR_PARAMETER: return createCameraColorParameter();
      case FactoryLangPackage.DEVICE_CONDITIONAL: return createDeviceConditional();
      case FactoryLangPackage.VARIABLE_CONDITIONAL: return createVariableConditional();
      case FactoryLangPackage.CRANE_PICKUP_OPERATION: return createCranePickupOperation();
      case FactoryLangPackage.CRANE_DROP_OPERATION: return createCraneDropOperation();
      case FactoryLangPackage.DISK_MOVE_SLOT_OPERATION: return createDiskMoveSlotOperation();
      case FactoryLangPackage.DISK_MOVE_VARIABLE_SLOT_OPERATION: return createDiskMoveVariableSlotOperation();
      case FactoryLangPackage.DISK_MOVE_EMPTY_SLOT_OPERATION: return createDiskMoveEmptySlotOperation();
      case FactoryLangPackage.DISK_MARK_SLOT_OPERATION: return createDiskMarkSlotOperation();
      case FactoryLangPackage.DISK_WAIT_OPERATION: return createDiskWaitOperation();
      case FactoryLangPackage.CAMERA_SCAN_OPERATION: return createCameraScanOperation();
      case FactoryLangPackage.FOR_EACH: return createForEach();
      case FactoryLangPackage.LOCAL_VARIABLE: return createLocalVariable();
      case FactoryLangPackage.GLOBAL_VARIABLE: return createGlobalVariable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FactoryLangPackage.COMPARISON_OPERATOR:
        return createCOMPARISON_OPERATORFromString(eDataType, initialValue);
      case FactoryLangPackage.COLOR:
        return createCOLORFromString(eDataType, initialValue);
      case FactoryLangPackage.DISK_SLOT_STATES:
        return createDISK_SLOT_STATESFromString(eDataType, initialValue);
      case FactoryLangPackage.DISK_STATES:
        return createDISK_STATESFromString(eDataType, initialValue);
      case FactoryLangPackage.TIME:
        return createTIMEFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FactoryLangPackage.COMPARISON_OPERATOR:
        return convertCOMPARISON_OPERATORToString(eDataType, instanceValue);
      case FactoryLangPackage.COLOR:
        return convertCOLORToString(eDataType, instanceValue);
      case FactoryLangPackage.DISK_SLOT_STATES:
        return convertDISK_SLOT_STATESToString(eDataType, instanceValue);
      case FactoryLangPackage.DISK_STATES:
        return convertDISK_STATESToString(eDataType, instanceValue);
      case FactoryLangPackage.TIME:
        return convertTIMEToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Device createDevice()
  {
    DeviceImpl device = new DeviceImpl();
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CraneParameter createCraneParameter()
  {
    CraneParameterImpl craneParameter = new CraneParameterImpl();
    return craneParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskParameter createDiskParameter()
  {
    DiskParameterImpl diskParameter = new DiskParameterImpl();
    return diskParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CameraParameter createCameraParameter()
  {
    CameraParameterImpl cameraParameter = new CameraParameterImpl();
    return cameraParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CraneOperation createCraneOperation()
  {
    CraneOperationImpl craneOperation = new CraneOperationImpl();
    return craneOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskOperation createDiskOperation()
  {
    DiskOperationImpl diskOperation = new DiskOperationImpl();
    return diskOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CameraOperation createCameraOperation()
  {
    CameraOperationImpl cameraOperation = new CameraOperationImpl();
    return cameraOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeviceValue createDeviceValue()
  {
    DeviceValueImpl deviceValue = new DeviceValueImpl();
    return deviceValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskSlotValue createDiskSlotValue()
  {
    DiskSlotValueImpl diskSlotValue = new DiskSlotValueImpl();
    return diskSlotValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableValue createVariableValue()
  {
    VariableValueImpl variableValue = new VariableValueImpl();
    return variableValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskStateValue createDiskStateValue()
  {
    DiskStateValueImpl diskStateValue = new DiskStateValueImpl();
    return diskStateValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskSlotStateValue createDiskSlotStateValue()
  {
    DiskSlotStateValueImpl diskSlotStateValue = new DiskSlotStateValueImpl();
    return diskSlotStateValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColorValue createColorValue()
  {
    ColorValueImpl colorValue = new ColorValueImpl();
    return colorValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public xtext.factoryLang.factoryLang.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Crane createCrane()
  {
    CraneImpl crane = new CraneImpl();
    return crane;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CranePositionParameter createCranePositionParameter()
  {
    CranePositionParameterImpl cranePositionParameter = new CranePositionParameterImpl();
    return cranePositionParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Disk createDisk()
  {
    DiskImpl disk = new DiskImpl();
    return disk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskSlotParameter createDiskSlotParameter()
  {
    DiskSlotParameterImpl diskSlotParameter = new DiskSlotParameterImpl();
    return diskSlotParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskZoneParameter createDiskZoneParameter()
  {
    DiskZoneParameterImpl diskZoneParameter = new DiskZoneParameterImpl();
    return diskZoneParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Camera createCamera()
  {
    CameraImpl camera = new CameraImpl();
    return camera;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CameraColorParameter createCameraColorParameter()
  {
    CameraColorParameterImpl cameraColorParameter = new CameraColorParameterImpl();
    return cameraColorParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeviceConditional createDeviceConditional()
  {
    DeviceConditionalImpl deviceConditional = new DeviceConditionalImpl();
    return deviceConditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableConditional createVariableConditional()
  {
    VariableConditionalImpl variableConditional = new VariableConditionalImpl();
    return variableConditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CranePickupOperation createCranePickupOperation()
  {
    CranePickupOperationImpl cranePickupOperation = new CranePickupOperationImpl();
    return cranePickupOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CraneDropOperation createCraneDropOperation()
  {
    CraneDropOperationImpl craneDropOperation = new CraneDropOperationImpl();
    return craneDropOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskMoveSlotOperation createDiskMoveSlotOperation()
  {
    DiskMoveSlotOperationImpl diskMoveSlotOperation = new DiskMoveSlotOperationImpl();
    return diskMoveSlotOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskMoveVariableSlotOperation createDiskMoveVariableSlotOperation()
  {
    DiskMoveVariableSlotOperationImpl diskMoveVariableSlotOperation = new DiskMoveVariableSlotOperationImpl();
    return diskMoveVariableSlotOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskMoveEmptySlotOperation createDiskMoveEmptySlotOperation()
  {
    DiskMoveEmptySlotOperationImpl diskMoveEmptySlotOperation = new DiskMoveEmptySlotOperationImpl();
    return diskMoveEmptySlotOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskMarkSlotOperation createDiskMarkSlotOperation()
  {
    DiskMarkSlotOperationImpl diskMarkSlotOperation = new DiskMarkSlotOperationImpl();
    return diskMarkSlotOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DiskWaitOperation createDiskWaitOperation()
  {
    DiskWaitOperationImpl diskWaitOperation = new DiskWaitOperationImpl();
    return diskWaitOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CameraScanOperation createCameraScanOperation()
  {
    CameraScanOperationImpl cameraScanOperation = new CameraScanOperationImpl();
    return cameraScanOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForEach createForEach()
  {
    ForEachImpl forEach = new ForEachImpl();
    return forEach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalVariable createLocalVariable()
  {
    LocalVariableImpl localVariable = new LocalVariableImpl();
    return localVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalVariable createGlobalVariable()
  {
    GlobalVariableImpl globalVariable = new GlobalVariableImpl();
    return globalVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COMPARISON_OPERATOR createCOMPARISON_OPERATORFromString(EDataType eDataType, String initialValue)
  {
    COMPARISON_OPERATOR result = COMPARISON_OPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCOMPARISON_OPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COLOR createCOLORFromString(EDataType eDataType, String initialValue)
  {
    COLOR result = COLOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCOLORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DISK_SLOT_STATES createDISK_SLOT_STATESFromString(EDataType eDataType, String initialValue)
  {
    DISK_SLOT_STATES result = DISK_SLOT_STATES.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDISK_SLOT_STATESToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DISK_STATES createDISK_STATESFromString(EDataType eDataType, String initialValue)
  {
    DISK_STATES result = DISK_STATES.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDISK_STATESToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TIME createTIMEFromString(EDataType eDataType, String initialValue)
  {
    TIME result = TIME.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTIMEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FactoryLangPackage getFactoryLangPackage()
  {
    return (FactoryLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FactoryLangPackage getPackage()
  {
    return FactoryLangPackage.eINSTANCE;
  }

} //FactoryLangFactoryImpl