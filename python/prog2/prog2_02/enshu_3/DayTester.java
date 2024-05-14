// 演習問題3: 日付クラスの改良 DayTester.java
public class DayTester{
    public static void main(String[] args) {
        Day[] a = new Day[3];
        a[0]= new Day();
        a[1]= new Day(2000,8,15);
        a[2]= new Day(2010,5,18);
        System.out.println("今日の日付は"+a[0]);
        System.out.println("a[1]の日付は"+a[1]);
        System.out.println("a[2]の日付は"+a[2]);
        System.out.println("a[1]はa[2]よりも前の日付である "+Day.before(a[1],a[2]));
        System.out.println("a[1]はa[2]よりも前の日付である "+a[1].before(a[2]));
    }
}