package xtext.factoryLang.uppaalParsers;

import xtext.factoryLang.factoryLang.COLOR;

@SuppressWarnings("all")
public class EnumParser {
  public static int ColourToInt(final COLOR colour) {
    int _value = colour.getValue();
    return (_value + 1);
  }
}
