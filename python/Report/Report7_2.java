package Report;

import java.math.BigInteger;
import java.net.NoRouteToHostException;
import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;
public class Report7_2 {

    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
        System.out.print("二つの任意の正の整数の乗算を解きます");
        System.out.print("x=");
        int a = stdIn.nextInt();; 
        System.out.print("y=");
        int b = stdIn.nextInt(); 
        int ans =0;
        for(int i = 0 ;i<20;i++){
        int k = b;
        k = b >>i;
        int l  = k & 1;
        int x =((int) Math.pow(2,i)*l);
        ans = ans+a*x;
    }
    System.out.print(ans);
}
}