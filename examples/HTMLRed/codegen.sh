clear

cd "../../core/Monticore/monticore-cli/target"
cp "monticore-cli-4.3.0.1-jar-with-dependencies.jar" "../../../../examples/HTMLRed/monticore-cli.jar"

cd "../../../../examples/HTMLRed/"
rm -R out

java -jar monticore-cli.jar HTMLRed.mc4
