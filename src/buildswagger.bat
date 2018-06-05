@ECHO OFF

cd ..

IF NOT EXIST bin (
    mkdir bin
)

mkdir bin 

cd src/swagger-client

gradlew.bat jar
ECHO "Build completed"

cd build/libs

xcopy /s swagger-java-client-1.0.0.jar ..\..\..\..\bin

ECHO "Datei kopiert"