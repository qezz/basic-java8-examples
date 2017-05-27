all: Main

Main: Interface1.class Main.class

%.class: %.java
	javac $^

run: all
	java Main

clean:
	$(RM) *.class
