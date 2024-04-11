import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Report2_2 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
     System.out.println("年を入力するとその年が閏年であるかどうか判断します。");
     System.out.println("年:");
     int x =stdIn.nextInt();
     int y = x%4;//4年
     int z = x%100;//100年
     int k= x%400;//400年
     if (y==0&&z==0&&k==0)
        System.out.println("閏年です！");
     else if (y==0&&z==0&&k!=0)
     System.out.println("閏年ではありません");
     else if (y==0&&z!=0)
     System.out.println("閏年です！");
    else 
    System.out.println("閏年ではありません");
    

        }
     }


