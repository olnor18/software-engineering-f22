package xtext.factoryLang.generator.subgenerators;

import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import xtext.factoryLang.factoryLang.Camera;
import xtext.factoryLang.factoryLang.Conditional;
import xtext.factoryLang.factoryLang.Configuration;
import xtext.factoryLang.factoryLang.Crane;
import xtext.factoryLang.factoryLang.CranePositionParameter;
import xtext.factoryLang.factoryLang.DISK_SLOT_STATES;
import xtext.factoryLang.factoryLang.DISK_STATES;
import xtext.factoryLang.factoryLang.Device;
import xtext.factoryLang.factoryLang.Disk;
import xtext.factoryLang.factoryLang.DiskParameter;
import xtext.factoryLang.factoryLang.DiskSlotParameter;
import xtext.factoryLang.factoryLang.DiskSlotStateValue;
import xtext.factoryLang.factoryLang.DiskZoneParameter;
import xtext.factoryLang.factoryLang.ForEach;
import xtext.factoryLang.factoryLang.Model;
import xtext.factoryLang.factoryLang.Parameter;
import xtext.factoryLang.factoryLang.Statement;

@SuppressWarnings("all")
public class UppaalGenerator {
  public static List<Statement> statementsIndexer;
  
  private static Map<String, String> locationIds = new HashMap<String, String>();
  
