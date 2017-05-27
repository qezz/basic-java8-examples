all: Main

Main: HelloXilinx.class

%.class: %.java
	javac $^

run: all
	java HelloXilinx

clean:
	$(RM) *.class
