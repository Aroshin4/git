import java.math.BigInteger;
import java.net.NoRouteToHostException;
import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;
public class Report7_3 {
    public static class Complex {
        private double x;
        private double y;
        public Complex(double u, double t) {
            x = u;
            y = t;
        }
        double Re() {
        return x;
}
        double Im() {
        return y;
}
        String toStr() {
        return x+"+"+y+"i";
}
        void add(Complex d) {
    x = x+d.Re();
    y = y+d.Im();
}
        void sub(Complex d) {
    x = x-d.Re();
    y = y-d.Im();
}
        void mul(Complex d) {
    double x2 = x*d.Re()-y*d.Im();
    double y2 = x*d.Im()+y*d.Re();
    x = x2;
    y = y2;
}
        void div(Complex d) {
    double under = Math.pow(d.Re(), 2) + Math.pow(d.Im(), 2);
    double x2 = (x*d.Re()+y*d.Im()) /under;
    double y2 = (y*d.Re()-x*d.Im()) /under;
    x = x2;
    y = y2;
}
    Complex conj() {
            y=-y;
            return new Complex(x,y) ;
    
}
    double abs() {
    return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
}
}
public static void main(String[] args) throws Exception {
    Scanner stdIn =new Scanner(System.in);
    System.out.print("実部は");
    double u = stdIn.nextDouble();
    System.out.print("虚部は");
    double t = stdIn.nextDouble();
    System.out.print("引数の実部は");
    double x = stdIn.nextDouble();
    System.out.print("引数の虚部は");
    double y = stdIn.nextDouble();
    Complex TRY = new Complex(u,t);
    Complex TRY2= new Complex(u,t);
    Complex TRY3= new Complex(u,t);
    Complex d = new Complex(x,y);
        System.out.println("実部"+TRY.Re());
        System.out.println("虚部"+TRY.Im());
        System.out.println("式として表すと"+TRY.toStr());
        TRY.add(d);
        System.out.println("引数を足すと"+TRY.toStr());
        TRY.sub(d);
        TRY.sub(d);
        System.out.println("引数を引くと"+TRY.toStr());
        TRY.add(d);
        TRY.mul(d);
        System.out.println("引数をかけると"+TRY.toStr());
        TRY.div(d);
        TRY2.div(d);
        System.out.println("引数で割ると"+TRY2.toStr());
        TRY3.conj();
        System.out.println("協約複素数は"+TRY3.toStr());
        System.out.println("絶対値は"+TRY3.abs());
    }
}
