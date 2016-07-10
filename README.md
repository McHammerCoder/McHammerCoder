# McHammerCoder
Repository for the MontiCore4-Hammer-Coder project

# Prerequisites

**JDK 8**
 
**Maven**

# Installation Guide

##1. Installing Dependencies for Hammer:

**sudo apt-get install gcc scons pkg-config libglib2.0-0 glib2.0-dev**

##2. Installing McHammerCoder (Maven):

@ /core

**mvn clean install**

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
