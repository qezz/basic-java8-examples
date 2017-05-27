DIRS = $(shell find ./* -type d)

all:
	for d in $(DIRS); do make -C $$d; done

run:
	for d in $(DIRS); do make run -C $$d; done

clean:
	for d in $(DIRS); do make clean -C $$d; done

sourcefiles:
	find . -type f -name "*.java" -print
