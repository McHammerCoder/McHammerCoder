/* generated from model null*/
/* generated by template parser.Parser*/

// Generated antlr file

// Parser header
/* generated by template parser.ParserHeader*/
grammar HTMLRedAntlr;
@parser::header {
package htmlred._parser;
import de.monticore.antlr4.MCParser;
}
@lexer::header {
package htmlred._parser;
}
options {
superClass=MCParser;
}

@parser::members

{
// Global actions

// Convert functions
  // convert function for TEXTB
private String convertTEXTB(Token t)  {
    return t.getText();
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


// Global actions

// Parser rules 
  
 // Start of 'ASTClassProd P'


p_eof returns [htmlred._ast.ASTP ret = null] :
  tmp = p {$ret = $tmp.ret;} EOF ;


  p returns [htmlred._ast.ASTP ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
htmlred._ast.ASTP _aNode = null;
_aNode=htmlred._ast.HTMLRedNodeFactory.createASTP();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal <p>'
('<p>')// End of 'ASTTerminal'

  (
  
   tmp0=alternatives{_aNode.getAlternativess().add(_localctx.tmp0.ret);}  
  
  
)*
  
 // Start of 'ASTTerminal </p>'
('</p>')// End of 'ASTTerminal'

  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd Alternatives'


alternatives_eof returns [htmlred._ast.ASTAlternatives ret = null] :
  tmp = alternatives {$ret = $tmp.ret;} EOF ;


  alternatives returns [htmlred._ast.ASTAlternatives ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
htmlred._ast.ASTAlternatives _aNode = null;
_aNode=htmlred._ast.HTMLRedNodeFactory.createASTAlternatives();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
   tmp0=p{_aNode.setP(_localctx.tmp0.ret);}  
  
  |
   tmp1=b{_aNode.setB(_localctx.tmp1.ret);}  
  
  |
   tmp2=i{_aNode.setI(_localctx.tmp2.ret);}  
  
  |
  (tmp3=TEXTB{_aNode.setTEXTB(convertTEXTB($tmp3));}

  ) 
  
  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd B'


b_eof returns [htmlred._ast.ASTB ret = null] :
  tmp = b {$ret = $tmp.ret;} EOF ;


  b returns [htmlred._ast.ASTB ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
htmlred._ast.ASTB _aNode = null;
_aNode=htmlred._ast.HTMLRedNodeFactory.createASTB();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal <b>'
('<b>')// End of 'ASTTerminal'

  (tmp0=TEXTB{_aNode.setText(convertTEXTB($tmp0));}

  ) 
  
  
 // Start of 'ASTTerminal </b>'
('</b>')// End of 'ASTTerminal'

  ;
  // End of 'ASTClassProd'

  
 // Start of 'ASTClassProd I'


i_eof returns [htmlred._ast.ASTI ret = null] :
  tmp = i {$ret = $tmp.ret;} EOF ;


  i returns [htmlred._ast.ASTI ret = null]
@init{// ret is normally returned, a is used to be compatible with rule using the return construct
htmlred._ast.ASTI _aNode = null;
_aNode=htmlred._ast.HTMLRedNodeFactory.createASTI();
$ret=_aNode;
_aNode.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
setActiveASTNode(_aNode);
}
@after{_aNode.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));}
  
 : 
  
  
 // Start of 'ASTTerminal <i>'
('<i>')// End of 'ASTTerminal'

  (tmp0=TEXTB{_aNode.setText(convertTEXTB($tmp0));}

  ) 
  
  
 // Start of 'ASTTerminal </i>'
('</i>')// End of 'ASTTerminal'

  ;
  // End of 'ASTClassProd'


// Extra Rules for Interfaces
 
// Lexer symbols
 
// Lexer rules 
  
 // Start of 'ASTLexProd TEXTB'
TEXTB 
  
:
  
  (
  
  'a'..'z'  
  |
  'A'..'Z'  
  |
  '_' 
  |
  '0'..'9'  
  |
  ' ' 
  |
  '#' 
  |
  '$' 
  )
+
  ;// End of 'ASTLexProd'


