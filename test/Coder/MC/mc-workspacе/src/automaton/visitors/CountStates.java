/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package automaton.visitors;

import automaton._ast.ASTState;
import automaton._visitor.AutomatonVisitor;

/**
 * Counts the states of an automaton.
 *
 * @author Robert Heim
 */
public class CountStates implements AutomatonVisitor {
  private int count = 0;
  
  @Override
  public void visit(ASTState node) {
    count++;
  }
  
  public int getCount() {
    return count;
  }
}
