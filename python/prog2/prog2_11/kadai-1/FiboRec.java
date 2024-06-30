// FiboRec.java
public class FiboRec {
    public static long fibon(int n) {
        if (n <= 2) {
            return 1;
        }else{
            return fibon(n - 1) + fibon(n - 2);
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("使用法: java FiboRec 何番目の数か(例　20)");
            return;
        }

        int n = Integer.parseInt(args[0]);
        double start = System.nanoTime();
        long result = fibon(n);
        double end = System.nanoTime();
        double time = (end - start)/1000000 ;
        System.out.println( "Rec: "+result +"  "+ time + " (ms)");
    }
}