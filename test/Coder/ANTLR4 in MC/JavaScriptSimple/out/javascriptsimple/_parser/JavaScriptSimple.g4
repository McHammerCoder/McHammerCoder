/* generated from model null*/
/* generated by template parser.Parser*/

// Generated antlr file

// Parser header
/* generated by template parser.ParserHeader*/
grammar JavaScriptSimple;
@parser::header {
package javascriptsimple._parser;
import de.monticore.antlr4.MCParser;
}
@lexer::header {
package javascriptsimple._parser;
}
options {
superClass=MCParser;
}

@parser::members
{
// Global actions

// Convert functions
  // convert function for UnicodeEscapeSequence
private String convertUnicodeEscapeSequence(Token t)  {
    return t.getText().intern();
}

  // convert function for Var
private String convertVar(Token t)  {
    return t.getText().intern();
}

  // convert function for DecimalDigit
private String convertDecimalDigit(Token t)  {
    return t.getText().intern();
}

  // convert function for Identifier
private String convertIdentifier(Token t)  {
    return t.getText().intern();
}

  // convert function for IdentifierStart
private String convertIdentifierStart(Token t)  {
    return t.getText().intern();
}

  // convert function for WS
private String convertWS(Token t)  {
    return t.getText().intern();
}

  // convert function for KO
private String convertKO(Token t)  {
    return t.getText().intern();
}

  // convert function for EscapeSequence
private String convertEscapeSequence(Token t)  {
    return t.getText().intern();
}

  // convert function for HexEscapeSequence
private String convertHexEscapeSequence(Token t)  {
    return t.getText().intern();
}

  // convert function for EQ
private String convertEQ(Token t)  {
    return t.getText().intern();
}

  // convert function for SingleEscapeCharacter
private String convertSingleEscapeCharacter(Token t)  {
    return t.getText().intern();
}

  // convert function for HexDigit
private String convertHexDigit(Token t)  {
    return t.getText().intern();
}

  // convert function for SemiColon
private String convertSemiColon(Token t)  {
    return t.getText().intern();
}

  // convert function for StringCharacter
private String convertStringCharacter(Token t)  {
    return t.getText().intern();
}

  // convert function for DecimalIntegerLiteral
private String convertDecimalIntegerLiteral(Token t)  {
    return t.getText().intern();
}

  // convert function for StringLiteral
private String convertStringLiteral(Token t)  {
    return t.getText().intern();
}

  // convert function for UnicodeLetter
private String convertUnicodeLetter(Token t)  {
    return t.getText().intern();
}

  // convert function for CharacterEscapeSequence
private String convertCharacterEscapeSequence(Token t)  {
    return t.getText().intern();
}

  // convert function for EscapeCharacter
private String convertEscapeCharacter(Token t)  {
    return t.getText().intern();
}

}

// Lexer header
/* generated by template parser.LexerMember*/


@lexer::members {

// Add additional Java Code to lexer

private de.monticore.antlr4.MCParser _monticore_parser;
protected de.monticore.antlr4.MCParser getCompiler() {
   return _monticore_parser;
}
public void setMCParser(de.monticore.antlr4.MCParser in) {
  this._monticore_parser = in;
}
}

// Parser rules 
  
 // Start of 'ASTClassProd JavaScriptProgram'


