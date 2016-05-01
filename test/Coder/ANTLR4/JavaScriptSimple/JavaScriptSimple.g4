/** THE GRAMMAR IS NOT COMPLETLY PORTED USE AT YOUR OWN RISK! 
author: Peter Stanchev

tested on:
var line = "test123", variable  = "test2";

known bugs:
none

*/
// parser rules start with lowercase letters, lexer rules with uppercase
grammar JavaScriptSimple;



Var : 
	  'var';

WS :
		[ \t\r\n]+; /** -> skip to skip it */

Digit : 
		[0-9]+;


EOS : 
	 ';';

ID : 
		[b-zB-Z]+ ;


javascriptprogram : 
					sourceElements? ;


sourceElements : 
				sourceElement+ ;

sourceElement : 
				statement;

statement : 	
			variableStatement ;


statements : 
			statement+ ;

variableStatement :
					Var WS variableDeclarations EOS;

variableDeclarations : 
					  variableDeclaration (',' WS variableDeclaration)*;

variableDeclaration : 
					  identifier initialiser? ;

initialiser : 
			  WS '=' singleExpression ;

expressionSequence : 
					singleExpression (',' WS singleExpression)* ;

singleExpression :
				   WS literal;


literal : 
		 '"' (ID (Digit)*) '"' ; 

identifier : 
			 ID;
