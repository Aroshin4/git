.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)

all: $(CLASS)

test: $(CLASS)
	@echo "【確認1: sample_utf8.txtをコピーしてdiffで検証】"
	$(JAVA) FileCopy sample_utf8.txt sample_utf8-copy.txt
	diff sample_utf8.txt sample_utf8-copy.txt && echo "OK" || echo "NG"
	@echo "---"

	@echo "【確認2: sample_sjis.txtをコピーしてdiffで検証】"
	$(JAVA) FileCopy sample_sjis.txt sample_sjis-copy.txt
	diff sample_sjis.txt sample_sjis-copy.txt && echo "OK" || echo "NG"
	@echo "---"

	@echo "【確認3: sample.jpgをコピーしてdiffで検証】"
	$(JAVA) FileCopy sample.jpg sample-copy.jpg
	diff sample.jpg sample-copy.jpg && echo "OK" || echo "NG"
	@echo "---"

	@echo "【コピーしたファイルを削除】"
	\rm -f *-copy.*

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class *-copy.*
