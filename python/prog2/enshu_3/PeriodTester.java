// 演習問題3: 期間クラスのテスタークラス PeriodTester.java
public class PeriodTester {
    public static void main(String[] args) {

        Period[] a = new Period[1];
        a[0]= new Period(new Day(2040,7,29),new Day(2024,5,26));
        System.out.println(a[0].toStr());
}
}