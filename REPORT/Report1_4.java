import java.util.Scanner;
public class Report1_4 {
    
    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
        System.out.println("xとyの2つの数の足し算, 引き算, 掛け算, 割り算の結果を表示します");
        System.out.print("xの値:");
         double x =stdIn.nextDouble();
        System.out.print("yの値:");
         double y =stdIn.nextDouble();
         System.out.println("x+y="+(x+y));
         System.out.println("x-y="+(x-y));
         System.out.println("x*y="+(x*y));
         System.out.println("x/y="+(x/y));
         System.out.println("x%y="+(x%y));


    }

    
}
