/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package automaton.cocos;

import automaton._cocos.AutomatonCoCoChecker;

public class AutomatonCoCos {
  
  public AutomatonCoCoChecker getCheckerForAllCoCos() {
    final AutomatonCoCoChecker checker = new AutomatonCoCoChecker();
    checker.addCoCo(new AtLeastOneInitialAndFinalState());
    checker.addCoCo(new StateNameStartsWithCapitalLetter());
    // TODO PN uncomment
    // checker.addCoCo(new TransitionSourceExists());
    
    return checker;
  }
}
