all:
	javac -cp lib/*.jar src/*.java -d bin
	java -cp bin src/Runner