// RevPolishNotationCalc.java
import java.util.Scanner;
import java.util.*;
public class RevPolishNotationCalc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()==true) {
            String line = sc.nextLine();
            try {
                calc(line);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
    public static double calc(String s){
        LinkedList<Double> stack = new LinkedList<Double>();
        String[] st =s.split("");
        for(String :st){

        }
    }
}
