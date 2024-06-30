// FiboDP.java
public class FiboDP {
    public static long fibon(int n) {
        if (n < 3) {
            return 1;
        }
        int[] x = new int[n+1];
        x[1] = 1;
        x[2] = 1;
        for (int i = 3; i <= n; i++) {
            x[i] = x[i-1] + x[i-2];
        }
        return x[n];
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("使用法: java FiboDP 何番目の数か(例　20)");
            return;
        }

        int n = Integer.parseInt(args[0]);
        double start = System.nanoTime();
        long result = fibon(n);
        double end = System.nanoTime();
        double time = (end - start)/1000000 ;
        System.out.println( "DP: "+result +"  "+ time + " (ms)");
    }
}
