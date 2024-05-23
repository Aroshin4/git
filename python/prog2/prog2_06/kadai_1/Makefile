.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= TextToUpperTester

all: $(CLASS)

test: $(CLASS)
	@if [ -e _foobar.txt ]; then mv _foobar.txt foobar.txt; fi
	@echo
	@mv foobar.txt _foobar.txt
	@echo "【確認1】foobar.txtが存在しない状態でプログラムを実行";	
	$(JAVA) $(MAIN)
	@echo
	@mv _foobar.txt foobar.txt
	@echo "【確認2】foobar.txtが存在する状態でプログラムを実行";	
	$(JAVA) $(MAIN)
	@echo
	@echo "【参考】foobar.txtの一部（先頭10行）を表示"
	@head -10 foobar.txt

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class
