package xtext.factoryLang.generator.subgenerators;

import org.eclipse.xtend2.lib.StringConcatenation;
import xtext.factoryLang.factoryLang.Camera;

@SuppressWarnings("all")
public class CameraGenerator {
  public static String generate(final Camera camera) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<template>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<name>");
    String _name = camera.getName();
    _builder.append(_name, "\t        ");
    _builder.append("</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("<location id=\"");
    String _name_1 = camera.getName();
    String _plus = (_name_1 + "_Idle");
    String _idOfLocation = UppaalGenerator.getIdOfLocation(_plus);
    _builder.append(_idOfLocation, "\t        ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<name>");
    String _name_2 = camera.getName();
    _builder.append(_name_2, "\t            ");
    _builder.append("_Idle</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<location id=\"");
    String _name_3 = camera.getName();
    String _plus_1 = (_name_3 + "_Red");
    String _idOfLocation_1 = UppaalGenerator.getIdOfLocation(_plus_1);
    _builder.append(_idOfLocation_1, "\t        ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<name>");
    String _name_4 = camera.getName();
    _builder.append(_name_4, "\t            ");
    _builder.append("_Red</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<committed/>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<location id=\"");
    String _name_5 = camera.getName();
    String _plus_2 = (_name_5 + "_Green");
    String _idOfLocation_2 = UppaalGenerator.getIdOfLocation(_plus_2);
    _builder.append(_idOfLocation_2, "\t        ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<name>");
    String _name_6 = camera.getName();
    _builder.append(_name_6, "\t            ");
    _builder.append("_Green</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<committed/>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<location id=\"");
    String _name_7 = camera.getName();
    String _plus_3 = (_name_7 + "_Blue");
    String _idOfLocation_3 = UppaalGenerator.getIdOfLocation(_plus_3);
    _builder.append(_idOfLocation_3, "\t        ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<name>");
    String _name_8 = camera.getName();
    _builder.append(_name_8, "\t            ");
    _builder.append("_Blue</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<committed/>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</location>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<init ref=\"");
    String _name_9 = camera.getName();
    String _plus_4 = (_name_9 + "_Idle");
    String _idOfLocation_4 = UppaalGenerator.getIdOfLocation(_plus_4);
    _builder.append(_idOfLocation_4, "\t        ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("<source ref=\"");
    String _name_10 = camera.getName();
    String _plus_5 = (_name_10 + "_Blue");
    String _idOfLocation_5 = UppaalGenerator.getIdOfLocation(_plus_5);
    _builder.append(_idOfLocation_5, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<target ref=\"");
    String _name_11 = camera.getName();
    String _plus_6 = (_name_11 + "_Idle");
    String _idOfLocation_6 = UppaalGenerator.getIdOfLocation(_plus_6);
    _builder.append(_idOfLocation_6, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"synchronisation\">");
    String _name_12 = camera.getName();
    _builder.append(_name_12, "\t            ");
    _builder.append("_gottenColour!</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("<source ref=\"");
    String _name_13 = camera.getName();
    String _plus_7 = (_name_13 + "_Idle");
    String _idOfLocation_7 = UppaalGenerator.getIdOfLocation(_plus_7);
    _builder.append(_idOfLocation_7, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<target ref=\"");
    String _name_14 = camera.getName();
    String _plus_8 = (_name_14 + "_Blue");
    String _idOfLocation_8 = UppaalGenerator.getIdOfLocation(_plus_8);
    _builder.append(_idOfLocation_8, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"synchronisation\">");
    String _name_15 = camera.getName();
    _builder.append(_name_15, "\t            ");
    _builder.append("_getColour?</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"assignment\">colour = 3</label>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("<source ref=\"");
    String _name_16 = camera.getName();
    String _plus_9 = (_name_16 + "_Green");
    String _idOfLocation_9 = UppaalGenerator.getIdOfLocation(_plus_9);
    _builder.append(_idOfLocation_9, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<target ref=\"");
    String _name_17 = camera.getName();
    String _plus_10 = (_name_17 + "_Idle");
    String _idOfLocation_10 = UppaalGenerator.getIdOfLocation(_plus_10);
    _builder.append(_idOfLocation_10, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"synchronisation\">");
    String _name_18 = camera.getName();
    _builder.append(_name_18, "\t            ");
    _builder.append("_gottenColour!</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("<source ref=\"");
    String _name_19 = camera.getName();
    String _plus_11 = (_name_19 + "_Idle");
    String _idOfLocation_11 = UppaalGenerator.getIdOfLocation(_plus_11);
    _builder.append(_idOfLocation_11, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<target ref=\"");
    String _name_20 = camera.getName();
    String _plus_12 = (_name_20 + "_Green");
    String _idOfLocation_12 = UppaalGenerator.getIdOfLocation(_plus_12);
    _builder.append(_idOfLocation_12, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"synchronisation\">");
    String _name_21 = camera.getName();
    _builder.append(_name_21, "\t            ");
    _builder.append("_getColour?</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"assignment\">colour=2</label>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("<source ref=\"");
    String _name_22 = camera.getName();
    String _plus_13 = (_name_22 + "_Red");
    String _idOfLocation_13 = UppaalGenerator.getIdOfLocation(_plus_13);
    _builder.append(_idOfLocation_13, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<target ref=\"");
    String _name_23 = camera.getName();
    String _plus_14 = (_name_23 + "_Idle");
    String _idOfLocation_14 = UppaalGenerator.getIdOfLocation(_plus_14);
    _builder.append(_idOfLocation_14, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"synchronisation\">");
    String _name_24 = camera.getName();
    _builder.append(_name_24, "\t            ");
    _builder.append("_gottenColour!</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t        ");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("<transition>");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("<source ref=\"");
    String _name_25 = camera.getName();
    String _plus_15 = (_name_25 + "_Idle");
    String _idOfLocation_15 = UppaalGenerator.getIdOfLocation(_plus_15);
    _builder.append(_idOfLocation_15, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<target ref=\"");
    String _name_26 = camera.getName();
    String _plus_16 = (_name_26 + "_Red");
    String _idOfLocation_16 = UppaalGenerator.getIdOfLocation(_plus_16);
    _builder.append(_idOfLocation_16, "\t            ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"synchronisation\">");
    String _name_27 = camera.getName();
    _builder.append(_name_27, "\t            ");
    _builder.append("_getColour?</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<label kind=\"assignment\">colour = 1</label>");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("</transition>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("</template>");
    _builder.newLine();
    return _builder.toString();
  }
}
