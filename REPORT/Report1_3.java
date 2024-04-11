import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Report1_3 {
    public static void main(String[] args) throws Exception {
    Scanner stdIn =new Scanner(System.in);
    System.out.println("1,三角形, 2,四角形, 3,台形、4,円の中から数字で一つ選んでください");
int x =stdIn.nextInt();
switch(x){
    case 1:
      System.out.println("底辺の長さ:");
      double r = stdIn.nextDouble();
      System.out.println("高さ:");
      double h =stdIn.nextDouble();
    System.out.println("面積は"+(r*h)/2+"です。");
      break;
    case 2:
      System.out.println("底辺の長さ:");
      double r2 = stdIn.nextDouble();
      System.out.println("高さ:");
      double h2 =stdIn.nextDouble();
      System.out.println("面積は"+(r2*h2)+"です。");
      break;
    case 3:
      System.out.println("上辺の長さ:");
      double r3 = stdIn.nextDouble();
      System.out.println("底辺の長さ:");
      double r4 =stdIn.nextDouble();
      System.out.println("高さ:");
      double h3 =stdIn.nextDouble();
      System.out.println("面積は"+((r3+r4)/2)*h3+"です。");
      break;
    case 4:
    System.out.println("円の半径の長さ");  
    double r5 =stdIn.nextDouble();
    System.out.println("体積は"+r5*r5*3.14+"です。");


  }

    }
}

