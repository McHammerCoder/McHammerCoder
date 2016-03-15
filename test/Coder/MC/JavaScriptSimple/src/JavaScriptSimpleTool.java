/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import java.io.IOException;
import java.util.Optional;

import javascriptsimple._ast.*;
import javascriptsimple._cocos.*;
import javascriptsimple._parser.*;
import javascriptsimple._symboltable.*;
import prettyprint.*;
import javascriptsimple._visitor.*;
import de.monticore.io.paths.ModelPath;
import de.monticore.symboltable.GlobalScope;
import de.monticore.symboltable.ResolverConfiguration;
import de.monticore.symboltable.Scope;
import de.monticore.symboltable.Symbol;
import de.se_rwth.commons.logging.Log;
import org.antlr.v4.runtime.RecognitionException;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * Main class for the JS DSL tool.
 *
 * @author (last commit) $Author$
 * @version $Revision$, $Date$
 */
public class JavaScriptSimpleTool {
  
  /**
   * Use the single argument for specifying the single input JS file.
   * 
   * @param args
   */
  public static void main(String[] args) {
    if (args.length != 1) {
      Log.error("Please specify only one single path to the input model.");
      return;
    }
    Log.info("JavaScript DSL Tool", JavaScriptSimpleTool.class.getName());
    Log.info("------------------", JavaScriptSimpleTool.class.getName());
    String model = args[0];
	Log.info(model, JavaScriptSimpleTool.class.getName());
    SourceElementMCParser parser = JavaScriptSimpleParserFactory.createSourceElementMCParser();
	Optional<ASTSourceElement> ast = null;
		try {
      ast = parser.parse(model);
      
      if (!parser.hasErrors() && ast.isPresent()) {
       Log.info("Success!", JavaScriptSimpleTool.class.getName());
      }
	  else{
      Log.error("Model could not be parsed.");
	  }
    }
    catch (RecognitionException | IOException e) {
      Log.error("Failed to parse " + model, e);
    }
	
    Log.info(model + " parsed successfully!", JavaScriptSimpleTool.class.getName());
	if( ast == null) { 
	Log.error("optSourceElements is NULL!");
	}
	else
	{
	 PrettyPrinter pp = new PrettyPrinter();
    pp.handle(ast.get());
    Log.info("Pretty printing the parsed JS into console:", JavaScriptSimpleTool.class.getName());
    System.out.println("I found " + pp.getCount() + " states and I am proud of it!");
    System.out.println(pp.getResult());

	}
  }

}
