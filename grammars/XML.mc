package mc.lang.xml;

version "1.0.0";

/**
 * Grammar for generic XML documents
 *
 * @author Antonio Navarro Perez <perez@se-rwth.de>
 */
grammar XML extends mc.lang.xml.XMLLiterals {

    /*========================================================================*/
    /*============================== OPTIONS =================================*/
    /*========================================================================*/

    options {
        nostring nomlcomments noslcomments noident
        lexer lookahead = 3
    }
    
    /*=======================================================================*/
    /*============================= INTERFACES ==============================*/
    /*=======================================================================*/
    
    interface / XMLElement extends (TAG_L) => XMLElementContent;
      
    interface XMLElementContent;
    
    interface XMLMetaMarkup
        extends (COMMENT_L | PI_L | CDATA_L) => XMLElementContent;
            
    /*=======================================================================*/
    /*============================ PRODUCTIONS ==============================*/
    /*=======================================================================*/
    
    / XMLDocument = 
        metaMarkupBeforeDoctype:XMLMetaMarkup*
        doctype:XMLDTD?
        metaMarkupBeforeRoot:XMLMetaMarkup*
        rootElement:XMLElement
        metaMarkupAfterRoot:XMLMetaMarkup*;
    
    / XMLNonEmptyElement
            implements
            (TAG_L! (XMLIDENT ":")? XMLIDENT XMLAttribute* TAG_R!) =>
            XMLElement = 
        TAG_L!
            (namespace:XMLIDENT ":")?
            name:XMLIDENT
            attributes:XMLAttribute*
        TAG_R!
            content:XMLElementContent*
        TAG_L_SLASH!
            (closingTagNamespace:XMLIDENT ":")?
            closingTagName:XMLIDENT
        TAG_R!;
       
    / XMLEmptyElement
            implements
            (TAG_L! (XMLIDENT ":")? XMLIDENT XMLAttribute* TAG_R_SLASH!) =>
            XMLElement = 
        TAG_L!
            (namespace:XMLIDENT ":")?
            name:XMLIDENT
            attributes:XMLAttribute*
        TAG_R_SLASH!;
                
    / XMLAttribute =
        (namespace:XMLIDENT ":")?
        name:XMLIDENT
        "=" QUOTE 
            value:XMLAttributeValue
        QUOTE;

    / XMLAttributeValue = 
        (
            (JAVASCRIPT ":" javascriptvalue:XMLPCDATA_JAVASCRIPT) 
            |(value:XMLPCDATA_ATTRIBUTE)
        )
        
    ;

    /*-----------------------------------------------------------------------*/

    / XMLText implements XMLElementContent =
        text:XMLPCDATA;

    /*-----------------------------------------------------------------------*/

    XMLComment implements (COMMENT_L) => XMLMetaMarkup =
        COMMENT_L!
            text:XMLPCDATA_COMMENT?
        COMMENT_R!;

    XMLProcessingInstruction implements (PI_L) => XMLMetaMarkup =
        PI_L!
            target:XMLIDENT
            content:XMLPCDATA_PI?
        PI_R!;
        
    XMLCDATA implements (CDATA_L) => XMLMetaMarkup =
        CDATA_L!
            content:XMLPCDATA_CDATA?
        CDATA_R!;
    
    XMLDTD =
        DTD_L!
            type:XMLIDENT
            content:XMLPCDATA_DTD?
        DTD_R!;
         
    /*=======================================================================*/
    /*============================== ASTRULES ===============================*/
    /*=======================================================================*/
    
    ast XMLElement = 
        name:/String
        namespace:/String
        attributes:XMLAttribute*
        content:XMLElementContent*;

}