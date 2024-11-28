package fr.imt.bertin.dala.project.generator;

import fr.imt.bertin.dala.project.browser.ClickLink;
import fr.imt.bertin.dala.project.browser.Model;
import fr.imt.bertin.dala.project.browser.OpenUrl;
import fr.imt.bertin.dala.project.browser.Statement;
import fr.imt.bertin.dala.project.browser.StringLiteral;
import fr.imt.bertin.dala.project.browser.TextPart;
import fr.imt.bertin.dala.project.browser.VariableReference;
import fr.imt.bertin.dala.project.browser.VerifyLink;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class BrowserGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final URI uri = resource.getURI();
    final String fileNameWithExtension = uri.lastSegment();
    final String baseName = fileNameWithExtension.substring(0, fileNameWithExtension.lastIndexOf("."));
    final String className = (baseName + "Script");
    final String fileName = (className + ".java");
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    fsa.generateFile(fileName, this.compile(model, className));
  }

  /**
   * Compiles the entire Model into Java code.
   */
  public CharSequence compile(final Model model, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.openqa.selenium.WebDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.chrome.ChromeDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.By;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebElement;");
    _builder.newLine();
    _builder.append("import java.time.Duration;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("WebDriver driver = new ChromeDriver();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try {");
    _builder.newLine();
    {
      EList<Statement> _statements = model.getStatements();
      for(final Statement statement : _statements) {
        _builder.append("    ");
        CharSequence _compile = this.compile(statement);
        _builder.append(_compile, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("} finally {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("driver.quit();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  /**
   * Compiles a single Statement into Java code.
   */
  public CharSequence compile(final Statement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((stmt instanceof OpenUrl)) {
        CharSequence _compile = this.compile(((OpenUrl) stmt));
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      } else {
        if ((stmt instanceof ClickLink)) {
          CharSequence _compile_1 = this.compile(((ClickLink) stmt));
          _builder.append(_compile_1);
          _builder.newLineIfNotEmpty();
        } else {
          if ((stmt instanceof VerifyLink)) {
            CharSequence _compile_2 = this.compile(((VerifyLink) stmt));
            _builder.append(_compile_2);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }

  /**
   * Compiles an OpenUrl statement into Java code.
   */
  public CharSequence compile(final OpenUrl openUrl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("driver.get(\"");
    String _extractString = this.extractString(openUrl.getUrl());
    _builder.append(_extractString);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  /**
   * Compiles a ClickLink statement into Java code.
   */
  public CharSequence compile(final ClickLink clickLink) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String linkText = \"");
    String _extractString = this.extractString(clickLink.getLinkText());
    _builder.append(_extractString, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("List<WebElement> links = driver.findElements(By.xpath(\"//a[text()=\'\" + linkText + \"\']\"));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (!links.isEmpty()) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("links.get(0).click();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(\"Clicked on link \'\" + linkText + \"\'.\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(\"Link \'\" + linkText + \"\' not found.\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  /**
   * Compiles a VerifyLink statement into Java code.
   */
  public CharSequence compile(final VerifyLink verifyLink) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String linkText = \"");
    CharSequence _compileTextParts = this.compileTextParts(verifyLink.getTexts());
    _builder.append(_compileTextParts, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("List<WebElement> links = driver.findElements(By.xpath(\"//a[text()=\'\" + linkText + \"\']\"));");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (!links.isEmpty()) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(\"Link \'\" + linkText + \"\' found.\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(\"Link \'\" + linkText + \"\' not found.\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  /**
   * Compiles a list of TextParts into a single string without line breaks.
   */
  public CharSequence compileTextParts(final EList<TextPart> textParts) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<TextPart, CharSequence> _function = (TextPart it) -> {
      return this.compileTextPart(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<TextPart, CharSequence>map(textParts, _function), "");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  /**
   * Compiles a single TextPart into a string without introducing line breaks.
   */
  public CharSequence compileTextPart(final TextPart textPart) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((textPart instanceof StringLiteral)) {
        String _extractString = this.extractString(((StringLiteral) textPart).getValue());
        _builder.append(_extractString);
        _builder.newLineIfNotEmpty();
      } else {
        if ((textPart instanceof VariableReference)) {
          String _name = ((VariableReference) textPart).getName();
          _builder.append(_name);
          _builder.newLineIfNotEmpty();
        } else {
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }

  /**
   * Helper method to extract the actual string value from a STRING token.
   */
  public String extractString(final String str) {
    if ((str.startsWith("\"") && str.endsWith("\""))) {
      int _length = str.length();
      int _minus = (_length - 1);
      return str.substring(1, _minus);
    } else {
      return str;
    }
  }
}
