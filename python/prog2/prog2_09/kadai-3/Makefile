.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo "確認1: 【カレントディレクトリに存在する1stディレクトリ以下を表示】"
	$(JAVA) ListRecursive ./

	@echo ""
	@echo "確認2: 【親ディレクトリ(../)を表示】"
	$(JAVA) ListRecursive ../

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
