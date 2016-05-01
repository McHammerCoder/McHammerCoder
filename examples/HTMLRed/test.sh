java -Djava.library.path=. -cp "out/:monticore-cli.jar" example.HTMLRedTool testCases/test1 "Text" 

java -Djava.library.path=. -cp "out/:monticore-cli.jar" example.HTMLRedTool testCases/test1 "<p>"

java -Djava.library.path=. -cp "out/:monticore-cli.jar" example.HTMLRedTool testCases/test1 "<p><i><b> Test"

java -Djava.library.path=. -cp "out/:monticore-cli.jar" example.HTMLRedTool testCases/test1 " ### "

java -Djava.library.path=. -cp "out/:monticore-cli.jar" example.HTMLRedTool testCases/test2 " ### "

java -Djava.library.path=. -cp "out/:monticore-cli.jar" example.HTMLRedTool testCases/test2 "Did we<p> break<b> yet</i> # $"

java -Djava.library.path=. -cp "out/:monticore-cli.jar" example.HTMLRedTool testCases/test2 "the quick brown fox jumps over the lazy dog###THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
