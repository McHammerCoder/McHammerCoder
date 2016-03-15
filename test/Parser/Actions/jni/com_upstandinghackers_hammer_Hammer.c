#include "jhammer.h"
#include "internal.h"
#include "com_upstandinghackers_hammer_Hammer.h"
#include <stdlib.h>

static JavaVM* jvm;

HParsedToken* callAction(const HParseResult *p, const char* name)
{
    JNIEnv *env;
    jint rs = (*jvm)->GetEnv(jvm, (void**) &env, JNI_VERSION_1_6);
    assert (rs == JNI_OK);
    rs = (*jvm)->AttachCurrentThread(jvm, (void**) &env, NULL);
    assert (rs == JNI_OK);

    jclass actionsClass;
    FIND_CLASS(actionsClass, env, "de/mchammer/Actions");
   
    jmethodID mid = (*env)->GetStaticMethodID(env, actionsClass, name, "(Lcom/upstandinghackers/hammer/ParseResult;)Lcom/upstandinghackers/hammer/ParsedToken;");
    if (mid == 0)
    {
	return NULL;
    }

    jclass argumentClass;
    FIND_CLASS(argumentClass, env, "com/upstandinghackers/hammer/ParseResult");
    assert(argumentClass != NULL);
    jmethodID constructor = REFCONSTRUCTOR_(env, argumentClass);
    assert(constructor != NULL);
    jobject parseResult = (*env)->NewObject(env, argumentClass, constructor, (jlong)p);

    jobject parsedToken = (*env)->CallStaticObjectMethod(env, actionsClass, mid, parseResult);
    assert(parsedToken != NULL);
    
    return (HParsedToken *)((*env)->GetLongField(env, parsedToken, (*env)->GetFieldID(env, FIND_CLASS_(env, "com/upstandinghackers/hammer/ParsedToken"), "inner", "J")));
}

HParsedToken* act_Undefined(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actUndefined");
}

HParsedToken* act_Subdomain(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actSubdomain");
}

HParsedToken* act_Domain(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actDomain");
}

HParsedToken* act_Hdzero(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actHdzero");
}

HParsedToken* act_Header(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actHeader");
}

HParsedToken* act_Type(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actType");
}

HParsedToken* act_QType(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actQType");
}

HParsedToken* act_Class(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actClass");
}

HParsedToken* act_QClass(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actQClass");
}

HParsedToken* act_Len(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actLen");
}

HParsedToken* act_DNS_Label(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actDNS_Label");
}

HParsedToken* act_QName(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actQName");
}

HParsedToken* act_Question(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actQuestion");
}

HParsedToken* act_RLen(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actRLen");
}

HParsedToken* act_RData(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actRData");
}

HParsedToken* act_RR(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actRR");
}

HParsedToken* act_Message(const HParseResult *p, void* user_data) 
{
    return callAction(p,"actMessage");
}

JNIEXPORT jobject JNICALL Java_com_upstandinghackers_hammer_Hammer_action
  (JNIEnv *env, jclass class, jobject p, jstring a)
{
    //RETURNWRAP(env, h_middle(UNWRAP(env, p), UNWRAP(env, x), UNWRAP(env, q)));

    jint rs = (*env)->GetJavaVM(env, &jvm);
    assert (rs == JNI_OK);

    const char *actionName = (*env)->GetStringUTFChars(env, a, 0);

    if( strcmp(actionName,"actUndefined") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Undefined, NULL) );
    }
    else if( strcmp(actionName,"actSubdomain") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Subdomain, NULL) );
    }
    else if( strcmp(actionName,"actDomain") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Domain, NULL) );
    }
    else if( strcmp(actionName,"actHdzero") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Hdzero, NULL) );
    }
    else if( strcmp(actionName,"actHeader") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Header, NULL) );
    }
    else if( strcmp(actionName,"actType") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Type, NULL) );
    }
    else if( strcmp(actionName,"actQType") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_QType, NULL) );
    }
    else if( strcmp(actionName,"actClass") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Class, NULL) );
    }
    else if( strcmp(actionName,"actQClass") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_QClass, NULL) );
    }
    else if( strcmp(actionName,"actLen") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Len, NULL) );
    }
    else if( strcmp(actionName,"actDNS_Label") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_DNS_Label, NULL) );
    }
    else if( strcmp(actionName,"actQName") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_QName, NULL) );
    }
    else if( strcmp(actionName,"actQuestion") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Question, NULL) );
    }
    else if( strcmp(actionName,"actRLen") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_RLen, NULL) );
    }
    else if( strcmp(actionName,"actRData") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_RData, NULL) );
    }
    else if( strcmp(actionName,"actMessage") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Message, NULL) );
    }
    else if( strcmp(actionName,"actRR") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_RR, NULL) );
    }
    else if( strcmp(actionName,"actMessage") == 0 )
    {
	RETURNWRAP( env, h_action(UNWRAP(env, p), act_Message, NULL) );
    }
    else return p;
}

