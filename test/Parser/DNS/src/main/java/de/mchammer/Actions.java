/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.mchammer;

import com.upstandinghackers.hammer.ParseResult;
import com.upstandinghackers.hammer.ParsedToken;

import de.mchammer.tree.*;

/**
 * Class that contains all actions the parser might call while parsing
 */
public class Actions 
{
	public static ParsedToken actUndefined(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Undefined) );
		
		return p.getAst();
	}
	
	public static ParsedToken actSubdomain(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Subdomain) );
		
		return p.getAst();
	}
	
	public static ParsedToken actDomain(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Domain) );
		
		return p.getAst();
	}
	
	public static ParsedToken actHdzero(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Hdzero) );
		
		return p.getAst();
	}
	
	public static ParsedToken actHeader(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Header) );
		
		return p.getAst();
	}
	
	public static ParsedToken actType(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Type) );
		
		return p.getAst();
	}
	
	public static ParsedToken actQType(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_QType) );
		
		return p.getAst();
	}
	
	public static ParsedToken actClass(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Class) );
		
		return p.getAst();
	}
	
	public static ParsedToken actQClass(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_QClass) );
		
		return p.getAst();
	}
	
	public static ParsedToken actLen(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Len) );
		
		return p.getAst();
	}
	
	public static ParsedToken actDNS_Label(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_DNS_Label) );
		
		return p.getAst();
	}
	
	public static ParsedToken actQName(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_QName) );
		
		return p.getAst();
	}
	
	public static ParsedToken actQuestion(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Question) );
		
		return p.getAst();
	}
	
	public static ParsedToken actRLen(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_RLen) );
		
		return p.getAst();
	}
	
	public static ParsedToken actRData(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_RData) );
		
		return p.getAst();
	}
	
	public static ParsedToken actRR(ParseResult p)
	{		
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_RR) );
		
		return p.getAst();
	}
	
	public static ParsedToken actMessage(ParseResult p)
	{				
		TreeHelper.push( new TreeHelper.RuleContext(TreeHelper.RuleType.RT_Message) );
		
		System.out.println("actMessage : " + TreeHelper.size() );
		
		return p.getAst();
	}
	
}
