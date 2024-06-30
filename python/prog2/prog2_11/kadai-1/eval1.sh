#!/bin/sh
echo "" > eval1.log
n=1
while [ $n -lt 45 ]; do
	echo "n=$n">>eval1.log
	java FiboDP $n>>eval1.log
	java FiboRec $n>>eval1.log
	n=`expr $n + 1`>>eval1.log
done
