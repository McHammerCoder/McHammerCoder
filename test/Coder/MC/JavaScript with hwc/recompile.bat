SET PATH="C:\Program Files\Java\jdk1.8.0_65\bin";%PATH%
java -jar monticore-cli.jar JavaScript.mc4 -hcp hwc/
javac -cp monticore-cli.jar -sourcepath "src/;out/;hwc/" src/JavaScriptTool.java
cmd