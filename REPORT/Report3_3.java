import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Report3_3 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
        System.out.println("整数n∈[3,27]を入力すると,i + j + k = n となる１桁の自然数 i, j, k を列挙します");
        System.out.println("n:");
        int n =stdIn.nextInt();
        if(n<3||n>27){
            System.out.println("可能な値ではありません");
        }
        else{
            for (int i=1;i<26;i++) {
                for (int j=1;j<26;j++){
                    int k = n-i-j;
                    if(k>=1&&k<=26){
                        System.out.println("("+i+","+j+","+k+")");
                     }
                }
        }
    }
}
}