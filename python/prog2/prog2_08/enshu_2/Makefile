.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1 \"ABCDEFGHI\" \"EFG\"を指定】"
	$(JAVA) SearchString2 ABCDEFGHI EFG
	@echo
	@echo "【確認2 \"ABCDEFGHI\" \"XYG\"を指定】"
	$(JAVA) SearchString2 ABCDEFGHI XYG 
	@echo
	@echo "【確認3 \"ABCDEFGHI\" を指定(引数が不適切)】"
	$(JAVA) SearchString2 ABCDEFGHI 


$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
