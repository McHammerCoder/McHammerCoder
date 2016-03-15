package de.mchammer;

import org.antlr.runtime.tree.ParseTree;

import com.upstandinghackers.hammer.*;
import com.upstandinghackers.hammer.Hammer.TokenType;

/**
 * DNS-Parser
 * Parses a DNS message and returns an antlr-parsetree of it
 *
 * @author Tobias Bieschke
 */
public class Parser
{
	// Load Hammer Library via JNI
	static {
		System.loadLibrary("jhammer");
		System.loadLibrary("jhammer_actions");
	}
	
	/** Binary Fragment Token **/
	
    private com.upstandinghackers.hammer.Parser ubit = Hammer.bits(1, false);
    private com.upstandinghackers.hammer.Parser bit = Hammer.bits(1, true);
	
	private com.upstandinghackers.hammer.Parser bit0 = Hammer.intRange( ubit, 0, 0);
	private com.upstandinghackers.hammer.Parser bit1 = Hammer.intRange( ubit, 1, 1);
	
	/** Binary Token **/
	
	private com.upstandinghackers.hammer.Parser uInt_8 = Hammer.uInt8();
	private com.upstandinghackers.hammer.Parser uInt_16 = Hammer.uInt16();
	private com.upstandinghackers.hammer.Parser uInt_32 = Hammer.uInt32();
	private com.upstandinghackers.hammer.Parser uInt_64 = Hammer.uInt64();
	
	private com.upstandinghackers.hammer.Parser int_8 = Hammer.int8();
	private com.upstandinghackers.hammer.Parser int_16 = Hammer.int16();
	private com.upstandinghackers.hammer.Parser int_32 = Hammer.int32();
	private com.upstandinghackers.hammer.Parser int_64 = Hammer.int64();
	
	/** CharacterSet Fragment Token **/
	
	private com.upstandinghackers.hammer.Parser CH_space_DEFAULT = Hammer.intRange(uInt_8,32,32);
	private com.upstandinghackers.hammer.Parser CH_minus_DEFAULT = Hammer.intRange(uInt_8,45,45);
	private com.upstandinghackers.hammer.Parser CH_dot_DEFAULT = Hammer.intRange(uInt_8,45,45);
	private com.upstandinghackers.hammer.Parser CH_0_9_DEFAULT = Hammer.intRange(uInt_8,48,57);
	private com.upstandinghackers.hammer.Parser CH_A_Z_DEFAULT = Hammer.intRange(uInt_8,65,90);
	private com.upstandinghackers.hammer.Parser CH_a_z_DEFAULT = Hammer.intRange(uInt_8,97,122);
    
	/**
	 * @return Hammer-parser that parses a Domain in a DNS-message
	 */	
    private com.upstandinghackers.hammer.Parser getDomainParser()
    {
    	/** Domain Fragment Token **/
    	
    	com.upstandinghackers.hammer.Parser letter = Hammer.choice( CH_a_z_DEFAULT, CH_A_Z_DEFAULT );
    	com.upstandinghackers.hammer.Parser digit = CH_0_9_DEFAULT;
    	com.upstandinghackers.hammer.Parser let_dig = Hammer.choice( letter, digit );
    	com.upstandinghackers.hammer.Parser let_dig_hyp = Hammer.choice( let_dig, CH_minus_DEFAULT );
    	com.upstandinghackers.hammer.Parser ldh_string = Hammer.indirect();
    	ldh_string.bindIndirect( Hammer.choice( Hammer.action( Hammer.sequence(let_dig_hyp,ldh_string), "actUndefined"), let_dig));
    	
    	/** Domain Token */
    	
    	/*
    	Parser label = Hammer.action( Hammer.choice( Hammer.sequence(let_dig, ldh_string),
    		                          				 Hammer.sequence(let_dig)), 
    		                          "ActChoice" );
    	 
    	 */
    	com.upstandinghackers.hammer.Parser label = Hammer.action( Hammer.choice( Hammer.sequence(let_dig, ldh_string),
    															   				  Hammer.sequence(let_dig)), "actDNS_Label");
    	
    	/** Domain LexProds **/
    	
    	com.upstandinghackers.hammer.Parser subdomain = Hammer.action(Hammer.sequence( label,
    																                   Hammer.many1( Hammer.action( Hammer.sequence(Hammer.ch((byte)'.'),label),"actUndefined") ) ), "actUndefined");
    	
    	com.upstandinghackers.hammer.Parser domain = Hammer.action(Hammer.choice(subdomain,Hammer.ch((byte)' ')),"actDomain");
    	
        return domain;
    }
    
