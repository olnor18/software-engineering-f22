package xtext.factoryLang.generator.subgenerators;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class UppaalEmergencyButtonGenerator {
  public static String generateUppaalEmergencyButtonTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<template>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<name>EmergencyButton</name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location id=\"");
    String _idOfLocation = UppaalGenerator.getIdOfLocation("Running");
    _builder.append(_idOfLocation, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<name>Running</name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location id=\"");
    String _idOfLocation_1 = UppaalGenerator.getIdOfLocation("Stopped");
    _builder.append(_idOfLocation_1, "\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<name>Stopped</name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<init ref=\"");
    String _idOfLocation_2 = UppaalGenerator.getIdOfLocation("Running");
    _builder.append(_idOfLocation_2, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<source ref=\"");
    String _idOfLocation_3 = UppaalGenerator.getIdOfLocation("Running");
    _builder.append(_idOfLocation_3, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<target ref=\"");
    String _idOfLocation_4 = UppaalGenerator.getIdOfLocation("Stopped");
    _builder.append(_idOfLocation_4, "\t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<label kind=\"synchronisation\">emergencyStop!</label>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("</template>");
    _builder.newLine();
    return _builder.toString();
  }
}
