package xtext.factoryLang.generator.subgenerators;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import xtext.factoryLang.factoryLang.Crane;
import xtext.factoryLang.factoryLang.CranePositionParameter;
import xtext.factoryLang.factoryLang.Parameter;

@SuppressWarnings("all")
public class UppaalCraneGenerator {
  public static String generateUppaalCraneTemplate(final Crane crane) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<template>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<name>");
    String _name = crane.getName();
    _builder.append(_name, "\t");
    _builder.append("</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<declaration>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</declaration>");
    _builder.newLine();
    {
      EList<Parameter> _targets = crane.getTargets();
      for(final Parameter position : _targets) {
        _builder.append("\t");
        _builder.append("<location id=\"");
        String _name_1 = crane.getName();
        String _plus = (_name_1 + "_");
        String _name_2 = ((CranePositionParameter) position).getName();
        String _plus_1 = (_plus + _name_2);
        String _idOfLocation = UppaalGenerator.getIdOfLocation(_plus_1);
        _builder.append(_idOfLocation, "\t");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<name>");
        String _name_3 = crane.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append("_");
        String _name_4 = ((CranePositionParameter) position).getName();
        _builder.append(_name_4, "\t\t");
        _builder.append("</name>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</location>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<location id=\"");
        String _name_5 = crane.getName();
        String _plus_2 = (_name_5 + "_LoweredAt");
        String _name_6 = ((CranePositionParameter) position).getName();
        String _plus_3 = (_plus_2 + _name_6);
        String _idOfLocation_1 = UppaalGenerator.getIdOfLocation(_plus_3);
        _builder.append(_idOfLocation_1, "\t");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<name>");
        String _name_7 = crane.getName();
        _builder.append(_name_7, "\t\t");
        _builder.append("_LoweredAt");
        String _name_8 = ((CranePositionParameter) position).getName();
        _builder.append(_name_8, "\t\t");
        _builder.append("</name>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</location>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("<location id=\"");
    String _name_9 = crane.getName();
    String _plus_4 = (_name_9 + "_Stopped");
    String _idOfLocation_2 = UppaalGenerator.getIdOfLocation(_plus_4);
    _builder.append(_idOfLocation_2, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<name>");
    String _name_10 = crane.getName();
    _builder.append(_name_10, "\t\t");
    _builder.append("_Stopped</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<init ref=\"");
    String _name_11 = crane.getName();
    String _plus_5 = (_name_11 + "_");
    Parameter _get = crane.getTargets().get(0);
    String _name_12 = ((CranePositionParameter) _get).getName();
    String _plus_6 = (_plus_5 + _name_12);
    String _idOfLocation_3 = UppaalGenerator.getIdOfLocation(_plus_6);
    _builder.append(_idOfLocation_3, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    {
      EList<Parameter> _targets_1 = crane.getTargets();
      for(final Parameter position_1 : _targets_1) {
        _builder.append("\t");
        _builder.append("<transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<source ref=\"");
        String _name_13 = crane.getName();
        String _plus_7 = (_name_13 + "_");
        String _name_14 = ((CranePositionParameter) position_1).getName();
        String _plus_8 = (_plus_7 + _name_14);
        String _idOfLocation_4 = UppaalGenerator.getIdOfLocation(_plus_8);
        _builder.append(_idOfLocation_4, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<target ref=\"");
        String _name_15 = crane.getName();
        String _plus_9 = (_name_15 + "_");
        String _name_16 = ((CranePositionParameter) position_1).getName();
        String _plus_10 = (_plus_9 + _name_16);
        String _idOfLocation_5 = UppaalGenerator.getIdOfLocation(_plus_10);
        _builder.append(_idOfLocation_5, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<label kind=\"synchronisation\">");
        String _name_17 = crane.getName();
        _builder.append(_name_17, "\t\t");
        _builder.append("_goto_");
        String _name_18 = ((CranePositionParameter) position_1).getName();
        _builder.append(_name_18, "\t\t");
        _builder.append("?</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<source ref=\"");
        String _name_19 = crane.getName();
        String _plus_11 = (_name_19 + "_");
        String _name_20 = ((CranePositionParameter) position_1).getName();
        String _plus_12 = (_plus_11 + _name_20);
        String _idOfLocation_6 = UppaalGenerator.getIdOfLocation(_plus_12);
        _builder.append(_idOfLocation_6, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<target ref=\"");
        String _name_21 = crane.getName();
        String _plus_13 = (_name_21 + "_Stopped");
        String _idOfLocation_7 = UppaalGenerator.getIdOfLocation(_plus_13);
        _builder.append(_idOfLocation_7, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<label kind=\"synchronisation\">emergencyStop?</label>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<source ref=\"");
        String _name_22 = crane.getName();
        String _plus_14 = (_name_22 + "_LoweredAt");
        String _name_23 = ((CranePositionParameter) position_1).getName();
        String _plus_15 = (_plus_14 + _name_23);
        String _idOfLocation_8 = UppaalGenerator.getIdOfLocation(_plus_15);
        _builder.append(_idOfLocation_8, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<target ref=\"");
        String _name_24 = crane.getName();
        String _plus_16 = (_name_24 + "_Stopped");
        String _idOfLocation_9 = UppaalGenerator.getIdOfLocation(_plus_16);
        _builder.append(_idOfLocation_9, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<label kind=\"synchronisation\">emergencyStop?</label>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<source ref=\"");
        String _name_25 = crane.getName();
        String _plus_17 = (_name_25 + "_");
        String _name_26 = ((CranePositionParameter) position_1).getName();
        String _plus_18 = (_plus_17 + _name_26);
        String _idOfLocation_10 = UppaalGenerator.getIdOfLocation(_plus_18);
        _builder.append(_idOfLocation_10, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<target ref=\"");
        String _name_27 = crane.getName();
        String _plus_19 = (_name_27 + "_LoweredAt");
        String _name_28 = ((CranePositionParameter) position_1).getName();
        String _plus_20 = (_plus_19 + _name_28);
        String _idOfLocation_11 = UppaalGenerator.getIdOfLocation(_plus_20);
        _builder.append(_idOfLocation_11, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<label kind=\"synchronisation\">");
        String _name_29 = crane.getName();
        _builder.append(_name_29, "\t\t");
        _builder.append("_lowerMagnet?</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<transition>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<source ref=\"");
        String _name_30 = crane.getName();
        String _plus_21 = (_name_30 + "_LoweredAt");
        String _name_31 = ((CranePositionParameter) position_1).getName();
        String _plus_22 = (_plus_21 + _name_31);
        String _idOfLocation_12 = UppaalGenerator.getIdOfLocation(_plus_22);
        _builder.append(_idOfLocation_12, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<target ref=\"");
        String _name_32 = crane.getName();
        String _plus_23 = (_name_32 + "_");
        String _name_33 = ((CranePositionParameter) position_1).getName();
        String _plus_24 = (_plus_23 + _name_33);
        String _idOfLocation_13 = UppaalGenerator.getIdOfLocation(_plus_24);
        _builder.append(_idOfLocation_13, "\t\t");
        _builder.append("\"/>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<label kind=\"synchronisation\">");
        String _name_34 = crane.getName();
        _builder.append(_name_34, "\t\t");
        _builder.append("_raiseMagnet?</label>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transition>");
        _builder.newLine();
        {
          EList<Parameter> _targets_2 = crane.getTargets();
          for(final Parameter otherposition : _targets_2) {
            {
              boolean _notEquals = (!Objects.equal(otherposition, position_1));
              if (_notEquals) {
                _builder.append("\t");
                _builder.append("<transition>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<source ref=\"");
                String _name_35 = crane.getName();
                String _plus_25 = (_name_35 + "_");
                String _name_36 = ((CranePositionParameter) position_1).getName();
                String _plus_26 = (_plus_25 + _name_36);
                String _idOfLocation_14 = UppaalGenerator.getIdOfLocation(_plus_26);
                _builder.append(_idOfLocation_14, "\t\t");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<target ref=\"");
                String _name_37 = crane.getName();
                String _plus_27 = (_name_37 + "_");
                String _name_38 = ((CranePositionParameter) otherposition).getName();
                String _plus_28 = (_plus_27 + _name_38);
                String _idOfLocation_15 = UppaalGenerator.getIdOfLocation(_plus_28);
                _builder.append(_idOfLocation_15, "\t\t");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<label kind=\"synchronisation\">");
                String _name_39 = crane.getName();
                _builder.append(_name_39, "\t\t");
                _builder.append("_goto_");
                String _name_40 = ((CranePositionParameter) otherposition).getName();
                _builder.append(_name_40, "\t\t");
                _builder.append("?</label>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</transition>");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("</template>");
    _builder.newLine();
    return _builder.toString();
  }
}