    /**
	 * @return Hammer-parser that parses a DNS-message
	 */
    private com.upstandinghackers.hammer.Parser getDNSParser()
    {
    	/** DNS Token **/
    	
    	com.upstandinghackers.hammer.Parser uBits_1 = ubit;
    	com.upstandinghackers.hammer.Parser uBits_3 = Hammer.bits(3, false);
    	com.upstandinghackers.hammer.Parser uBits_4 = Hammer.bits(4, false);
    	com.upstandinghackers.hammer.Parser uBits_16 = Hammer.bits(16, false);
    	
    	com.upstandinghackers.hammer.Parser uInt_16_0000 = Hammer.intRange(Hammer.bits(16, false), 0, 0);
    	com.upstandinghackers.hammer.Parser uInt_16_0001 = Hammer.intRange(Hammer.bits(16, false), 1, 1);
    	com.upstandinghackers.hammer.Parser uInt_16_00FF = Hammer.intRange(Hammer.bits(16, false), 16, 16);
    	
    	com.upstandinghackers.hammer.Parser hdzero = uBits_3;
    	
    	/** Domain Parser **/
    	
    	com.upstandinghackers.hammer.Parser domain = getDomainParser();   
    	
    	/** DNS LexProds **/
    	
    	com.upstandinghackers.hammer.Parser header = Hammer.action( Hammer.sequence( uBits_16,
											    									 uBits_1,
											    									 uBits_4,
											    									 uBits_1,
											    									 uBits_1,
											    									 uBits_1,
											    									 uBits_1,
											    									 hdzero,
											    									 uBits_4,
											    									 uInt_16,
											    									 uInt_16,
											    									 uInt_16,
											    									 uInt_16 ),
    																"actHeader" );
    	
    	com.upstandinghackers.hammer.Parser type = Hammer.intRange( uInt_16, 1, 16);
    	com.upstandinghackers.hammer.Parser qType = Hammer.choice( type, Hammer.intRange(uInt_16, 0xfc, 0xff) );
    	
    	com.upstandinghackers.hammer.Parser _class = Hammer.intRange(uInt_16, 1, 4);
    	com.upstandinghackers.hammer.Parser qClass = Hammer.choice( _class, Hammer.intRange(uInt_16, 255, 255) );
    	
    	com.upstandinghackers.hammer.Parser len = Hammer.intRange(uInt_8, 1, 0xff);
    	com.upstandinghackers.hammer.Parser label = Hammer.action( Hammer.lengthValue(len, uInt_8), "actDNS_Label" );
    	com.upstandinghackers.hammer.Parser qName = Hammer.action( Hammer.sequence( Hammer.action(Hammer.many1(label),"actUndefined"), CH_space_DEFAULT), "actQName" );
    	
    	com.upstandinghackers.hammer.Parser question = Hammer.action( Hammer.sequence( qName, qType, qClass ), "actQuestion" );
    	com.upstandinghackers.hammer.Parser rLen = uInt_16;
    	com.upstandinghackers.hammer.Parser rData = Hammer.action( Hammer.lengthValue(rLen, uInt_8), "actRData" );
    	com.upstandinghackers.hammer.Parser rR = Hammer.action( Hammer.action( Hammer.sequence( domain, type, _class, uInt_32, rData ), "actRR" ), "actUndefined" );
    	
    	com.upstandinghackers.hammer.Parser message = Hammer.action( Hammer.sequence( header, Hammer.action(Hammer.many(question),"actUndefined"), Hammer.many(rR), Hammer.endP()),
    																 "actMessage" );
    	
    	return message;  	
    }
    
    /**
     * parses a DNS-message
     * @param bytes DNS-message
     * @return Antlr-ParseTree
     */
    public ParseResult parse( byte[] bytes )
    {
    	com.upstandinghackers.hammer.Parser parser = getDNSParser();
    	return Hammer.parse(parser, bytes, bytes.length);
    }
}
