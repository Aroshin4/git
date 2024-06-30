#!/bin/sh
# バッチ処理用のシェルスクリプトを作成する
input_dir="input"
output_dir="output"
mkdir -p $output_dir
for i in `seq -w 01 30`; do #-wは01等を出力するのに必要
    input_file="input/${i}.txt"
    output_file="output/${i}.txt"
    java KP $input_file > $output_file
done