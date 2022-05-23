package xtext.factoryLang.parsers;

import org.eclipse.emf.ecore.EObject;
import xtext.factoryLang.factoryLang.ColorValue;
import xtext.factoryLang.factoryLang.CranePositionParameter;
import xtext.factoryLang.factoryLang.DeviceValue;
import xtext.factoryLang.factoryLang.DiskSlotStateValue;
import xtext.factoryLang.factoryLang.DiskSlotValue;
import xtext.factoryLang.factoryLang.DiskStateValue;
import xtext.factoryLang.factoryLang.DiskZoneParameter;
import xtext.factoryLang.factoryLang.Parameter;
import xtext.factoryLang.factoryLang.Variable;
import xtext.factoryLang.factoryLang.VariableValue;

@SuppressWarnings("all")
public class ValueParser {
  public static CharSequence parseDeviceValue(final DeviceValue deviceValue, final Class<?> originClass) {
    CharSequence _xblockexpression = null;
    {
      Parameter _ref = deviceValue.getRef();
      boolean _matched = false;
      if (_ref instanceof CranePositionParameter) {
        _matched=true;
        Parameter _ref_1 = deviceValue.getRef();
        ((CranePositionParameter) _ref_1).getName();
      }
      if (!_matched) {
        if (_ref instanceof DiskZoneParameter) {
          _matched=true;
          Parameter _ref_1 = deviceValue.getRef();
          ((DiskZoneParameter) _ref_1).getName();
        }
      }
      CharSequence _switchResult_1 = null;
      EObject _value = deviceValue.getValue();
      boolean _matched_1 = false;
      if (_value instanceof DiskStateValue) {
        _matched_1=true;
        EObject _value_1 = deviceValue.getValue();
        _switchResult_1 = EnumParser.parseDiskState(((DiskStateValue) _value_1).getValue(), originClass);
      }
      if (!_matched_1) {
        if (_value instanceof ColorValue) {
          _matched_1=true;
          EObject _value_1 = deviceValue.getValue();
          _switchResult_1 = EnumParser.parseColor(((ColorValue) _value_1).getValue(), originClass);
        }
      }
      _xblockexpression = _switchResult_1;
    }
    return _xblockexpression;
  }
  
  public static CharSequence parseVariableValue(final VariableValue variableValue, final Class<?> originClass) {
    CharSequence _xblockexpression = null;
    {
      Variable _ref = variableValue.getRef();
      boolean _tripleNotEquals = (_ref != null);
      if (_tripleNotEquals) {
        return variableValue.getRef().getName();
      }
      CharSequence _switchResult = null;
      EObject _value = variableValue.getValue();
      boolean _matched = false;
      if (_value instanceof DiskSlotStateValue) {
        _matched=true;
        EObject _value_1 = variableValue.getValue();
        _switchResult = EnumParser.parseDiskSlotState(((DiskSlotStateValue) _value_1).getValue(), originClass);
      }
      if (!_matched) {
        if (_value instanceof ColorValue) {
          _matched=true;
          EObject _value_1 = variableValue.getValue();
          _switchResult = EnumParser.parseColor(((ColorValue) _value_1).getValue(), originClass);
        }
      }
      if (!_matched) {
        if (_value instanceof xtext.factoryLang.factoryLang.Number) {
          _matched=true;
          String _xifexpression = null;
          if ((originClass != null)) {
            EObject _value_1 = variableValue.getValue();
            int _value_2 = ((xtext.factoryLang.factoryLang.Number) _value_1).getValue();
            String _plus = ("HasMark(" + Integer.valueOf(_value_2));
            _xifexpression = (_plus + ")");
          } else {
            EObject _value_3 = variableValue.getValue();
            _xifexpression = Integer.valueOf(((xtext.factoryLang.factoryLang.Number) _value_3).getValue()).toString();
          }
          _switchResult = _xifexpression;
        }
      }
      if (!_matched) {
        if (_value instanceof DiskStateValue) {
          _matched=true;
          EObject _value_1 = variableValue.getValue();
          _switchResult = EnumParser.parseDiskState(((DiskStateValue) _value_1).getValue(), originClass);
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static CharSequence parseDiskSlotValue(final DiskSlotValue diskSlotValue, final Class<?> originClass) {
    CharSequence _xblockexpression = null;
    {
      Variable _ref = diskSlotValue.getRef();
      boolean _tripleNotEquals = (_ref != null);
      if (_tripleNotEquals) {
        return diskSlotValue.getRef().getName();
      }
      CharSequence _switchResult = null;
      EObject _value = diskSlotValue.getValue();
      boolean _matched = false;
      if (_value instanceof DiskSlotStateValue) {
        _matched=true;
        EObject _value_1 = diskSlotValue.getValue();
        _switchResult = EnumParser.parseDiskSlotState(((DiskSlotStateValue) _value_1).getValue(), originClass);
      }
      if (!_matched) {
        if (_value instanceof ColorValue) {
          _matched=true;
          EObject _value_1 = diskSlotValue.getValue();
          _switchResult = EnumParser.parseColor(((ColorValue) _value_1).getValue(), originClass);
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
