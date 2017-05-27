default: all

all: Main

Main: Interface1.class Interface2.class MyClass.class Main.class

%.class: %.java
	javac $^

run: all
	java Main

clean:
	$(RM) *.class
