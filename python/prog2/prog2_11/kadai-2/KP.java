// KP.java
import java.util.Scanner;
public class KP {
public static void main(String[] args) {
int num, capacity, answer; //データ数,
int[] weight, value;
// ファイルの読み込み
// 必要に応じて内容の確認
Solver s = Solver(num, weight, value, capacity);
answer = s.solve();
System.out.println(answer);
}
}