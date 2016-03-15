/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.mchammer.tree;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * TODO: Write me!
 *
 * @author  (last commit) $Author$
 * @version $Revision$, $Date$
 * @since   TODO: add version number
 *
 */
public class HATerminalNode extends HAParseTree implements TerminalNode
{
	
	/**
	 * Constructor for de.mchammer.tree.HATerminalNode.
	 * @param token
	 * @param tokenType
	 */
	public HATerminalNode(Token symbol) {
		super(symbol);
	}

	/**
	 * @see org.antlr.v4.runtime.tree.TerminalNode#getSymbol()
	 */
	public Token getSymbol() 
	{
		return (Token) payload;
	}

}
