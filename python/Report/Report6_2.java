package Report;
import java.math.BigInteger;
import java.net.NoRouteToHostException;
import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;
class xy {
    static double cir(double x, double y) {
        double u = x * x;
        double v = y * y;
        if ((u + v) <= 1) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

public class Report6_2 {

    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
        long count =999999999;
        double u = 0;
        for(int i=1;i<=count;i++){
            double x = Math.random();
            double y = Math.random();
double p = cir(x,y);
u=u+p;
}
        System.out.println(4*u/count);
}       
}
}

    