all: Main

Main: Main.class

%.class: %.java
	javac $^

run: all
	java Main

clean:
	$(RM) *.class

