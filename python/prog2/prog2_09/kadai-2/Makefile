.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1: java.txtから Java を検索】"
	$(JAVA) SearchWord java.txt Java
	@echo "---"

	@echo "";
	@echo "【確認2: java.txtから latest を検索】"
	$(JAVA) SearchWord java.txt latest
	@echo "---"

	@echo "";
	@echo "【確認3: java.txtから Microsoft を検索】"
	$(JAVA) SearchWord java.txt Microsoft
	@echo "---"

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
