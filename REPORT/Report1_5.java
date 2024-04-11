import java.util.Scanner;
public class Report1_5 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
     System.out.println("秒を単位とする時間を整数値で入力すれば, それを, 時, 分, 秒に分けて出力します");
     System.out.println("秒数:");
     int x =stdIn.nextInt();
     int y =x/3600;//時
     int z =(x-3600*y)/60;//分
     int s =(x-(3600*y+60*z));//秒
     System.out.println(y+"時間"+z+"分"+s+"秒");
       
}
}
