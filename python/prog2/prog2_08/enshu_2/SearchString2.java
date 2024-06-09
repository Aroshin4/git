// 演習問題2: SearchString2.java
import java.util.Scanner;

class SearchString2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("文字列1は ");
		String s1 = args[0];
        System.out.println("文字列2は ");
		String s2 = args[1];
		int idx = s1.indexOf(s2);
		if (idx == -1)
			System.out.println("s1中にs2は含まれません。");
		else
			System.out.println("s1の" + (idx + 1) + "文字目にs2が含まれます。");
			System.out.println("s1: " + s1);
            String padding = " ".repeat(idx);
            System.out.println("s2: " + padding + s2);
	}
}
