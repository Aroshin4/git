// KP.java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class KP {
public static void main(String[] args) {
int num, capacity, answer; //データ数,
int[] weight, value;
if (args.length != 1) {
    System.out.println("使用法: java KP <file名>");
    return;
}
String filename = args[0];
        try {// ファイルの読み込み
            Scanner scanner = new Scanner(new File(filename));
            num = scanner.nextInt();
            capacity = scanner.nextInt();
            weight = new int[num];
            value = new int[num];
            for (int i = 0; i < num; i++) {
                weight[i] = scanner.nextInt();
                value[i] = scanner.nextInt();
            }
            scanner.close();
// 必要に応じて内容の確認
Solver s = new Solver(num, weight, value, capacity);
answer = s.solve();
System.out.println(answer);
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}