/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package prettyprint;

import javascriptsimple._ast.*;
import javascriptsimple._visitor.*;

import de.monticore.ast.ASTNode;

/**
 * Pretty prints a JS program. Use {@link #print(ASTProgram)} to start a pretty
 * print and get the result by using {@link #getResult()}.
 *
 * @author PeterStanchev
 */
public class PrettyPrinter implements JavaScriptSimpleVisitor {
  private String result = "#\n";
  private int count = 0;
  
  /**
   * Prints the JavaScript program
   * 
   * @param automaton
   */
  public void print(ASTSourceElement program) {
    handle(program);

  }
  public void handle (ASTSourceElement program){
    visit(program);
    visit((ASTNode) program);
    endVisit((ASTNode) program);
    traverse(program);
    endVisit(program);
    for (ASTNode child : program.get_Children()) {
      handle(child);
    }
}
    public void handle(ASTNode node){
      visit(node);
      endVisit(node);
       for (ASTNode child : node.get_Children()) {
      handle(child);
    }

    }
  /**
   * Gets the printed result.
   * 
   * @return the result of the pretty print.
   */
  public String getResult() {
    return this.result;
  }
  public int getCount(){
    return this.count;
  }
  @Override
  public void visit(ASTNode node){
    count++;
	  //print("I am a node! \\o/\n");
  }
  @Override
  public void visit(ASTEOS node){
    print(node.getSemiColon());
  }
 
  @Override
  public void visit(ASTLiteral node){
    print(node.getStringLiteral());
  }
  @Override
  public void visit(ASTVariableDeclaration node){
    print(node.getIdentifier());
  }

  @Override
  public void visit(ASTInitialiser node){
  String wS = node.getWS();
  String eQ = node.getEQ();
  print(wS+eQ);
  }

  @Override
  public void visit(ASTVariableStatement node){
    String var = node.getVar();
    String wS = node.getWS();
    print(var + wS);

  }
  @Override
  public void visit(ASTSingleExpression node){
    print(node.getWS());
  }
  
  @Override
  public void visit(ASTExpressionSequence node){
	  String ws = "";
	  String ko = "";
			  for (String s : node.getWSs())
		{
			ws += s;
		}
			  for (String m : node.getKOs())
		{
			ko += m;
		}
		print(ko+ws);
		print("I am an ASTExpressionSequence");
  }
  
  @Override
  public void visit(ASTVariableDeclarations node){
	  String ws = "";
	  String ko = "";
			  for (String s : node.getWSs())
		{
			ws += s;
		}
			  for (String m : node.getKOs())
		{
			ko += m;
		}
		print(ko+ws);
  }
  
  
  private void print(String str)
  {
	  result += str;
  }
}
