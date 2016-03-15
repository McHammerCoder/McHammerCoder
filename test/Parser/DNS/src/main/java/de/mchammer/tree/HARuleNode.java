/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.mchammer.tree;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

public class HARuleNode extends HAParseTree implements RuleNode
{	
	
	/**
	 * Constructor for de.mchammer.rulecontexts.RNMessage.
	 * @param payload
	 */
	public HARuleNode(Object payload)
	{
		super(payload);
	}

	public int getIndex()
	{
		return TreeHelper.RuleType.RT_Message.ordinal();
	}

	public RuleContext getRuleContext()
	{
		return (RuleContext) payload;
	}
}
