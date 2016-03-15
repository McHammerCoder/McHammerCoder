package mc.lang.xml;

version "1.0.0";

/**
 * Literal definitions for generic XML documents
 *
 * @author Antonio Navarro Perez <perez@se-rwth.de>
 */
grammar XMLLiterals {

    options {
        nostring nomlcomments noslcomments noident
        lexer lookahead = 3
    }
    
    /*=======================================================================*/
    /*========================= ANTLR CONFIGURATION =========================*/
    /*=======================================================================*/    
    
    concept antlr {
        lexer java {
            
            private static final int NO = 0;
            private static final int YES = 1;
            private static final int PREFIX = 2;
            private static final int SUFFIX = 3;
            
            int inTag = NO;
            int inComment = NO;
            int inAttribute = NO;
            int inPI = NO;
            int inCDATA = NO;
            int inDTD = NO;
            boolean javaScriptNext = false;

            long elementStack = 0;
            
            private int flip(int i) {
                
                int r = NO;
                
                if(i == NO) { r = YES; }
                if(i != NO) { r = NO; }
                
                return r;
            }
            
            private int inMarkup() {
            
                boolean inMarkup = (
                    inTag == YES ||
                    inComment == YES ||
                    inPI == YES ||
                    inCDATA == YES ||
                    inDTD == YES);
                    
                return inMarkup ? YES : NO;
            }

        }
    }
    
    /*=======================================================================*/
    /*============================ LEXICAL RULES ============================*/
    /*=======================================================================*/

    ident TAG_L =
        { inMarkup() == NO }?
        '<'
        { inTag = YES; elementStack++; };
    
    ident TAG_L_SLASH =
        { inMarkup() == NO }?
        "</"
        { inTag = YES; elementStack--; };
    
    ident TAG_R =
        { inTag == YES }?
        '>' 
        { inTag = NO; };
        
    ident TAG_R_SLASH =
        { inTag == YES }?
        "/>"
        { inTag = NO; elementStack--; };

    ident COMMENT_L =
        { inMarkup() == NO }?
        "<!--"
        { inComment = YES; };
    
    ident COMMENT_R =
        { inComment == YES }?
        "-->"
        { inComment = NO; };
        
    ident PI_L =
        { inMarkup() == NO }?
        "<?"
        { inPI = PREFIX; };

    ident PI_R =
        { inPI == YES }?
        "?>"
        { inPI = NO; };

    ident CDATA_L =
        { inMarkup() == NO }?
        "<![CDATA["
        { inCDATA = YES; };
        
    ident CDATA_R =
        { inCDATA == YES }?
        "]]>"
        { inCDATA = NO; };

    ident DTD_L =
        { inMarkup() == NO }?
        "<!"
        { inDTD = PREFIX; };

    ident DTD_R =
        { inDTD == YES }?
        ">"
        { inDTD = NO; };

    ident QUOTE =
        { inTag == YES }?
        '"'
        { inAttribute = flip(inAttribute); };

    ident XMLIDENT options { testLiterals = true; } =    
        { ( inTag == YES || inPI == PREFIX || inDTD == PREFIX )
            && inAttribute == NO }?
        ( 'A'..'Z' | 'a'..'z' | '0'..'9' | '_' )
        ( 'A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' | '.' )*
        { if (inPI == PREFIX)
            { inPI = YES; }
          if (inDTD == PREFIX)
            { inDTD = YES; }
        };

    ident XMLPCDATA =
        { inTag == NO && inMarkup() == NO && elementStack > 0 }? 
        ( ~( '<' ) )+;
    encodeTable XMLPCDATA = {
        '&' -> "&#x26;",
        '<' -> "&lt;",
        '>' -> "&gt;"
    };

    ident XMLPCDATA_COMMENT =
        { inTag == NO && inComment == YES }?
        ( ~( '-' ) )+; // ( ~( "--" ) )+
    encodeTable XMLPCDATA_COMMENT = {
        '&' -> "&#x26;",
        '-' -> "&#45;"
    };

    ident XMLPCDATA_PI =
        { inTag == NO && inPI == YES }? 
        ( ~( '?' ) )+; // ( ~( PI_R ) )+
    encodeTable XMLPCDATA_PI = {
        '&' -> "&#x26;",
        '?' -> "&#63;"
    };

    ident XMLPCDATA_CDATA =
        { inTag == NO && inCDATA == YES }?
        ( ~( ']' ) )+; // ( ~( CDATA_R ) )+
    encodeTable XMLPCDATA_CDATA = {
        '&' -> "&#x26;",
        ']' -> "&#93;"
    };

    ident XMLPCDATA_DTD =
        { inTag == NO && inDTD == YES }?
        ( ~( '>' ) )+; // ( ~( DTD_R ) )+
    encodeTable XMLPCDATA_DTD = {
        '&' -> "&#x26;",
        '>' -> "&gt;"
    };
        
    ident XMLPCDATA_ATTRIBUTE =
        { inTag == YES && inAttribute == YES && !javaScriptNext}?
        ( ~( '"' ) )+;
    encodeTable XMLPCDATA_ATTRIBUTE = {
//        options{
//            prefix = "\"";
//            suffix = "\"";
//        }
        '&' -> "&#x26;",
        '"' -> "&quot;",
        '<' -> "&lt;",
        '>' -> "&gt;",
        '\'' -> "&apos;",
        "javascript:" -> ""
    };

    subparser token XMLPCDATA_JAVASCRIPT =
        { inTag == YES && inAttribute == YES && javaScriptNext}?
        ( ~( '"' ) )+
        { javaScriptNext = false; }
    ;
    encodeTable XMLPCDATA_JAVASCRIPT = {
//        options{
//            prefix = "\"";
//            suffix = "\"";
//        }
        '&' -> "&#x26;",
        '"' -> "&quot;",
        '<' -> "&lt;",
        '>' -> "&gt;",
        '\'' -> "&apos;",
        "javascript:" -> ""
    };

    token JAVASCRIPT =
        "javascript"
        { javaScriptNext = true; }
    ;

        
}