import java.math.BigInteger;
import java.net.NoRouteToHostException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Report5_1 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
        System.out.println("２から１００までの階乗を計算します");
        BigInteger x = BigInteger.ONE;
for(int j = 2;j<=100;j++){
    x=x.multiply(BigInteger.valueOf(j));
    System.out.println(j + "の階乗:" + x);
   
       
}
}
}