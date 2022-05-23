package xtext.factoryLang.parsers;

import xtext.factoryLang.factoryLang.Camera;
import xtext.factoryLang.factoryLang.Crane;
import xtext.factoryLang.factoryLang.Device;
import xtext.factoryLang.factoryLang.Disk;

@SuppressWarnings("all")
public class TypeParser {
  public static CharSequence parseDeviceType(final Device device, final boolean isPlural) {
    String _switchResult = null;
    boolean _matched = false;
    if (device instanceof Crane) {
      _matched=true;
      String _xifexpression = null;
      if (isPlural) {
        _xifexpression = "cranes";
      } else {
        _xifexpression = "crane";
      }
      _switchResult = _xifexpression;
    }
    if (!_matched) {
      if (device instanceof Disk) {
        _matched=true;
        String _xifexpression = null;
        if (isPlural) {
          _xifexpression = "disks";
        } else {
          _xifexpression = "disk";
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (device instanceof Camera) {
        _matched=true;
        String _xifexpression = null;
        if (isPlural) {
          _xifexpression = "cameras";
        } else {
          _xifexpression = "camera";
        }
        _switchResult = _xifexpression;
      }
    }
    return _switchResult;
  }
}
