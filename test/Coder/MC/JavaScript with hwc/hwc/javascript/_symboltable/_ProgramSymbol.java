/*
 * Copyright (c) 2015 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/
 */
package javascript._symboltable;

import java.util.Optional;

public class ProgramSymbol extends ProgramSymbolTOP {

  public ProgramSymbol(final String name) {
    super(name);
  }

  @Override
  protected ProgramScope createSpannedScope() {
    return new JavaScriptScope(Optional.empty());
  }

  public Optional<StateSymbol> getState(final String name) {
    return getSpannedScope().resolveLocally(name, StateSymbol.KIND);
  }

}
