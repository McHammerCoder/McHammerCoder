rm -R out/

rm monticore-cli.jar

cd /home/aether/Desktop/McHammerCoder/core/Monticore/monticore-cli/target

cp monticore-cli-4.3.0.1-jar-with-dependencies.jar /home/aether/Desktop/McHammerCoder/examples/HTMLRed/monticore-cli.jar

cd /home/aether/Desktop/McHammerCoder/examples/HTMLRed

java -jar monticore-cli.jar HTMLRed.mc4
