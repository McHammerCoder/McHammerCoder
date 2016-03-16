/* generated from model null*/
/* generated by template parser.MCConcreteParser*/

package javascriptsimple._parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import de.monticore.antlr4.MCConcreteParser;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.util.Optional;


/**
 *  A MontiCoreMCConcreteParser wraps a rule within a grammar to 
 *  unify interface to calling .parse() for all rules
 */
public class SourceElementsMCParser extends MCConcreteParser {
    
  /** Parses a file. 
   * 
   * @param filename Name of file to parse
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   */
  public Optional<javascriptsimple._ast.ASTSourceElements> parse(String filename) throws IOException, RecognitionException {   
    JavaScriptSimpleLexer lexer = new JavaScriptSimpleLexer(new  ANTLRFileStream(filename));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    JavaScriptSimpleParser parser = new JavaScriptSimpleParser(tokens);
    lexer.setMCParser(parser);  
    parser.setFilename(filename);
    
    javascriptsimple._ast.ASTSourceElements ast = parse(parser);
    if (parser.hasErrors()) {
      hasErrors = true;
      return Optional.<javascriptsimple._ast.ASTSourceElements> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a Reader.
   * 
   * @param reader Reader to parse from
   * @return Resulting AST
   * @throws IOException 
   * @throws RecognitionException
   * */
  public  Optional<javascriptsimple._ast.ASTSourceElements> parse(Reader reader) throws IOException, RecognitionException {
    JavaScriptSimpleLexer lexer = new JavaScriptSimpleLexer(new ANTLRInputStream(reader));
    CommonTokenStream tokens = new CommonTokenStream(lexer);    
    JavaScriptSimpleParser parser = new JavaScriptSimpleParser(tokens);
    lexer.setMCParser(parser);   
    parser.setFilename("Reader");
       
    javascriptsimple._ast.ASTSourceElements ast = parse(parser);
    if (parser.hasErrors()) {
      hasErrors = true;
      return Optional.<javascriptsimple._ast.ASTSourceElements> empty();
    }
    return Optional.ofNullable(ast);
  }
  
  /** Parses content of a String.
   * 
   * @param parseString String to parse from
   * @return Resulting AST
   * @throws IOException
   * @throws RecognitionException
   *
   */
  public  Optional<javascriptsimple._ast.ASTSourceElements> parseString(String parseString) throws IOException, RecognitionException {
    return parse(new StringReader(parseString));
  }
  
  /** Creates the MCParser
   * 
   */
  protected SourceElementsMCParser() {
    super();
  }
  
  
  /** Start parsing
   * 
   * 
   */
  protected javascriptsimple._ast.ASTSourceElements parse(JavaScriptSimpleParser parser) throws RecognitionException {
    
    javascriptsimple._ast.ASTSourceElements ret;
    
    if (this.getParserTarget().equals(ParserExecution.NORMAL)){
      ret =  parser.sourceelements().ret;
    }
    else {
      ret= parser.sourceelements_eof().ret;
    }
   
    return ret;
    
  }
  
}