.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= FiboRec FiboDP

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1 n=5の場合】"
	$(JAVA) FiboRec 5
	$(JAVA) FiboDP 5
	@echo "---"

	@echo ""
	@echo "【確認2 n=40の場合】"
	$(JAVA) FiboRec 40
	$(JAVA) FiboDP 40
	@echo "---"

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class 

