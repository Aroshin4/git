.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= PrintNBase

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1: 10進数で1から順番に100個分の数値（＝100まで）】"
	$(JAVA) $(MAIN) 10 100
	@echo "---"

	@echo "【確認2: 16進数で1から順番に100個分の数値】"
	$(JAVA) $(MAIN) 16 100
	@echo "---"

	@echo "【確認3: 2進数で1から順番に100個分の数値】"
	$(JAVA) $(MAIN) 2 100
	@echo "---"

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class *.*~ *~
