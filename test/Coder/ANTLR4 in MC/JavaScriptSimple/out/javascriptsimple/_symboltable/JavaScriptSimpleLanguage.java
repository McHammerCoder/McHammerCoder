/* generated from model null*/
/* generated by template symboltable.ModelingLanguage*/




package javascriptsimple._symboltable;

import java.util.Optional;

import javascriptsimple._parser.JavaScriptProgramMCParser;
import javascriptsimple._parser.JavaScriptSimpleParserFactory;
import de.monticore.symboltable.MutableScope;
import de.monticore.symboltable.ResolverConfiguration;

public abstract class JavaScriptSimpleLanguage extends de.monticore.CommonModelingLanguage {

  public JavaScriptSimpleLanguage(String langName, String fileEnding) {
    super(langName, fileEnding);

    initResolvingFilters();
  }

  @Override
  public JavaScriptProgramMCParser getParser() {
    return JavaScriptSimpleParserFactory.createJavaScriptProgramMCParser();
  }


  @Override
  public JavaScriptSimpleModelLoader getModelLoader() {
    return (JavaScriptSimpleModelLoader) super.getModelLoader();
  }

  //@Override
  //protected JavaScriptSimpleModelLoader provideModelLoader() {
  //  return new JavaScriptSimpleModelLoader(this);
  //}

  protected void initResolvingFilters() {
  }
}
