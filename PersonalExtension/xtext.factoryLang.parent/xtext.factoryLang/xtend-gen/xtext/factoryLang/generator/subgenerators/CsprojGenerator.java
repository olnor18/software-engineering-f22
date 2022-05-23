package xtext.factoryLang.generator.subgenerators;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class CsprojGenerator {
  public static void generate(final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Project Sdk=\"Microsoft.NET.Sdk\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<PropertyGroup>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<OutputType>Exe</OutputType>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<TargetFramework>net6.0</TargetFramework>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<ImplicitUsings>enable</ImplicitUsings>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<Nullable>enable</Nullable>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</PropertyGroup>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ItemGroup>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<PackageReference Include=\"MQTTnet\" Version=\"3.1.2\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<PackageReference Include=\"MQTTnet.Extensions.ManagedClient\" Version=\"3.1.2\"/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</ItemGroup>");
    _builder.newLine();
    _builder.append("</Project>");
    _builder.newLine();
    fsa.generateFile("OrchestratorService/OrchestratorService.csproj", _builder);
  }
}
