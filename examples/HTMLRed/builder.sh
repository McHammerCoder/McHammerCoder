sh codegen.sh
cd ./out/resources
make dir=. allfiles
cd ../../
javac -cp monticore-cli.jar -sourcepath "out/:out/resources/" out/example/HTMLRedParserTool.java
java -Djava.library.path=./out/resources -cp "out/:out/resources/:monticore-cli.jar" example.HTMLRedParserTool "test.html" "test"

