package fr.imt.bertin.dala.project.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.imt.bertin.dala.project.browser.Model
import fr.imt.bertin.dala.project.browser.Statement
import fr.imt.bertin.dala.project.browser.OpenUrl
import fr.imt.bertin.dala.project.browser.VerifyLink
import fr.imt.bertin.dala.project.browser.ClickLink
import fr.imt.bertin.dala.project.browser.TextPart
import fr.imt.bertin.dala.project.browser.StringLiteral
import fr.imt.bertin.dala.project.browser.VariableReference
import org.eclipse.xtext.xbase.lib.IteratorExtensions
import org.eclipse.emf.common.util.EList

class BrowserGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // Extract the filename from the resource URI
        val uri = resource.URI
        val fileNameWithExtension = uri.lastSegment
        // Remove the '.browser' extension
        val baseName = fileNameWithExtension.substring(0, fileNameWithExtension.lastIndexOf('.'))
        // Create the class name by appending 'Script'
        val className = baseName + "Script"
        // The generated Java file name
        val fileName = className + ".java"

        // Get the first Model instance from the resource
        val model = resource.contents.head as Model

        // Generate the Java file
        fsa.generateFile(fileName, compile(model, className))
    }

    /**
     * Compiles the entire Model into Java code.
     */
    def compile(Model model, String className) '''
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import java.time.Duration;
        import java.util.List;

        public class «className» {
            public static void main(String[] args) {
                
                WebDriver driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

                try {
    «FOR statement : model.statements»
                    «compile(statement)»
    «ENDFOR»
                } finally {
                    driver.quit();
                }
            }
        }
    '''

    /**
     * Compiles a single Statement into Java code.
     */
    def compile(Statement stmt) '''
        «IF stmt instanceof OpenUrl»
            «compile(stmt as OpenUrl)»
        «ELSEIF stmt instanceof ClickLink»
            «compile(stmt as ClickLink)»
        «ELSEIF stmt instanceof VerifyLink»
            «compile(stmt as VerifyLink)»
        «ENDIF»
    '''

    /**
     * Compiles an OpenUrl statement into Java code.
     */
    def compile(OpenUrl openUrl) '''
                    driver.get("«extractString(openUrl.url)»");
    '''

    /**
     * Compiles a ClickLink statement into Java code.
     */
    def compile(ClickLink clickLink) '''
                    {
                        String linkText = "«extractString(clickLink.linkText)»";
                        List<WebElement> links = driver.findElements(By.xpath("//a[text()='" + linkText + "']"));

                        if (!links.isEmpty()) {
                            links.get(0).click();
                            System.out.println("Clicked on link '" + linkText + "'.");
                        } else {
                            System.out.println("Link '" + linkText + "' not found.");
                        }
                    }
    '''

    /**
     * Compiles a VerifyLink statement into Java code.
     */
    def compile(VerifyLink verifyLink) '''
                    {
                        String linkText = "«compileTextParts(verifyLink.texts)»";
                        List<WebElement> links = driver.findElements(By.xpath("//a[text()='" + linkText + "']"));

                        if (!links.isEmpty()) {
                            System.out.println("Link '" + linkText + "' found.");
                        } else {
                            System.out.println("Link '" + linkText + "' not found.");
                        }
                    }
    '''

    /**
     * Compiles a list of TextParts into a single string without line breaks.
     */
    def compileTextParts(EList<TextPart> textParts) '''
        «textParts.map[ compileTextPart(it) ].join("")»
    '''

    /**
     * Compiles a single TextPart into a string without introducing line breaks.
     */
    def compileTextPart(TextPart textPart) '''
        «IF textPart instanceof StringLiteral»
            «extractString((textPart as StringLiteral).value)»
        «ELSEIF textPart instanceof VariableReference»
            «(textPart as VariableReference).name»
        «ELSE»
            «""»
        «ENDIF»
    '''

    /**
     * Helper method to extract the actual string value from a STRING token.
     */
    def extractString(String str) {
        if (str.startsWith('"') && str.endsWith('"')) {
            return str.substring(1, str.length - 1)
        } else {
            return str
        }
    }
}
