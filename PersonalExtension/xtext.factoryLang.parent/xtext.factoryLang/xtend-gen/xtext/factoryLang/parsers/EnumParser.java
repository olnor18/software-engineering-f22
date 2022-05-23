package xtext.factoryLang.parsers;

import com.google.common.base.Objects;
import xtext.factoryLang.factoryLang.COLOR;
import xtext.factoryLang.factoryLang.COMPARISON_OPERATOR;
import xtext.factoryLang.factoryLang.DISK_SLOT_STATES;
import xtext.factoryLang.factoryLang.DISK_STATES;
import xtext.factoryLang.factoryLang.impl.DiskMarkSlotOperationImpl;
import xtext.factoryLang.factoryLang.impl.ForEachImpl;
import xtext.factoryLang.factoryLang.impl.GlobalVariableImpl;
import xtext.factoryLang.factoryLang.impl.LocalVariableImpl;

@SuppressWarnings("all")
public class EnumParser {
  public static CharSequence parseDiskSlotState(final DISK_SLOT_STATES diskSlotState, final Class<?> originClass) {
    String _switchResult = null;
    boolean _matched = false;
    if (Objects.equal(originClass, ForEachImpl.class)) {
      _matched=true;
      String _switchResult_1 = null;
      if (diskSlotState != null) {
        switch (diskSlotState) {
          case FREE:
            _switchResult_1 = "GetSlotsWithMark(SlotState.Empty)";
            break;
          case IN_PROGRESS:
            _switchResult_1 = "GetSlotsWithMark(SlotState.InProgress)";
            break;
          case COMPLETE:
            _switchResult_1 = "GetSlotsWithMark(SlotState.Complete)";
            break;
          default:
            break;
        }
      }
      _switchResult = _switchResult_1;
    }
    if (!_matched) {
      if (Objects.equal(originClass, DiskMarkSlotOperationImpl.class)) {
        _matched=true;
        String _switchResult_2 = null;
        if (diskSlotState != null) {
          switch (diskSlotState) {
            case FREE:
              _switchResult_2 = "SlotState.Empty";
              break;
            case IN_PROGRESS:
              _switchResult_2 = "SlotState.InProgress";
              break;
            case COMPLETE:
              _switchResult_2 = "SlotState.Complete";
              break;
            default:
              break;
          }
        }
        _switchResult = _switchResult_2;
      }
    }
    return _switchResult;
  }
  
  public static CharSequence parseColor(final COLOR color, final Class<?> originClass) {
    String _switchResult = null;
    boolean _matched = false;
    if (Objects.equal(originClass, LocalVariableImpl.class)) {
      _matched=true;
      String _switchResult_1 = null;
      if (color != null) {
        switch (color) {
          case RED:
            _switchResult_1 = "HasMark(\"RED\")";
            break;
          case GREEN:
            _switchResult_1 = "HasMark(\"GREEN\")";
            break;
          case BLUE:
            _switchResult_1 = "HasMark(\"BLUE\")";
            break;
          default:
            break;
        }
      }
      _switchResult = _switchResult_1;
    }
    if (!_matched) {
      if (Objects.equal(originClass, GlobalVariableImpl.class)) {
        _matched=true;
        String _switchResult_2 = null;
        if (color != null) {
          switch (color) {
            case RED:
              _switchResult_2 = "RED";
              break;
            case GREEN:
              _switchResult_2 = "GREEN";
              break;
            case BLUE:
              _switchResult_2 = "BLUE";
              break;
            default:
              break;
          }
        }
        _switchResult = _switchResult_2;
      }
    }
    return _switchResult;
  }
  
  public static CharSequence parseDiskState(final DISK_STATES diskState, final Class<?> originClass) {
    String _switchResult = null;
    if (diskState != null) {
      switch (diskState) {
        case FULL:
          String _xifexpression = null;
          if ((originClass != null)) {
            _xifexpression = "IsFull()";
          } else {
            _xifexpression = "full";
          }
          _switchResult = _xifexpression;
          break;
        case EMPTY:
          String _xifexpression_1 = null;
          if ((originClass != null)) {
            _xifexpression_1 = "IsEmpty()";
          } else {
            _xifexpression_1 = "empty";
          }
          _switchResult = _xifexpression_1;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static CharSequence parseComparisonOperator(final COMPARISON_OPERATOR operator) {
    String _switchResult = null;
    if (operator != null) {
      switch (operator) {
        case GREATER_THAN:
          _switchResult = ">";
          break;
        case LESS_THAN:
          _switchResult = "<";
          break;
        case NOT:
          _switchResult = "!=";
          break;
        default:
          _switchResult = "==";
          break;
      }
    } else {
      _switchResult = "==";
    }
    return _switchResult;
  }
}
