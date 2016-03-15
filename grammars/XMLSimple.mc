package mc.lang.xmlsimple;

version "0.0.1";

/**
 */
grammar XMLSimple {

    /*========================================================================*/
    /*============================== OPTIONS =================================*/
    /*========================================================================*/

    options {
        nostring nomlcomments noslcomments noident
        lexer lookahead = 4
    }

    concept antlr {
        lexer java {
            boolean inTag = false;
            boolean inScript = false;

            private boolean checkBufferForScript(char[] buf, int begin, int length){
                String script1 = "script";
                String script2 = script1.toUpperCase();
                int scriptPos = 0;
                for(int i = 0; i < length ;i++){
                    if(buf[begin+i] == script1.charAt(scriptPos) || buf[begin+i] == script2.charAt(scriptPos)){
                        scriptPos++;
                        if(scriptPos >= script1.length()){
                            return true;
                        }
                    }else if(buf[begin+i] >= 0 && buf[begin+i] <= ' '){

                    }else{
                        return false;
                    }

                }
                return false;
            }
        }
    }

    XML =
        XMLElements?
    ;

    XMLElements =
        XMLElement+
    ;

    XMLElement = 
        XMLVoidTag |
        XMLDoctypeTag |
        XMLXMLTag |
        (
            content:TagBodyContent |
            (
                {tmpemb_lang = "script";}
                script:ScriptTagBodyContent<lang>
            )
        ) |
        XMLNormalTag
    ;


    XMLVoidTag = TagOpenStart 
                    {tmpemb_lang = "tag";}
                    (Content<lang>)
                    TagVoidEnd;
    XMLNormalTag = XMLStartTag XMLElements? XMLEndTag;

    XMLDoctypeTag = TagOpenDoctypeStart Content TagEnd;
    XMLXMLTag = TagXMLStart Content TagXMLEnd;

    XMLStartTag = TagOpenStart 
                    {tmpemb_lang = "tag";}
                    (Content<lang>)
                    TagEnd;

    XMLEndTag = TagCloseStart Content TagEnd;

    DummyRegelWS = WS;

// TOKEN

    token TagOpenStart                   = "<"  { inTag = true; };
    token TagOpenDoctypeStart            = "<!" { inTag = true; };
    token TagXMLStart                    = "<?" { inTag = true; };
    token TagCloseStart                  = "</" { inTag = true; };
    token TagEnd                         = ">"  { inTag = false; };
    token TagVoidEnd                     = "/>" { inTag = false; };
    token TagXMLEnd                      = "?>" { inTag = false; };


    // funktioniert nicht wie erhofft, da ANTLR kein Backtracking oder NFA->DFA Konvertierung macht.
    // token Comment = CommentStart ( () | (('\u0020'..'\u01FF')* ~('-') ~('-') ~('>'))) CommentEnd;
    subparser token Content = 
        {inTag}?
        (ContentStart ({!((LA(1) == '?' && LA(2) == '>') || (LA(1) == '/' && LA(2) == '>'))}?ContentMiddle)*)
        {if(checkBufferForScript(text.getBuffer(), _begin, text.length()-_begin)){inScript = !inScript;}}
    ;
    token TagBodyContent = 
        {!inTag && !inScript}?
        (ContentStart ({!((LA(1) == '?' && LA(2) == '>') || (LA(1) == '/' && LA(2) == '>'))}?ContentMiddle)*)
    ;
    subparser token ScriptTagBodyContent = 
        {!inTag && inScript}?
        (({!((LA(1) == '<' && LA(2) == '/' && LA(3) == 's'))}?~('\u0000'))+)
    ;

    encodeTable TagBodyContent = {
        '&' -> "&amp;",
        '<' -> "&lt;",
        '>' -> "&gt;"
    };
    encodeTable ScriptTagBodyContent = {
        "</script" -> "<\\/script" options{caseInsensitive; ignoreWS;}
    };


    token Comment = CommentStart (({LA(1) != '-' && LA(2) != '-' && LA(3) != '>'}?('\u0020'..'\u01FF'))* ) CommentEnd;



    protected token CommentStart = "<!--";
    protected token CommentEnd = "-->";

    protected token ContentStart = ~('\n'|'\r'|'\t'|'\u000B'|'\u000C'|'\u0020'|'\u00A0' | '<' | '>');
    protected token ContentMiddle = ~('<' | '>');
    //protected token All = ('\u0020'..'\u01FF');





}