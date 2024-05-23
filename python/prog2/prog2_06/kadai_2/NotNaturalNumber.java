// 課題2: 自作の例外クラスを作る NotNaturalNumber.java
import java.util.Scanner;
//--- 範囲外例外 ---//
class NotNaturalNumber extends RuntimeException {
NotNaturalNumber(int n) { super("自然数ではない：" + n); }
}
