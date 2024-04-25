.SUFFIXES: .java .class

JAVAC	= javac
JAVA	= java
SRC	= $(wildcard *.java)
CLASS	= $(SRC:.java=.class)
PROGRAM	= $(shell pwd)
MAIN	= PeriodTester

all: $(CLASS)

test: $(CLASS)
	$(JAVA) $(MAIN)

define CHECK
1989
1
8
2019
4
30
endef
export CHECK

test2: $(CLASS)
	@echo "day1に1989/1/8，day2に2019/4/30を設定し、それぞれの引数を逆順にして\
Periodクラスのインスタンスp1,p2を作成する。p1とp2は同じ期間が表示されているか確認する。\
また、day1の日付を1/1/1に変更した場合でも、Periodクラスのインスタンスに影響がないことを確認する。\
さらに、p1のtoの内容をday3に取得し、さらに1/1/1に変更してもPeriodクラスのインスタンスに影響がないことを確認する。"
	@echo "$${CHECK}"  | $(JAVA) $(MAIN)

$(CLASS): $(SRC)

.java.class:
	$(JAVAC) $<

clean:;	\rm -f *.class

