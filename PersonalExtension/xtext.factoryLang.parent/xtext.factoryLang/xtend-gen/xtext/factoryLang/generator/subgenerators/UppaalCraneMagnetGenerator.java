package xtext.factoryLang.generator.subgenerators;

import org.eclipse.xtend2.lib.StringConcatenation;
import xtext.factoryLang.factoryLang.Crane;

@SuppressWarnings("all")
public class UppaalCraneMagnetGenerator {
  public static String generateUppaalCraneMagnetTemplate(final Crane crane) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<template>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<name>");
    String _name = crane.getName();
    _builder.append(_name, "\t");
    _builder.append("_CraneMagnet</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<location id=\"");
    String _name_1 = crane.getName();
    String _plus = (_name_1 + "_MagnetOff");
    String _idOfLocation = UppaalGenerator.getIdOfLocation(_plus);
    _builder.append(_idOfLocation, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<name>");
    String _name_2 = crane.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("_MagnetOff</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location id=\"");
    String _name_3 = crane.getName();
    String _plus_1 = (_name_3 + "_MagnetOn");
    String _idOfLocation_1 = UppaalGenerator.getIdOfLocation(_plus_1);
    _builder.append(_idOfLocation_1, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<name>");
    String _name_4 = crane.getName();
    _builder.append(_name_4, "\t\t");
    _builder.append("_MagnetOn</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location id=\"");
    String _name_5 = crane.getName();
    String _plus_2 = (_name_5 + "_StoppedMagnetOn");
    String _idOfLocation_2 = UppaalGenerator.getIdOfLocation(_plus_2);
    _builder.append(_idOfLocation_2, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<name>");
    String _name_6 = crane.getName();
    _builder.append(_name_6, "\t\t");
    _builder.append("_StoppedMagnetOn</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location id=\"");
    String _name_7 = crane.getName();
    String _plus_3 = (_name_7 + "_StoppedMagnetOff");
    String _idOfLocation_3 = UppaalGenerator.getIdOfLocation(_plus_3);
    _builder.append(_idOfLocation_3, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<name>");
    String _name_8 = crane.getName();
    _builder.append(_name_8, "\t\t");
    _builder.append("_StoppedMagnetOff</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<init ref=\"");
    String _name_9 = crane.getName();
    String _plus_4 = (_name_9 + "_MagnetOff");
    String _idOfLocation_4 = UppaalGenerator.getIdOfLocation(_plus_4);
    _builder.append(_idOfLocation_4, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<source ref=\"");
    String _name_10 = crane.getName();
    String _plus_5 = (_name_10 + "_MagnetOn");
    String _idOfLocation_5 = UppaalGenerator.getIdOfLocation(_plus_5);
    _builder.append(_idOfLocation_5, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<target ref=\"");
    String _name_11 = crane.getName();
    String _plus_6 = (_name_11 + "_StoppedMagnetOff");
    String _idOfLocation_6 = UppaalGenerator.getIdOfLocation(_plus_6);
    _builder.append(_idOfLocation_6, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<label kind=\"synchronisation\">emergencyStop?</label>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<source ref=\"");
    String _name_12 = crane.getName();
    String _plus_7 = (_name_12 + "_MagnetOff");
    String _idOfLocation_7 = UppaalGenerator.getIdOfLocation(_plus_7);
    _builder.append(_idOfLocation_7, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<target ref=\"");
    String _name_13 = crane.getName();
    String _plus_8 = (_name_13 + "_StoppedMagnetOn");
    String _idOfLocation_8 = UppaalGenerator.getIdOfLocation(_plus_8);
    _builder.append(_idOfLocation_8, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<label kind=\"synchronisation\">emergencyStop?</label>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<source ref=\"");
    String _name_14 = crane.getName();
    String _plus_9 = (_name_14 + "_MagnetOn");
    String _idOfLocation_9 = UppaalGenerator.getIdOfLocation(_plus_9);
    _builder.append(_idOfLocation_9, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<target ref=\"");
    String _name_15 = crane.getName();
    String _plus_10 = (_name_15 + "_MagnetOff");
    String _idOfLocation_10 = UppaalGenerator.getIdOfLocation(_plus_10);
    _builder.append(_idOfLocation_10, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<label kind=\"synchronisation\">");
    String _name_16 = crane.getName();
    _builder.append(_name_16, "\t\t");
    _builder.append("_toggleMagnet?</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<source ref=\"");
    String _name_17 = crane.getName();
    String _plus_11 = (_name_17 + "_MagnetOff");
    String _idOfLocation_11 = UppaalGenerator.getIdOfLocation(_plus_11);
    _builder.append(_idOfLocation_11, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<target ref=\"");
    String _name_18 = crane.getName();
    String _plus_12 = (_name_18 + "_MagnetOn");
    String _idOfLocation_12 = UppaalGenerator.getIdOfLocation(_plus_12);
    _builder.append(_idOfLocation_12, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<label kind=\"synchronisation\">");
    String _name_19 = crane.getName();
    _builder.append(_name_19, "\t\t");
    _builder.append("_toggleMagnet?</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("</template>");
    _builder.newLine();
    return _builder.toString();
  }
}