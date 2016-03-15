/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package com.upstandinghackers.hammer;

import com.upstandinghackers.hammer.Hammer.TokenType;

/**
 * TODO: Write me!
 *
 * @author  (last commit) $Author$
 * @version $Revision$, $Date$
 * @since   TODO: add version number
 *
 */
public class TestAction2 
{
	public static ParsedToken execute(ParseResult p)
	{
		printResult( p.getAst() );
		System.out.println("testAction2");
		
		return p.getAst();
	}
	
	public static void printResult( ParsedToken tok )
    {
    	if( tok != null )
    	{
    		switch(tok.getTokenType())
    		{
    		case NONE: System.out.println("NONE"); break;
    		case BYTES: byte[] bytes = tok.getBytesValue(); 
    		            for( byte b : bytes )
    		            {
    		            	System.out.println(b+" ");
    		            }
    		            break;
    		case SINT: System.out.print(tok.getSIntValue()+" "); break;
    		case UINT: System.out.print(tok.getUIntValue()+" "); break;
    		case SEQUENCE: ParsedToken[] seq = tok.getSeqValue();
    					   for( ParsedToken t : seq )
    		               {
    		            	   printResult(t);
    		               }
    		               break;
    		case ERR: System.out.println("An error occured!"); break;
    		case USER: System.out.println("User"); break; //no supported jet
    		}
    	}
    }
}