DIRS = kadai-1 kadai-2 challenge
NAME = ${USER}
NUM  = 11

all:;
	@for i in ${DIRS} ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i; \
		fi; \
	done

test:;
	@for i in ${DIRS} ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i test; \
		fi; \
	done

clean:;
	@for i in ${DIRS} ; do \
		if [ -d $$i -a -f $$i/Makefile ]; then \
			make  -C $$i clean; \
		fi; \
	done

zip:;
	zip -r -o ${NAME}_${NUM}.zip \
		report.txt \
		*/*.java \
		*/output \
		*/*.sh \
		kadai-1/*.log \
		*/*/*.txt \
		*/Makefile \
		Makefile

utf2sjis:;
	find . -name *.java | xargs nkf -s -Lw --overwrite
	find . -name *.txt | xargs nkf -s -Lw --overwrite
	find . -name Makefile | xargs nkf -s -Lw --overwrite
	find . -name *.sh | xargs nkf -w -Lu --overwrite
	find . -name report.txt | xargs nkf -s -Lw --overwrite

sjis2utf:;
	find . -name *.java | xargs nkf -w -Lu --overwrite
	find . -name *.txt | xargs nkf -w -Lu --overwrite
	find . -name *.sh | xargs nkf -w -Lu --overwrite
	find . -name Makefile | xargs nkf -w -Lu --overwrite
	find . -name report.txt | xargs nkf -w -Lu --overwrite

