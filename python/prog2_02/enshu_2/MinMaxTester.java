// 演習2: MinMaxクラスの作成 MinMaxTester.java
public class MinMaxTester{
    public static void main(String[] args) {
        MinMax a = new MinMax();
        int n[] = {50,70,40,80,55};
        System.out.println("二つの値の最大値"+a.Max(10,20));
        System.out.println("三つの値の最大値"+a.Max(10,20,30));
        System.out.println("配列の要素の最大値"+a.Max(n));
        System.out.println("二つの値の最小値"+a.Min(10,20));
        System.out.println("三つの値の最小値"+a.Min(10,20,30));
        System.out.println("配列の要素の最小値"+a.Min(n));
    }
}