  public static void generate(final IFileSystemAccess2 fsa, final Resource resource) {
    final Model model = Iterators.<Model>filter(resource.getAllContents(), Model.class).next();
    final Function1<Configuration, Device> _function = (Configuration it) -> {
      return it.getDevice();
    };
    final Function1<Device, Boolean> _function_1 = (Device it) -> {
      return Boolean.valueOf((it instanceof Disk));
    };
    final Function1<Device, Disk> _function_2 = (Device x) -> {
      return ((Disk) x);
    };
    final Iterable<Disk> discs = IterableExtensions.<Device, Disk>map(IterableExtensions.<Device>filter(ListExtensions.<Configuration, Device>map(model.getConfigurations(), _function), _function_1), _function_2);
    final Function1<Configuration, Device> _function_3 = (Configuration it) -> {
      return it.getDevice();
    };
    final Function1<Device, Boolean> _function_4 = (Device it) -> {
      return Boolean.valueOf((it instanceof Crane));
    };
    final Function1<Device, Crane> _function_5 = (Device x) -> {
      return ((Crane) x);
    };
    final Iterable<Crane> cranes = IterableExtensions.<Device, Crane>map(IterableExtensions.<Device>filter(ListExtensions.<Configuration, Device>map(model.getConfigurations(), _function_3), _function_4), _function_5);
    final Function1<Configuration, Device> _function_6 = (Configuration it) -> {
      return it.getDevice();
    };
    final Function1<Device, Boolean> _function_7 = (Device it) -> {
      return Boolean.valueOf((it instanceof Camera));
    };
    final Function1<Device, Camera> _function_8 = (Device x) -> {
      return ((Camera) x);
    };
    final Iterable<Camera> cameras = IterableExtensions.<Device, Camera>map(IterableExtensions.<Device>filter(ListExtensions.<Configuration, Device>map(model.getConfigurations(), _function_6), _function_7), _function_8);
    final Function1<DiskSlotStateValue, DISK_SLOT_STATES> _function_9 = (DiskSlotStateValue it) -> {
      return it.getValue();
    };
    final Function1<DISK_SLOT_STATES, String> _function_10 = (DISK_SLOT_STATES it) -> {
      return it.toString();
    };
    final Iterable<String> discSlotStateValues = IterableExtensions.<DISK_SLOT_STATES, String>map(IteratorExtensions.<DISK_SLOT_STATES>toSet(IteratorExtensions.<DiskSlotStateValue, DISK_SLOT_STATES>map(Iterators.<DiskSlotStateValue>filter(resource.getAllContents(), DiskSlotStateValue.class), _function_9)), _function_10);
    UppaalGenerator.statementsIndexer = UppaalGenerator.getStatements(model.getStatements());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE nta PUBLIC \'-//Uppaal Team//DTD Flat System 1.1//EN\' \'http://www.it.uu.se/research/group/darts/uppaal/flat-1_2.dtd\'>");
    _builder.newLine();
    _builder.append("<nta>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<declaration>");
    _builder.newLine();
    {
      for(final Disk disc : discs) {
        _builder.append("//");
        String _name = disc.getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("const int ");
        String _name_1 = disc.getName();
        _builder.append(_name_1);
        _builder.append("_numberOfSlots = ");
        DiskParameter _slotParameter = disc.getSlotParameter();
        int _size = ((DiskSlotParameter) _slotParameter).getSize();
        _builder.append(_size);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("typedef int[0,");
        String _name_2 = disc.getName();
        _builder.append(_name_2);
        _builder.append("_numberOfSlots-1] ");
        String _name_3 = disc.getName();
        _builder.append(_name_3);
        _builder.append("_id_t;");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_4 = disc.getName();
        _builder.append(_name_4);
        _builder.append("_goto[");
        String _name_5 = disc.getName();
        _builder.append(_name_5);
        _builder.append("_numberOfSlots];");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_6 = disc.getName();
        _builder.append(_name_6);
        _builder.append("_addItemCmd, ");
        String _name_7 = disc.getName();
        _builder.append(_name_7);
        _builder.append("_removeItemCmd;");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_8 = disc.getName();
        _builder.append(_name_8);
        _builder.append("_addItem[");
        String _name_9 = disc.getName();
        _builder.append(_name_9);
        _builder.append("_numberOfSlots];");
        _builder.newLineIfNotEmpty();
        _builder.append("broadcast chan ");
        String _name_10 = disc.getName();
        _builder.append(_name_10);
        _builder.append("_removeItem[");
        String _name_11 = disc.getName();
        _builder.append(_name_11);
        _builder.append("_numberOfSlots];");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("//default tags");
        _builder.newLine();
        _builder.append("chan ");
        String _name_12 = disc.getName();
        _builder.append(_name_12);
        _builder.append("_getemptySlot;");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_13 = disc.getName();
        _builder.append(_name_13);
        _builder.append("_foundemptySlot;");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_14 = disc.getName();
        _builder.append(_name_14);
        _builder.append("_setColour[");
        String _name_15 = disc.getName();
        _builder.append(_name_15);
        _builder.append("_numberOfSlots][4];");
        _builder.newLineIfNotEmpty();
        _builder.append("bool ");
        String _name_16 = disc.getName();
        _builder.append(_name_16);
        _builder.append("_notemptySlots[");
        String _name_17 = disc.getName();
        _builder.append(_name_17);
        _builder.append("_numberOfSlots];");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_18 = disc.getName();
        _builder.append(_name_18);
        _builder.append("_getColourSlot[");
        String _name_19 = disc.getName();
        _builder.append(_name_19);
        _builder.append("_numberOfSlots];");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_20 = disc.getName();
        _builder.append(_name_20);
        _builder.append("_gottenColourSlot;");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        {
          for(final String value : discSlotStateValues) {
            _builder.append("//");
            _builder.append(value);
            _builder.append(" tag");
            _builder.newLineIfNotEmpty();
            _builder.append("chan ");
            String _name_21 = disc.getName();
            _builder.append(_name_21);
            _builder.append("_set_");
            _builder.append(value);
            _builder.append("[");
            String _name_22 = disc.getName();
            _builder.append(_name_22);
            _builder.append("_numberOfSlots];");
            _builder.newLineIfNotEmpty();
            _builder.append("chan ");
            String _name_23 = disc.getName();
            _builder.append(_name_23);
            _builder.append("_get");
            _builder.append(value);
            _builder.append("Slot;");
            _builder.newLineIfNotEmpty();
            _builder.append("chan ");
            String _name_24 = disc.getName();
            _builder.append(_name_24);
            _builder.append("_found");
            _builder.append(value);
            _builder.append("Slot;");
            _builder.newLineIfNotEmpty();
            _builder.append("bool ");
            String _name_25 = disc.getName();
            _builder.append(_name_25);
            _builder.append("_not");
            _builder.append(value);
            _builder.append("Slots[");
            String _name_26 = disc.getName();
            _builder.append(_name_26);
            _builder.append("_numberOfSlots] = {");
            {
              DiskParameter _slotParameter_1 = disc.getSlotParameter();
              int _size_1 = ((DiskSlotParameter) _slotParameter_1).getSize();
              IntegerRange _upTo = new IntegerRange(1, _size_1);
              boolean _hasElements = false;
              for(final Integer i : _upTo) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "");
                }
                _builder.append("1");
              }
            }
            _builder.append("};");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        _builder.append("//Zones: ");
        _builder.newLine();
        {
          final Function1<Parameter, Boolean> _function_11 = (Parameter it) -> {
            return Boolean.valueOf((it instanceof DiskZoneParameter));
          };
          final Function1<Parameter, DiskZoneParameter> _function_12 = (Parameter it) -> {
            return ((DiskZoneParameter) it);
          };
          Iterable<DiskZoneParameter> _map = IterableExtensions.<Parameter, DiskZoneParameter>map(IterableExtensions.<Parameter>filter(disc.getTargets(), _function_11), _function_12);
          for(final DiskZoneParameter zone : _map) {
            _builder.append("int ");
            String _name_27 = disc.getName();
            _builder.append(_name_27);
            _builder.append("_zones_");
            String _name_28 = zone.getName();
            _builder.append(_name_28);
            _builder.append(" = ");
            int _slot = zone.getSlot();
            _builder.append(_slot);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      for(final Camera camera : cameras) {
        _builder.append("//");
        String _name_29 = camera.getName();
        _builder.append(_name_29);
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_30 = camera.getName();
        _builder.append(_name_30);
        _builder.append("_getColour;");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_31 = camera.getName();
        _builder.append(_name_31);
        _builder.append("_gottenColour;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final Crane crane : cranes) {
        _builder.append("//");
        String _name_32 = crane.getName();
        _builder.append(_name_32);
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_33 = crane.getName();
        _builder.append(_name_33);
        _builder.append("_toggleMagnet;");
        _builder.newLineIfNotEmpty();
        _builder.append("chan ");
        String _name_34 = crane.getName();
        _builder.append(_name_34);
        _builder.append("_lowerMagnet, ");
        String _name_35 = crane.getName();
        _builder.append(_name_35);
        _builder.append("_raiseMagnet;");
        _builder.newLineIfNotEmpty();
        {
          final Function1<Parameter, Boolean> _function_13 = (Parameter it) -> {
            return Boolean.valueOf((it instanceof CranePositionParameter));
          };
          final Function1<Parameter, CranePositionParameter> _function_14 = (Parameter it) -> {
            return ((CranePositionParameter) it);
          };
          Iterable<CranePositionParameter> _map_1 = IterableExtensions.<Parameter, CranePositionParameter>map(IterableExtensions.<Parameter>filter(crane.getTargets(), _function_13), _function_14);
          for(final CranePositionParameter position : _map_1) {
            _builder.append("chan ");
            String _name_36 = crane.getName();
            _builder.append(_name_36);
            _builder.append("_goto_");
            String _name_37 = position.getName();
            _builder.append(_name_37);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("//-----------------current slot-----------------------------");
    _builder.newLine();
    _builder.append("int currentSlot = -1;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("1: Red");
    _builder.newLine();
    _builder.append("2: Green");
    _builder.newLine();
    _builder.append("3: Blue");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("int colour = 0;");
    _builder.newLine();
    _builder.append("int currentSlot_colour = 0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//--------------------defaults------------------------");
    _builder.newLine();
    _builder.append("clock GlobalTimer;");
    _builder.newLine();
    _builder.append("broadcast chan emergencyStop;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("1: Tried to remove item from empty disc slot");
    _builder.newLine();
    _builder.append("2: Tried to add item to full slot");
    _builder.newLine();
    _builder.append("4:");
    _builder.newLine();
    _builder.append("8:");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("int error;</declaration>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<template>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<name>MasterController</name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<declaration>");
    _builder.newLine();
    _builder.append("clock timer;</declaration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<location id=\"id0\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<name>Idle</name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</location>");
    _builder.newLine();
    {
      EList<Statement> _statements = model.getStatements();
      for(final Statement statement : _statements) {
        _builder.append("\t\t");
        String _generateLocation = UppaalMasterGenerator.generateLocation(statement);
        _builder.append(_generateLocation, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("<init ref=\"id0\"/>");
    _builder.newLine();
    {
      EList<Statement> _statements_1 = model.getStatements();
      for(final Statement statement_1 : _statements_1) {
        _builder.append("\t\t");
        String _generateTransistion = UppaalMasterGenerator.generateTransistion(statement_1);
        _builder.append(_generateTransistion, "\t\t");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</template>");
    _builder.newLine();
    {
      for(final Disk disc_1 : discs) {
        _builder.append("\t");
        String _generate = DiscGenerator.generate(disc_1);
        _builder.append(_generate, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generate_1 = DiscSlotGenerator.generate(disc_1);
        _builder.append(_generate_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generate_2 = DiscGetVariableGenerator.generate(disc_1, DISK_STATES.EMPTY.toString());
        _builder.append(_generate_2, "\t");
        _builder.newLineIfNotEmpty();
        {
          for(final String value_1 : discSlotStateValues) {
            _builder.append("\t");
            String _generate_3 = DiscGetVariableGenerator.generate(disc_1, value_1);
            _builder.append(_generate_3, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            String _generate_4 = DiscVariableGenerator.generate(disc_1, value_1);
            _builder.append(_generate_4, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      for(final Crane crane_1 : cranes) {
        _builder.append("\t");
        String _generateUppaalCraneMagnetTemplate = UppaalCraneMagnetGenerator.generateUppaalCraneMagnetTemplate(crane_1);
        _builder.append(_generateUppaalCraneMagnetTemplate, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generateUppaalCraneTemplate = UppaalCraneGenerator.generateUppaalCraneTemplate(crane_1);
        _builder.append(_generateUppaalCraneTemplate, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      for(final Camera camera_1 : cameras) {
        _builder.append("\t");
        String _generate_5 = CameraGenerator.generate(camera_1);
        _builder.append(_generate_5, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    String _generateUppaalEmergencyButtonTemplate = UppaalEmergencyButtonGenerator.generateUppaalEmergencyButtonTemplate();
    _builder.append(_generateUppaalEmergencyButtonTemplate, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("<system>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("system MasterController, ");
    {
      for(final Disk disc_2 : discs) {
        String _name_38 = disc_2.getName();
        _builder.append(_name_38, "\t");
        _builder.append(", ");
        String _name_39 = disc_2.getName();
        _builder.append(_name_39, "\t");
        _builder.append("_DiscSlot, ");
        String _name_40 = disc_2.getName();
        _builder.append(_name_40, "\t");
        _builder.append("_GetemptySlot, ");
        {
          for(final String value_2 : discSlotStateValues) {
            String _name_41 = disc_2.getName();
            _builder.append(_name_41, "\t");
            _builder.append("_SlotVariable_");
            _builder.append(value_2, "\t");
            _builder.append(", ");
            String _name_42 = disc_2.getName();
            _builder.append(_name_42, "\t");
            _builder.append("_Get");
            _builder.append(value_2, "\t");
            _builder.append("Slot,");
          }
        }
      }
    }
    _builder.append(" ");
    {
      for(final Crane crane_2 : cranes) {
        String _name_43 = crane_2.getName();
        _builder.append(_name_43, "\t");
        _builder.append(",");
        String _name_44 = crane_2.getName();
        _builder.append(_name_44, "\t");
        _builder.append("_CraneMagnet,");
      }
    }
    _builder.append(" ");
    {
      for(final Camera camera_2 : cameras) {
        String _name_45 = camera_2.getName();
        _builder.append(_name_45, "\t");
        _builder.append(",");
      }
    }
    _builder.append(" EmergencyButton;");
    _builder.newLineIfNotEmpty();
    _builder.append("</system>");
    _builder.newLine();
    String _generateUpaalQuery = UppaalQueryGenerator.generateUpaalQuery(IterableExtensions.<Crane>toList(cranes), IterableExtensions.<Disk>toList(discs), IterableExtensions.<Camera>toList(cameras));
    _builder.append(_generateUpaalQuery);
    _builder.newLineIfNotEmpty();
    fsa.generateFile(
      "uppaal/system.xml", _builder);
  }
  
  public static List<Statement> getStatements(final List<Statement> statements) {
    final ArrayList<Statement> result = new ArrayList<Statement>();
    result.addAll(statements);
    for (final Statement s : statements) {
      boolean _matched = false;
      if (s instanceof Conditional) {
        _matched=true;
        result.addAll(UppaalGenerator.getStatements(((Conditional)s).getStatements()));
      }
      if (!_matched) {
        if (s instanceof ForEach) {
          _matched=true;
          result.addAll(UppaalGenerator.getStatements(((ForEach)s).getStatements()));
        }
      }
    }
    return result;
  }
  
  private static int idCounter = 1;
  
  public static String getIdOfLocation(final String location) {
    String value = "";
    boolean _containsKey = UppaalGenerator.locationIds.containsKey(location);
    if (_containsKey) {
      value = UppaalGenerator.locationIds.get(location);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("id");
      int _plusPlus = UppaalGenerator.idCounter++;
      _builder.append(_plusPlus);
      UppaalGenerator.locationIds.put(location, _builder.toString());
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("id");
      _builder_1.append((UppaalGenerator.idCounter - 1));
      value = _builder_1.toString();
    }
    return value;
  }
}
