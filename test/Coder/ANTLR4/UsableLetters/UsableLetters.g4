/** fragment token DecimalDigit =
  fragment token UnicodeLetter =
        ('\u0041'..'\u005A')
        | ('\u0061'..'\u007A')
        | '\u00AA'
        | '\u00B5'
        | '\u00BA'
        | ('\u00C0'..'\u00D6')
        | ('\u00D8'..'\u00F6')
        | ('\u00F8'..'\u021F')
    ;
fragment token StringCharacter =
        ~('\''|'"'|'\\'|'\r'|'\n')
        | '\\' EscapeSequence
    ;
In theory all undefined input should be dropped - fuzzy parsing (does not work rules too similar)
TODO unicode letter parsing 
*/

grammar UsableLetters;
/** LEXER */

SingleLetter: 
				[a-z]|[A-Z] ;

Capname :
			[A-Z][a-zA-Z0-9]*;

WS :
		[ \t\r\n]+ -> skip;
		
SingleDigit: 
			[0-9];


SingleSymbol:[\\\'";,.~|];

Name: [a-zA-Z0-9]+;


Smt : [a-zA-Z0-9]+;

MLComment
 : '/**' .* '*/' -> skip ;

SLComment
 : '//' ~('\r' | '\n')* -> skip ;

/** PARSER */


baserules : baserule+;

baserule : 'fragment'? 'token' Capname '=' '('? series+ ')'?  ('*'|'+'|'?')? ';' ;

series :   singleQuotedSymbol|singleQuotedDigit|singleQuotedLetter|numserie|letterserie|ruleserie '|'? ( numserie |  letterserie | ruleserie | singleQuotedDigit| singleQuotedLetter)* ;

numserie : ('|')? '('? '\''SingleDigit'\'' '..' '\''SingleDigit'\'' ')'? ('*'|'+'|'?')? ;

ruleserie : ('|')? '('? Capname ')'? ('*'|'+'|'?')? ;

singleQuotedLetter:  ('|')? '\''SingleLetter'\'';

singleQuotedDigit:  ('|')? '\''SingleDigit'\'';

singleQuotedSymbol: ('|')? '\''SingleSymbol'\'';

letterserie : ('|')? '('? '\''SingleLetter'\'' '..' '\''SingleLetter'\'' ')'? ('*'|'+'|'?')? ;























