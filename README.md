# McHammerCoder
Repository for the MontiCore4-Hammer-Coder project

# Example Guide

##1. Installing Dependencies for Hammer:

**sudo apt-get install gcc scons pkg-config libglib2.0-0 glib2.0-dev**

##2. Installing Hammer (Maven):

@ /core/Hammer

**mvn clean install**

##3. Installing Monticore (Maven):

@ /core/Monticore

**mvn clean install**

##4. Code Generation:

@ /examples/HTMLRed

**sh codegen.sh**

##5. Compile Generated Code:

@ /examples/HTMLRed

**javac -cp monticore-cli.jar -sourcepath "out/" out/example/HTMLRedTool.java**

##6. Run TestTool:

@ /examples/HTMLRed

**java -Djava.library.path=./out/resources -cp "out/:monticore-cli.jar" example.HTMLRedTool FILENAME INJECTION**

######FILENAME = The name of the template-file (test.html)
######INJECTION = Every occurrence of "Text" in any token will be replaced with this injection

##Folder Structure:

######/out/resources - libjhammer_actions.so
######/out/examples - HTMLRedTool + HTMLRedInjector
######/out/htmlred/_coder - MCHammerCoder
######/out/htmlred/_mch_parser - MCHammerParser
