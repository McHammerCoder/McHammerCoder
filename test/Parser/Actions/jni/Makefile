JSOURCES := Hammer.java
JSOURCES_NATIVE := Hammer
CSOURCES := com_upstandinghackers_hammer_Hammer.c

# ls *.h *.o *.so com/upstandinghackers/hammer/*.class | grep -v jhammer.h | tr '\n' ' '; replace single $ with $$
OUTPUTS := com/upstandinghackers/hammer/Hammer.class com_upstandinghackers_hammer_Hammer.h com_upstandinghackers_hammer_Hammer.o libjhammer.so

TOPLEVEL := ..

JC=javac
JH=javah
CP=com/upstandinghackers/hammer
PACKAGE=com.upstandinghackers.hammer

include ../common.mk


CFLAGS += -fPIC -L $(TOPLEVEL)/jni -ljhammer -I. -I $(TOPLEVEL)/src/ -I jni -I $(JAVA_HOME)/include -I $(JAVA_HOME)/include/linux

%.java: $(call ifsilent,| $(HUSH))
	$(call hush, "Compiling Java source $@") $(JC) $(CP)/$@

all: javacc prepare compile link

link: compile
	$(call hush, "Generating libjhammer2.so") $(CC) -shared $(CFLAGS) -o libjhammer_actions.so *.o ../build/opt/src/*.os ../build/opt/src/backends/*.os ../build/opt/src/parsers/*.os

$(CSOURCES): prepare
	$(call hush, "Compiling $@") $(CC) -c $(CFLAGS) $@

compile: prepare $(CSOURCES)

prepare: javacc $(JSOURCES_NATIVE)

$(JSOURCES_NATIVE): javacc
	$(call hush, "Generating JNI headers for $@") $(JH) $(PACKAGE).$@

javacc: $(JSOURCES)

#TODO make this not-as-hardcoded
#clean:
#	rm $(CP)/*.class && rm com_upstandinghackers_*.h && rm com_upstandinghackers_*.o && rm libjhammer.so
