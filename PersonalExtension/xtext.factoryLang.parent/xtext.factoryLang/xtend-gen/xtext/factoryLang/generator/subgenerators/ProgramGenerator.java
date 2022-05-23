package xtext.factoryLang.generator.subgenerators;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import xtext.factoryLang.factoryLang.COLOR;
import xtext.factoryLang.factoryLang.Camera;
import xtext.factoryLang.factoryLang.CameraColorParameter;
import xtext.factoryLang.factoryLang.CameraScanOperation;
import xtext.factoryLang.factoryLang.Crane;
import xtext.factoryLang.factoryLang.CraneDropOperation;
import xtext.factoryLang.factoryLang.CraneParameter;
import xtext.factoryLang.factoryLang.CranePickupOperation;
import xtext.factoryLang.factoryLang.CranePositionParameter;
import xtext.factoryLang.factoryLang.Device;
import xtext.factoryLang.factoryLang.DeviceConditional;
import xtext.factoryLang.factoryLang.Disk;
import xtext.factoryLang.factoryLang.DiskMarkSlotOperation;
import xtext.factoryLang.factoryLang.DiskMoveEmptySlotOperation;
import xtext.factoryLang.factoryLang.DiskMoveSlotOperation;
import xtext.factoryLang.factoryLang.DiskMoveVariableSlotOperation;
import xtext.factoryLang.factoryLang.DiskParameter;
import xtext.factoryLang.factoryLang.DiskSlotParameter;
import xtext.factoryLang.factoryLang.DiskWaitOperation;
import xtext.factoryLang.factoryLang.DiskZoneParameter;
import xtext.factoryLang.factoryLang.ForEach;
import xtext.factoryLang.factoryLang.Parameter;
import xtext.factoryLang.factoryLang.Statement;
import xtext.factoryLang.factoryLang.Variable;
import xtext.factoryLang.factoryLang.VariableConditional;
import xtext.factoryLang.factoryLang.impl.GlobalVariableImpl;
import xtext.factoryLang.parsers.EnumParser;
import xtext.factoryLang.parsers.ValueParser;

@SuppressWarnings("all")
public class ProgramGenerator {
  public static void generate(final IFileSystemAccess2 fsa, final List<Device> devices, final List<Statement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("using System;");
    _builder.newLine();
    _builder.append("using Entities;");
    _builder.newLine();
    _builder.append("using Mqtt;");
    _builder.newLine();
    _builder.newLine();
    CharSequence _generateVariables = ProgramGenerator.generateVariables();
    _builder.append(_generateVariables);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateMainLoop = ProgramGenerator.generateMainLoop();
    _builder.append(_generateMainLoop);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateSetupMethod = ProgramGenerator.generateSetupMethod(devices);
    _builder.append(_generateSetupMethod);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _generateRunMethod = ProgramGenerator.generateRunMethod(devices, statements);
    _builder.append(_generateRunMethod);
    _builder.newLineIfNotEmpty();
    fsa.generateFile(
      "OrchestratorService/Program.cs", _builder);
  }
  
