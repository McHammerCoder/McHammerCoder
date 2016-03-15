/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.mchammer.tree;

import org.antlr.v4.runtime.RuleContext;

/**
 * TODO: Write me!
 *
 * @author  (last commit) $Author$
 * @version $Revision$, $Date$
 * @since   TODO: add version number
 *
 */
public class HARuleContext extends RuleContext
{
	private int ruleIndex = 0;
	
	public HARuleContext(int ruleIndex)
	{
		super();
		this.ruleIndex = ruleIndex;
	}
	
	public int getRuleIndex()
	{
		return ruleIndex;
	}
}
