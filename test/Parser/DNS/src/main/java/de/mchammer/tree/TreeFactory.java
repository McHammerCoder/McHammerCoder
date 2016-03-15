/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.mchammer.tree;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.RuleContext;

import com.upstandinghackers.hammer.*;

/**
 * TODO: Write me!
 *
 * @author  (last commit) $Author$
 * @version $Revision$, $Date$
 * @since   TODO: add version number
 *
 */
public class TreeFactory 
{
	public static ParseTree create(ParseResult parseResult)
	{
		return generateParseTree(parseResult.getAst());
	}
	
	public static HAParseTree generateParseTree( ParsedToken tok )
    {    	
		CommonTokenFactory fac = new CommonTokenFactory();
		
    	if( tok != null )
    	{
    		switch(tok.getTokenType())
    		{
    		case NONE: System.out.println("NONE"); break;
    		case BYTES: byte[] bytes = tok.getBytesValue(); 
    		            for( byte b : bytes )
    		            {
    		            	return new HATerminalNode(fac.create(1, Byte.toString(b)));
    		            }
    		            break;
    		case SINT: return new HATerminalNode(fac.create(2, Long.toString(tok.getSIntValue())));
    		case UINT: return new HATerminalNode(fac.create(3, Long.toString(tok.getUIntValue())));
    		case SEQUENCE: ParsedToken[] seq = tok.getSeqValue();
    					   HAParseTree pt;
    					   if(TreeHelper.size() > 0)
    					   {
    						   TreeHelper.RuleContext context = (TreeHelper.RuleContext) TreeHelper.pop();
    						   pt = new HARuleNode( new HARuleContext( context.getType().ordinal() ) );
    					   } 
    					   else
    					   {
							   pt = new HARuleNode( new HARuleContext( TreeHelper.RuleType.RT_Undefined.ordinal() ) ); 						   
    					   }
    						   
    					   for( int i = seq.length-1; i >= 0; i-- )
    		               {
    						   HAParseTree child = generateParseTree(seq[i]);
    						   
    						   if( child.getPayload() instanceof HARuleContext && 
    							   ((HARuleContext)child.getPayload()).getRuleIndex() == TreeHelper.RuleType.RT_Undefined.ordinal() )
    						   {
    							   System.out.println("TEST TEST TEST");
    							   
    							   for( int j = child.getChildCount()-1; j >= 0; j-- )
    							   {
    								   pt.addChild((HAParseTree)child.getChild(j));
    							   }
    						   }
    						   else
    						   {
    							   pt.addChild(child);
    						   }
    		               }
    					  
    		               return pt;
    		case ERR: System.out.println("An error occured!"); break;
    		case USER: System.out.println("User"); break; //no supported jet
    		}
    	}
    	
    	return new HATerminalNode(fac.create(0, ""));    	
    }
	
	/*private static RuleContext getRuleContext(TreeHelper.RuleContext context)
	{
		switch(context.getType())
		{
		case RT_Message: return new RCMessage();
		default: return new RuleContext();
		}
	}*/
}
