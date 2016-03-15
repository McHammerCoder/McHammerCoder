/*
 * Copyright (c) 2016 RWTH Aachen. All rights reserved.
 *
 * http://www.se-rwth.de/ 
 */
package de.mchammer.tree;

import java.util.LinkedList;

/**
 * Used by the TreeFactory to create an Antlr-ParseTree from a Hammer.ParseResult
 */
public class TreeHelper 
{
	private static LinkedList<Context> postfixTree = new LinkedList<Context>();
	
	public static void push(Context context)
	{
		postfixTree.push(context);
	}
	
	public static Context pop()
	{
		return postfixTree.pop();
	}
	
	public static Context get()
	{
		return postfixTree.getLast();
	}
	
	public static int size()
	{
		return postfixTree.size();
	}
	
	public static interface Context
	{
		
	}
	
	public static class RuleContext implements Context
	{
		private RuleType type;
		/**
		 * @return the type
		 */
		public RuleType getType() 
		{
			return type;
		}
		
		public RuleContext(RuleType type)
		{
			this.type = type;
		}
	}
	
	public static class TokenContext implements Context
	{
		private TokenType type;
		/**
		 * @return the type
		 */
		public TokenType getType() 
		{
			return type;
		}
		
		public TokenContext(TokenType type)
		{
			this.type = type;
		}
	}
	
	public enum Type
	{
		C_Token,
		C_Rule
	};
	
	public enum TokenType
	{
		TT_UInt8,
		TT_UInt16,
		TT_UInt32,
		TT_UInt64,
		TT_Int8,
		TT_Int16,
		TT_Int32,
		TT_Int64,
		TT_Dot,
		TT_WS,
		TT_Label,
		TT_BitsU_1,
		TT_BitsU_3,
		TT_BitsU_4,
		TT_BitsU_16
					
	}
	
	public static String [] TokenTypeNames =
	{
		"UInt8",
		"UInt16",
		"UInt32",
		"UInt64",
		"Int8",
		"Int16",
		"Int32",
		"Int64",
		".",
		" ",
		"Label",
		"BitsU_1",
		"BitsU_3",
		"BitsU_4",
		"BitsU_16"
	};
	
	public enum RuleType
	{
		RT_Undefined,
		RT_Subdomain,
		RT_Domain,
		RT_Hdzero,
		RT_Header,
		RT_Type,
		RT_QType,
		RT_Class,
		RT_QClass,
		RT_Len,
		RT_DNS_Label,
		RT_QName,
		RT_Question,
		RT_RLen,
		RT_RData,
		RT_RR,
		RT_Message
	}
	
	public static String [] RuleTypeNames =
	{
		"Undefined",
		"Subdomain",
		"Domain",
		"Hdzero",
		"Header",
		"Type",
		"QType",
		"Class",
		"QClass",
		"Len",
		"DNS_Label",
		"QName",
		"Question",
		"RLen",
		"RData",
		"RR",
		"Message"
	};
}
