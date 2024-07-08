.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
kadai1	= GraphTester
kadai2	= BFSTester
kadai3	= DFSTester

all: $(CLASS)

kadai1:;$(CLASS)
        $(JAVA) $(kadai1)

kadai2:;$(CLASS)
        $(JAVA) $(kadai2)

test:;
	@echo 今回は make test は使用しません

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
