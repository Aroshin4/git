#!/bin/sh
# 課題2の検証処理を記述
input_dir="graph"
output_dir="output"
mkdir -p $output_dir
for i in `seq -w 001 030`; do #-wは01等を出力するのに必要
    input_file="graph/graph${i}.txt"
    output_file="output/${i}.txt"
    java BFSTester $input_file 0 200 > $output_file
done