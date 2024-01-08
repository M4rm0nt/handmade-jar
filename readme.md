
# Compile
## -d .class file destination folder
## --source-path path to source files
## source files 
rm -rf target
mkdir target
javac --source-path=src/main/java -d ./target/classes --class-path ./lib/* src/main/java/de/marmont/training/*.java

# Run app
## -cp (add local classes and library folder -> entry delimiter on windows ";" on linux ":" )
## 
java -cp "./target/classes:./lib/*" de.marmont.training.Main
Hello App

# Create jar
jar --verbose --create --file=target/runnable.jar --manifest=src/main/resources/manifest.mf -C "./target/classes" .

# Run jar with explicit main class
java -cp "./target/*:./lib/commons-collections4-4.4.jar" de.marmont.training.Main

# Run jar with implicit main class
mkdir -p target/dist/lib
cp -r lib target/dist
cp -r target/runnable.jar target/dist/runnable.jar

java -jar target/dist/runnable.jar


