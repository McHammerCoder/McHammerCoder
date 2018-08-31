# McHammerCoder
McHammerCoder is a binary capable parser and unparser generator. It generates a parser and unparser based on a grammar defining their input and output language.
Injection attacks for the defined language are prevented by the unparser through automatic extraction and generation of an encoding.

It is presented at the LangSec Workshop http://spw17.langsec.org/papers.html#autoderiving

# Prerequisites

**JDK 8**
 
**Maven**

# Installation Guide

##1. Installing Dependencies for Hammer:

**sudo apt-get install gcc scons pkg-config libglib2.0-0 glib2.0-dev**

##2. Installing McHammerCoder (Maven):

@ /core

**mvn clean install**

If the installation does not complete on your system, there is a docker image available at https://hub.docker.com/r/notaname/mchammercoder/

# Combined Example Project:

@ /examples/McHammerCoder-Example-Maven-Webapp

**mvn clean jetty:run**

This starts a simple website. It allows to test McHammerCoder's capabilities in the context of XML and HTML.

# Parser Only Example Project:

@ /examples/McHammer-Example-DNSSimple-Project

##Compile
**mvn clean install**

##Execute
**mvn exec:java -Dexec.mainClass="de.monticore.mchammercoder.examples.DNSSimpleExample" -Dexec.args="ValidDNS.dns"**

This parses a file called "ValidDNS.dns", checks the tokens of the parse tree and displays it.

#Output Folder Structure:

######/out/resources - libjhammer_actions.so
######/out/examples - HTMLRedTool + HTMLRedInjector
######/out/htmlred/_coder - MCHammerCoder
######/out/htmlred/_mch_parser - MCHammerParser
