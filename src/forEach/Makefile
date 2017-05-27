all: Main

Main: Java8ForEachExample.class

%.class: %.java
	javac $^

run: all
	java Java8ForEachExample

clean:
	$(RM) *.class

