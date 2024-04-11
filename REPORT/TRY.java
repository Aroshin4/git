import java.util.Random;

public class TRY {
    private static final int TOTAL_POINTS = 10000;
    private static final int POINTS_PER_UPDATE = 50;
    private static final double TRUE_PI = 3.1415926;
    
    public static void main(String[] args) {
        int insideCircle = 0;
        
        Random rand = new Random();
        
        for (int i = 1; i <= TOTAL_POINTS; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            
            if (x*x + y*y <= 1) {
                insideCircle++;
            }
            
            if (i % POINTS_PER_UPDATE == 0) {
                double piEstimate = 4.0 * insideCircle / i;
                System.out.println("After " + i + " iterations:");
                System.out.println("Estimated Pi = " + piEstimate);
                System.out.println("Difference to true Pi = " + Math.abs(piEstimate - TRUE_PI));
                System.out.println();
            }
        }
    }
}