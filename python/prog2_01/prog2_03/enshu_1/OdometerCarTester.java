// 演習問題1 自動車クラスの拡張 OdometerCarTester.java
import java.util.Scanner;
public class OdometerCarTester{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        OdometerCar a = new OdometerCar("カローラ",1600, 1400, 4360, 20.0,new Day(2000,4,20), 0.0);
        a.putSpec();
        do{
            System.out.print("x座標の移動距離:");
            double x = s.nextDouble();
            System.out.print("y座標の移動距離:");
            double y = s.nextDouble();
            a.move(x,y);
        }while(a.getFuel()>=0);
    }
}