javascriptprogram_eof returns [javascriptsimple._ast.ASTJavaScriptProgram ret = null] :
  tmp = javascriptprogram {$ret = $tmp.ret;} EOF ;


  javascriptprogram returns [javascriptsimple._ast.ASTJavaScriptProgram ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTJavaScriptProgram _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTJavaScriptProgram();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  ( tmp0=sourceelements{_aNode.setSourceElements(_localctx.tmp0.ret);}) ? 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd SourceElements'


sourceelements_eof returns [javascriptsimple._ast.ASTSourceElements ret = null] :
  tmp = sourceelements {$ret = $tmp.ret;} EOF ;


  sourceelements returns [javascriptsimple._ast.ASTSourceElements ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTSourceElements _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTSourceElements();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  ( tmp0=sourceelement{_aNode.getSourceElements().add(_localctx.tmp0.ret);}) + 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd SourceElement'


sourceelement_eof returns [javascriptsimple._ast.ASTSourceElement ret = null] :
  tmp = sourceelement {$ret = $tmp.ret;} EOF ;


  sourceelement returns [javascriptsimple._ast.ASTSourceElement ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTSourceElement _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTSourceElement();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
   tmp0=statement{_aNode.setStatement(_localctx.tmp0.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Statement'


statement_eof returns [javascriptsimple._ast.ASTStatement ret = null] :
  tmp = statement {$ret = $tmp.ret;} EOF ;


  statement returns [javascriptsimple._ast.ASTStatement ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTStatement _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTStatement();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
   tmp0=variablestatement{_aNode.setVariableStatement(_localctx.tmp0.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Statements'


statements_eof returns [javascriptsimple._ast.ASTStatements ret = null] :
  tmp = statements {$ret = $tmp.ret;} EOF ;


  statements returns [javascriptsimple._ast.ASTStatements ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTStatements _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTStatements();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  ( tmp0=statement{_aNode.getStatements().add(_localctx.tmp0.ret);}) + 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd VariableStatement'


variablestatement_eof returns [javascriptsimple._ast.ASTVariableStatement ret = null] :
  tmp = variablestatement {$ret = $tmp.ret;} EOF ;


  variablestatement returns [javascriptsimple._ast.ASTVariableStatement ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTVariableStatement _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTVariableStatement();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=Var{_aNode.setVar(convertVar($tmp0));}

  ) 
  
  (tmp1=WS{_aNode.setWS(convertWS($tmp1));}

  ) 
  
   tmp2=variabledeclarations{_aNode.setVariableDeclarations(_localctx.tmp2.ret);}  
  
   tmp3=eos{_aNode.setEOS(_localctx.tmp3.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd VariableDeclarations'


variabledeclarations_eof returns [javascriptsimple._ast.ASTVariableDeclarations ret = null] :
  tmp = variabledeclarations {$ret = $tmp.ret;} EOF ;


  variabledeclarations returns [javascriptsimple._ast.ASTVariableDeclarations ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTVariableDeclarations _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTVariableDeclarations();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
   tmp0=variabledeclaration{_aNode.getVariableDeclaration().add(_localctx.tmp0.ret);}  
  
  (
  
  (tmp1=KO{if (_aNode.getKOs()==null){_aNode.setKOs(new java.util.ArrayList());};  _aNode.getKOs().add(convertKO($tmp1));}

  ) 
  
  (tmp2=WS{if (_aNode.getWSs()==null){_aNode.setWSs(new java.util.ArrayList());};  _aNode.getWSs().add(convertWS($tmp2));}

  ) 
  
   tmp3=variabledeclaration{_aNode.getVariableDeclaration().add(_localctx.tmp3.ret);}  
  
  
)*
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd VariableDeclaration'


variabledeclaration_eof returns [javascriptsimple._ast.ASTVariableDeclaration ret = null] :
  tmp = variabledeclaration {$ret = $tmp.ret;} EOF ;


  variabledeclaration returns [javascriptsimple._ast.ASTVariableDeclaration ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTVariableDeclaration _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTVariableDeclaration();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=Identifier{_aNode.setIdentifier(convertIdentifier($tmp0));}

  ) 
  
  ( tmp1=initialiser{_aNode.setInitialiser(_localctx.tmp1.ret);}) ? 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Initialiser'


initialiser_eof returns [javascriptsimple._ast.ASTInitialiser ret = null] :
  tmp = initialiser {$ret = $tmp.ret;} EOF ;


  initialiser returns [javascriptsimple._ast.ASTInitialiser ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTInitialiser _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTInitialiser();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=WS{_aNode.setWS(convertWS($tmp0));}

  ) 
  
  (tmp1=EQ{_aNode.setEQ(convertEQ($tmp1));}

  ) 
  
   tmp2=singleexpression{_aNode.setSingleExpression(_localctx.tmp2.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd ExpressionSequence'


expressionsequence_eof returns [javascriptsimple._ast.ASTExpressionSequence ret = null] :
  tmp = expressionsequence {$ret = $tmp.ret;} EOF ;


  expressionsequence returns [javascriptsimple._ast.ASTExpressionSequence ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTExpressionSequence _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTExpressionSequence();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
   tmp0=singleexpression{_aNode.getSingleExpressions().add(_localctx.tmp0.ret);}  
  
  (
  
  (tmp1=KO{if (_aNode.getKOs()==null){_aNode.setKOs(new java.util.ArrayList());};  _aNode.getKOs().add(convertKO($tmp1));}

  ) 
  
  (tmp2=WS{if (_aNode.getWSs()==null){_aNode.setWSs(new java.util.ArrayList());};  _aNode.getWSs().add(convertWS($tmp2));}

  ) 
  
   tmp3=singleexpression{_aNode.getSingleExpressions().add(_localctx.tmp3.ret);}  
  
  
)*
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd SingleExpression'


singleexpression_eof returns [javascriptsimple._ast.ASTSingleExpression ret = null] :
  tmp = singleexpression {$ret = $tmp.ret;} EOF ;


  singleexpression returns [javascriptsimple._ast.ASTSingleExpression ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTSingleExpression _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTSingleExpression();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=WS{_aNode.setWS(convertWS($tmp0));}

  ) 
  
   tmp1=literal{_aNode.setLiteral(_localctx.tmp1.ret);}  
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Literal'


literal_eof returns [javascriptsimple._ast.ASTLiteral ret = null] :
  tmp = literal {$ret = $tmp.ret;} EOF ;


  literal returns [javascriptsimple._ast.ASTLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTLiteral _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=StringLiteral{_aNode.setStringLiteral(convertStringLiteral($tmp0));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd NumericLiteral'


numericliteral_eof returns [javascriptsimple._ast.ASTNumericLiteral ret = null] :
  tmp = numericliteral {$ret = $tmp.ret;} EOF ;


  numericliteral returns [javascriptsimple._ast.ASTNumericLiteral ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTNumericLiteral _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTNumericLiteral();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=DecimalIntegerLiteral{_aNode.setDecimalIntegerLiteral(convertDecimalIntegerLiteral($tmp0));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd EOS'


eos_eof returns [javascriptsimple._ast.ASTEOS ret = null] :
  tmp = eos {$ret = $tmp.ret;} EOF ;


  eos returns [javascriptsimple._ast.ASTEOS ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
javascriptsimple._ast.ASTEOS _aNode = null;
_aNode=javascriptsimple._ast.JavaScriptSimpleNodeFactory.createASTEOS();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  (tmp0=SemiColon{_aNode.setSemiColon(convertSemiColon($tmp0));}

  ) 
  
  ;
  // End of 'ASTClassProd'


// Extra Rules for Interfaces
 
// Lexer symbols
 
// Lexer rules 
  
 // Start of 'ASTLexProd SemiColon'
SemiColon 
  
:
  
  ';' 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd EQ'
EQ 
  
:
  
  '=' 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd KO'
KO 
  
:
  
  ',' 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd Var'
Var 
  
:
  
  'var' 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd Identifier'
Identifier 
  
:
  
  (
  
   IdentifierStart 
  )
+
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd StringLiteral'
StringLiteral 
  
:
  
  '\"' 
  (
  
   StringCharacter 
  )
*
  '\"' 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd StringCharacter'
fragment StringCharacter 
  
:
  
  ~(
  
  '\'' 
  |
  '"' 
  |
  '\\' 
  |
  '\r' 
  |
  '\n' 
  )

  |
  '\\' 
   EscapeSequence 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd EscapeSequence'
fragment EscapeSequence 
  
:
  
   CharacterEscapeSequence 
  |
   HexEscapeSequence 
  |
   UnicodeEscapeSequence 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd CharacterEscapeSequence'
fragment CharacterEscapeSequence 
  
:
  
   SingleEscapeCharacter 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd HexEscapeSequence'
fragment HexEscapeSequence 
  
:
  
  'x' 
   HexDigit 
   HexDigit 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd UnicodeEscapeSequence'
fragment UnicodeEscapeSequence 
  
:
  
  'u' 
   HexDigit 
   HexDigit 
   HexDigit 
   HexDigit 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd SingleEscapeCharacter'
fragment SingleEscapeCharacter 
  
:
  
  (
  
  '\'' 
  |
  '"' 
  |
  '\\' 
  |
  'b' 
  |
  'f' 
  |
  'n' 
  |
  'r' 
  |
  't' 
  |
  'v' 
  )

  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd EscapeCharacter'
fragment EscapeCharacter 
  
:
  
   SingleEscapeCharacter 
  |
   DecimalDigit 
  |
  (
  
  'x' 
  |
  'u' 
  )

  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd DecimalDigit'
fragment DecimalDigit 
  
:
  
  '0'..'9'  
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd HexDigit'
fragment HexDigit 
  
:
  
  (
  
  (
  
  '0'..'9'  
  )

  |
  (
  
  'a'..'f'  
  )

  |
  (
  
  'A'..'F'  
  )

  )

  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd DecimalIntegerLiteral'
fragment DecimalIntegerLiteral 
  
:
  
  '0' 
  |
  (
  
  '1'..'9'  
  )

  (
  
   DecimalDigit 
  )
*
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd IdentifierStart'
fragment IdentifierStart 
  
:
  
   UnicodeLetter 
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd WS'
WS 
  
:
  
  (
  
  '\t' 
  |
  '\u000B' 
  |
  '\u000C' 
  |
  '\u0020' 
  |
  '\u00A0' 
  )
+
  ;// End of 'ASTLexProd'

  
 // Start of 'ASTLexProd UnicodeLetter'
fragment UnicodeLetter 
  
:
  
  (
  
  '\u0041'..'\u005A'  
  )

  |
  (
  
  '\u0061'..'\u007A'  
  )

  |
  '\u00AA' 
  |
  '\u00B5' 
  |
  '\u00BA' 
  |
  (
  
  '\u00C0'..'\u00D6'  
  )

  |
  (
  
  '\u00D8'..'\u00F6'  
  )

  |
  (
  
  '\u00F8'..'\u021F'  
  )

  ;// End of 'ASTLexProd'

