all:
	javac src/*.java -d bin
	java -cp bin src/Runner