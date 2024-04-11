import java.util.Random;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Report6_2 {

    static double cir(double x, double y) {
        double u = x * x;
        double v = y * y;
        if ((u + v) <= 1) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        long count = 9999;
        long u = 0;
        Random rand = new Random();
        for (int i = 1; i <= count; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            double p = cir(x, y);
            u += p;
            
            if(i%50==0){
                System.out.print(i+"点");
                double pp=((double) u*4 / i);
                double d=3.1415926-pp;
                double z =Math.abs(d);
                if(z>=1){
                }
                if(z<=1&&z>=0.5){
                     System.out.print("********");
                }
                if(z<0.5&&z>=0.1){
                    System.out.print("*******");
                }
                if(z<0.1&&z>=0.075){ 
                     System.out.print("******");
                }
                if(z<0.075&&z>=0.05){ 
                     System.out.print("*****");
                }
                if(z<0.05&&z>=0.025){
                      System.out.print("****");
                }
                if(z<0.025&&z>=0.01){
                    System.out.print("***");
                }
                if(z<0.01&&z>=0.0075){
                     System.out.print("**");
                }
                if(z<0.0075){
                     System.out.print("*");
                };
                System.out.println(pp);

            }
        }
        System.out.println("円周率は"+(double)u*4 /count);
    }
}
