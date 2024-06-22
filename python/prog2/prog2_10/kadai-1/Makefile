.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= RevPolishNotationCalc

all: $(CLASS)

test: $(CLASS)
	@echo "【検証 input.txtの内容を入力】"
	$(JAVA) $(MAIN) < input.txt

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
