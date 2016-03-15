/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */

import java.io.IOException;
import java.util.Optional;

import javascript._ast.*;
import javascript._cocos.*;
import javascript._parser.*;
import javascript._symboltable.*;
import prettyprint.*;
import javascript._visitor.*;
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
public class JavaScriptTool {
  
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
    Log.info("JavaScript DSL Tool", JavaScriptTool.class.getName());
    Log.info("------------------", JavaScriptTool.class.getName());
    String model = args[0];
	Log.info(model, JavaScriptTool.class.getName());
    ProgramMCParser parser = JavaScriptParserFactory.createProgramMCParser();
	Optional<ASTProgram> ast = null;
		try {
      ast = parser.parse(model);
      
      if (!parser.hasErrors() && ast.isPresent()) {
       Log.info("Success!", JavaScriptTool.class.getName());
      }
	  else{
      Log.error("Model could not be parsed.");
	  }
    }
    catch (RecognitionException | IOException e) {
      Log.error("Failed to parse " + model, e);
    }
	
    Log.info(model + " parsed successfully!", JavaScriptTool.class.getName());
	if( ast == null) { 
	Log.error("optSourceElements is NULL!");
	}
	else
	{
	 PrettyPrinter pp = new PrettyPrinter();
    pp.handle(ast.get());
    Log.info("Pretty printing the parsed JS into console:", JavaScriptTool.class.getName());
    System.out.println(pp.getResult());
	}
  }

}