  protected static CharSequence generateVariables() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#region Variables");
    _builder.newLine();
    _builder.append("IMqttService mqtt = new MqttService();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Dictionary<string, Crane> cranes = new();");
    _builder.newLine();
    _builder.append("Dictionary<string, Disk> disks = new();");
    _builder.newLine();
    _builder.append("Dictionary<string, Camera> cameras = new();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bool running = true;");
    _builder.newLine();
    _builder.append("#endregion");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence generateMainLoop() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#region Main");
    _builder.newLine();
    _builder.append("Setup();");
    _builder.newLine();
    _builder.append("Run().GetAwaiter().GetResult();");
    _builder.newLine();
    _builder.append("#endregion");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence generateSetupMethod(final List<Device> devices) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void Setup()");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    final Function1<Device, Boolean> _function = (Device it) -> {
      return Boolean.valueOf((it instanceof Crane));
    };
    final Function1<Device, Crane> _function_1 = (Device it) -> {
      return ((Crane) it);
    };
    CharSequence _generateCranes = ProgramGenerator.generateCranes(IterableExtensions.<Crane>toList(IterableExtensions.<Device, Crane>map(IterableExtensions.<Device>filter(devices, _function), _function_1)));
    _builder.append(_generateCranes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    final Function1<Device, Boolean> _function_2 = (Device it) -> {
      return Boolean.valueOf((it instanceof Disk));
    };
    final Function1<Device, Disk> _function_3 = (Device it) -> {
      return ((Disk) it);
    };
    CharSequence _generateDisks = ProgramGenerator.generateDisks(IterableExtensions.<Disk>toList(IterableExtensions.<Device, Disk>map(IterableExtensions.<Device>filter(devices, _function_2), _function_3)));
    _builder.append(_generateDisks, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    final Function1<Device, Boolean> _function_4 = (Device it) -> {
      return Boolean.valueOf((it instanceof Camera));
    };
    final Function1<Device, Camera> _function_5 = (Device it) -> {
      return ((Camera) it);
    };
    CharSequence _generateCameras = ProgramGenerator.generateCameras(IterableExtensions.<Camera>toList(IterableExtensions.<Device, Camera>map(IterableExtensions.<Device>filter(devices, _function_4), _function_5)));
    _builder.append(_generateCameras, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence generateCranes(final List<Crane> cranes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = cranes.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          for(final Crane crane : cranes) {
            _builder.append("cranes.Add(\"");
            String _name = crane.getName();
            _builder.append(_name);
            _builder.append("\", new Crane(\"");
            String _name_1 = crane.getName();
            _builder.append(_name_1);
            _builder.append("\", new Dictionary<string, int>()");
            _builder.newLineIfNotEmpty();
            _builder.append("{");
            _builder.newLine();
            {
              final Function1<Parameter, CranePositionParameter> _function = (Parameter it) -> {
                return ((CranePositionParameter) it);
              };
              List<CranePositionParameter> _map = ListExtensions.<Parameter, CranePositionParameter>map(crane.getTargets(), _function);
              boolean _hasElements = false;
              for(final CranePositionParameter target : _map) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(",", "\t");
                }
                _builder.append("\t");
                _builder.append("{\"");
                String _name_2 = target.getName();
                _builder.append(_name_2, "\t");
                _builder.append("\", ");
                int _degree = target.getDegree();
                _builder.append(_degree, "\t");
                _builder.append("}");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("}, mqtt));");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  protected static CharSequence generateDisks(final List<Disk> disks) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = disks.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          for(final Disk disk : disks) {
            _builder.append("disks.Add(\"");
            String _name = disk.getName();
            _builder.append(_name);
            _builder.append("\", new Disk(\"");
            String _name_1 = disk.getName();
            _builder.append(_name_1);
            _builder.append("\", ");
            DiskParameter _slotParameter = disk.getSlotParameter();
            int _size_1 = ((DiskSlotParameter) _slotParameter).getSize();
            _builder.append(_size_1);
            _builder.append(", new Dictionary<string, int>()");
            _builder.newLineIfNotEmpty();
            _builder.append("{");
            _builder.newLine();
            {
              final Function1<Parameter, DiskZoneParameter> _function = (Parameter it) -> {
                return ((DiskZoneParameter) it);
              };
              List<DiskZoneParameter> _map = ListExtensions.<Parameter, DiskZoneParameter>map(disk.getTargets(), _function);
              boolean _hasElements = false;
              for(final DiskZoneParameter target : _map) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(",", "\t");
                }
                _builder.append("\t");
                _builder.append("{\"");
                String _name_2 = target.getName();
                _builder.append(_name_2, "\t");
                _builder.append("\", ");
                int _slot = target.getSlot();
                _builder.append(_slot, "\t");
                _builder.append("}");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("}, mqtt));");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  protected static CharSequence generateCameras(final List<Camera> cameras) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = cameras.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          for(final Camera camera : cameras) {
            _builder.append("cameras.Add(\"");
            String _name = camera.getName();
            _builder.append(_name);
            _builder.append("\", new Camera(\"");
            String _name_1 = camera.getName();
            _builder.append(_name_1);
            _builder.append("\", new List<string>()");
            _builder.newLineIfNotEmpty();
            _builder.append("{");
            _builder.newLine();
            {
              final Function1<Parameter, CameraColorParameter> _function = (Parameter it) -> {
                return ((CameraColorParameter) it);
              };
              List<CameraColorParameter> _map = ListExtensions.<Parameter, CameraColorParameter>map(camera.getTargets(), _function);
              boolean _hasElements = false;
              for(final CameraColorParameter target : _map) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(",", "\t");
                }
                _builder.append("\t");
                _builder.append("\"");
                COLOR _color = target.getColor();
                _builder.append(_color, "\t");
                _builder.append("\"");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("}, mqtt));");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  protected static CharSequence generateRunMethod(final List<Device> devices, final List<Statement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("async Task Run()\t");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    {
      final Function1<Device, Boolean> _function = (Device it) -> {
        return Boolean.valueOf((it instanceof Crane));
      };
      final Function1<Device, Crane> _function_1 = (Device it) -> {
        return ((Crane) it);
      };
      List<Crane> _list = IterableExtensions.<Crane>toList(IterableExtensions.<Device, Crane>map(IterableExtensions.<Device>filter(devices, _function), _function_1));
      for(final Crane crane : _list) {
        _builder.append("\t");
        _builder.append("var ");
        String _name = crane.getName();
        _builder.append(_name, "\t");
        _builder.append(" = cranes[\"");
        String _name_1 = crane.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<Device, Boolean> _function_2 = (Device it) -> {
        return Boolean.valueOf((it instanceof Disk));
      };
      final Function1<Device, Disk> _function_3 = (Device it) -> {
        return ((Disk) it);
      };
      List<Disk> _list_1 = IterableExtensions.<Disk>toList(IterableExtensions.<Device, Disk>map(IterableExtensions.<Device>filter(devices, _function_2), _function_3));
      for(final Disk disk : _list_1) {
        _builder.append("\t");
        _builder.append("var ");
        String _name_2 = disk.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" = disks[\"");
        String _name_3 = disk.getName();
        _builder.append(_name_3, "\t");
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      final Function1<Device, Boolean> _function_4 = (Device it) -> {
        return Boolean.valueOf((it instanceof Camera));
      };
      final Function1<Device, Camera> _function_5 = (Device it) -> {
        return ((Camera) it);
      };
      List<Camera> _list_2 = IterableExtensions.<Camera>toList(IterableExtensions.<Device, Camera>map(IterableExtensions.<Device>filter(devices, _function_4), _function_5));
      for(final Camera camera : _list_2) {
        _builder.append("\t");
        _builder.append("var ");
        String _name_4 = camera.getName();
        _builder.append(_name_4, "\t");
        _builder.append(" = cameras[\"");
        String _name_5 = camera.getName();
        _builder.append(_name_5, "\t");
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("while (running)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    {
      for(final Statement statement : statements) {
        _builder.append("\t\t");
        CharSequence _generateStatement = ProgramGenerator.generateStatement(statement);
        _builder.append(_generateStatement, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected static CharSequence generateStatement(final Statement statement) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (statement instanceof ForEach) {
      _matched=true;
      CharSequence _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        {
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(((ForEach)statement).getOperator());
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            _builder.append("!");
          }
        }
        final String optionalNotOperator = _builder.toString();
        CharSequence _parseVariableValue = ValueParser.parseVariableValue(((ForEach)statement).getVariableValue(), ((ForEach)statement).getClass());
        final String methodCalledOnBoundVariable = (optionalNotOperator + _parseVariableValue);
        StringConcatenation _builder_1 = new StringConcatenation();
        String _name = ((ForEach)statement).getDevice().getName();
        _builder_1.append(_name);
        _builder_1.append(".");
        _builder_1.append(methodCalledOnBoundVariable);
        final String filteredDevice = _builder_1.toString();
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("foreach (var ");
        String _name_1 = ((ForEach)statement).getVariable().getName();
        _builder_2.append(_name_1);
        _builder_2.append(" in ");
        _builder_2.append(filteredDevice);
        _builder_2.append(")");
        _builder_2.newLineIfNotEmpty();
        _builder_2.append("{");
        _builder_2.newLine();
        {
          EList<Statement> _statements = ((ForEach)statement).getStatements();
          for(final Statement nestedStatement : _statements) {
            _builder_2.append("\t");
            CharSequence _generateStatement = ProgramGenerator.generateStatement(nestedStatement);
            _builder_2.append(_generateStatement, "\t");
            _builder_2.newLineIfNotEmpty();
          }
        }
        _builder_2.append("}");
        _builder_2.newLine();
        _xblockexpression = _builder_2;
      }
      _switchResult = _xblockexpression;
    }
    if (!_matched) {
      if (statement instanceof DeviceConditional) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          {
            boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(((DeviceConditional)statement).getNot_operator());
            boolean _not = (!_isNullOrEmpty);
            if (_not) {
              _builder.append("!");
            }
          }
          final String optionalNotOperator = _builder.toString();
          final String deviceName = ((DeviceConditional)statement).getDevice().getName();
          final CharSequence methodCalledOnBoundVariable = ValueParser.parseDeviceValue(((DeviceConditional)statement).getDeviceValue(), 
            ((DeviceConditional)statement).getClass());
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("if (");
          _builder_1.append(optionalNotOperator);
          _builder_1.append(deviceName);
          _builder_1.append(".");
          _builder_1.append(methodCalledOnBoundVariable);
          _builder_1.append(")");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("{");
          _builder_1.newLine();
          {
            EList<Statement> _statements = ((DeviceConditional)statement).getStatements();
            for(final Statement nestedStatement : _statements) {
              _builder_1.append("\t");
              CharSequence _generateStatement = ProgramGenerator.generateStatement(nestedStatement);
              _builder_1.append(_generateStatement, "\t");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append("}");
          _builder_1.newLine();
          _xblockexpression = _builder_1;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof VariableConditional) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String variableName = ((VariableConditional)statement).getVariable().getName();
          final Class<? extends Variable> variableType = ((VariableConditional)statement).getVariable().getClass();
          String _xifexpression = null;
          boolean _equals = Objects.equal(variableType, GlobalVariableImpl.class);
          if (_equals) {
            CharSequence _parseComparisonOperator = EnumParser.parseComparisonOperator(((VariableConditional)statement).getComparison_operator());
            String _plus = (" " + _parseComparisonOperator);
            _xifexpression = (_plus + " ");
          } else {
            _xifexpression = ".";
          }
          final String dotOrComparisonOperator = _xifexpression;
          String _xifexpression_1 = null;
          boolean _equals_1 = Objects.equal(variableType, GlobalVariableImpl.class);
          if (_equals_1) {
            _xifexpression_1 = "\"";
          } else {
            _xifexpression_1 = "";
          }
          final String conditionalQuotationMark = _xifexpression_1;
          final CharSequence variableValue = ValueParser.parseVariableValue(((VariableConditional)statement).getVariableValue(), variableType);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("if (");
          _builder.append(variableName);
          _builder.append(dotOrComparisonOperator);
          _builder.append(conditionalQuotationMark);
          _builder.append(variableValue);
          _builder.append(conditionalQuotationMark);
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("{");
          _builder.newLine();
          {
            EList<Statement> _statements = ((VariableConditional)statement).getStatements();
            for(final Statement nestedStatement : _statements) {
              _builder.append("\t");
              CharSequence _generateStatement = ProgramGenerator.generateStatement(nestedStatement);
              _builder.append(_generateStatement, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("}");
          _builder.newLine();
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof CranePickupOperation) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String deviceName = ((CranePickupOperation)statement).getDevice().getName();
          CraneParameter _target = ((CranePickupOperation)statement).getTarget();
          final String targetName = ((CranePositionParameter) _target).getName();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("await ");
          _builder.append(deviceName);
          _builder.append(".GoTo(\"");
          _builder.append(targetName);
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _builder.append("await ");
          _builder.append(deviceName);
          _builder.append(".PickupItem();");
          _builder.newLineIfNotEmpty();
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof CraneDropOperation) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String deviceName = ((CraneDropOperation)statement).getDevice().getName();
          CraneParameter _target = ((CraneDropOperation)statement).getTarget();
          final String targetName = ((CranePositionParameter) _target).getName();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("await ");
          _builder.append(deviceName);
          _builder.append(".GoTo(\"");
          _builder.append(targetName);
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _builder.append("await ");
          _builder.append(deviceName);
          _builder.append(".DropItem();");
          _builder.newLineIfNotEmpty();
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof DiskMarkSlotOperation) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String deviceName = ((DiskMarkSlotOperation)statement).getDevice().getName();
          final String targetName = ((DiskMarkSlotOperation)statement).getTarget().getName();
          final CharSequence diskSlotValue = ValueParser.parseDiskSlotValue(((DiskMarkSlotOperation)statement).getDiskSlotValue(), ((DiskMarkSlotOperation)statement).getClass());
          final int quantity = ((DiskMarkSlotOperation)statement).getQuantity();
          StringConcatenation _builder = new StringConcatenation();
          {
            if ((quantity > 0)) {
              _builder.append("Task.Run(async () =>");
              _builder.newLine();
              _builder.append("{");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("await Task.Delay(");
              _builder.append((quantity * 1000), "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append(deviceName, "\t");
              _builder.append(".MarkSlot(\"");
              _builder.append(targetName, "\t");
              _builder.append("\", ");
              _builder.append(diskSlotValue, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              _builder.append("});");
              _builder.newLine();
            } else {
              _builder.append(deviceName);
              _builder.append(".MarkSlot(\"");
              _builder.append(targetName);
              _builder.append("\", ");
              _builder.append(diskSlotValue);
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof DiskMoveVariableSlotOperation) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String deviceName = ((DiskMoveVariableSlotOperation)statement).getDevice().getName();
          final String variableName = ((DiskMoveVariableSlotOperation)statement).getVariable().getName();
          final String targetName = ((DiskMoveVariableSlotOperation)statement).getTarget().getName();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("await ");
          _builder.append(deviceName);
          _builder.append(".MoveSlot(");
          _builder.append(variableName);
          _builder.append(".Number, \"");
          _builder.append(targetName);
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof DiskMoveEmptySlotOperation) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String deviceName = ((DiskMoveEmptySlotOperation)statement).getDevice().getName();
          final String targetName = ((DiskMoveEmptySlotOperation)statement).getTarget().getName();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("await ");
          _builder.append(deviceName);
          _builder.append(".MoveSlot(");
          _builder.append(deviceName);
          _builder.append(".GetEmptySlotNumber(), \"");
          _builder.append(targetName);
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof DiskMoveSlotOperation) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String deviceName = ((DiskMoveSlotOperation)statement).getDevice().getName();
          final String sourceName = ((DiskMoveSlotOperation)statement).getSource().getName();
          final String targetName = ((DiskMoveSlotOperation)statement).getTarget().getName();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("await ");
          _builder.append(deviceName);
          _builder.append(".MoveSlot(\"");
          _builder.append(sourceName);
          _builder.append("\", \"");
          _builder.append(targetName);
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof DiskWaitOperation) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String deviceName = ((DiskWaitOperation)statement).getDevice().getName();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("await ");
          _builder.append(deviceName);
          _builder.append(".WaitForIntake();");
          _builder.newLineIfNotEmpty();
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (statement instanceof CameraScanOperation) {
        _matched=true;
        CharSequence _xblockexpression = null;
        {
          final String deviceName = ((CameraScanOperation)statement).getDevice().getName();
          final String variableName = ((CameraScanOperation)statement).getVariable().getName();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("var ");
          _builder.append(variableName);
          _builder.append(" = await ");
          _builder.append(deviceName);
          _builder.append(".Scan();");
          _builder.newLineIfNotEmpty();
          _xblockexpression = _builder;
        }
        _switchResult = _xblockexpression;
      }
    }
    return _switchResult;
  }
}
