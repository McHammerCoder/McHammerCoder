/*
 * Copyright (c) 2014 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package javascript._symboltable;

public class JavaScriptLanguage extends JavaScriptLanguageTOP {
  public static final String FILE_ENDING = "js";
  
  public JavaScriptLanguage() {
    super("JavaScript Language", FILE_ENDING);

    //setModelNameCalculator(new JavaScriptModelNameCalculator());
  }
  
  @Override
  protected JavaScriptModelLoader provideModelLoader() {
    return new JavaScriptModelLoader(this);
  }
}
