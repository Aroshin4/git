.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1: FindFile1.java から main を検索】"
	$(JAVA) FindFile1 main FindFile1.java 

	@echo ""
	@echo "【確認2: FindFile1.java から FindFile1 を検索】"
	$(JAVA) FindFile1 FindFile1 FindFile1.java 

	@echo ""
	@echo "【確認3: FindFile1.java から TekitonaMojiretsu(存在しない文字列) を検索】"
	$(JAVA) FindFile1 TekitonaMojiretsu FindFile1.java 

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
