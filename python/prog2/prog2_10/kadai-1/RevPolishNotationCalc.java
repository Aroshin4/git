import java.util.*;

public class RevPolishNotationCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            try {
                double result = calc(line);
                System.out.println(result);
            } catch (InvalidEquation e ) {
                System.out.println("エラー: " + e.getMessage());
            } catch(InvalidTerm e){
                System.out.println("エラー: " + e.getMessage());
            }
        }
        sc.close();
    }

    public static double calc(String s) throws InvalidEquation, InvalidTerm {
        LinkedList<Double> stack = new LinkedList<Double>();
        String[] set = s.trim().split("\\s+");//一番前と一番後ろの空白を削除して分割→配列に
        for (String n : set) {
            if (Number(n)) {//+-*/のどれかであるか判定
                stack.push(Double.parseDouble(n));
            } else if ("+-*/".contains(n)) {
                operator(stack, n);
            } else {
                throw new InvalidTerm("不適切な項が含まれています" );
            }
        }
        if (stack.size() != 1) {
            throw new InvalidEquation("スタックに数値が残っています");
        }
        return stack.pop();
    }

    private static void operator(LinkedList<Double> stack, String operator) throws InvalidEquation {
        if (stack.size() < 2) {
            throw new InvalidEquation("スタックに数値が残っています");
        }
        double a = stack.pop(); 
        double b = stack.pop();
        switch (operator) {
            case "+":
                stack.push(b+a);
                break;
            case "-":
                stack.push(b-a);
                break;
            case "*":
                stack.push(a*b);
                break;
            case "/":
                stack.push(b/a);
                break;
        }
    }

    private static boolean Number(String s) {
        try {
            Double.parseDouble(s);//double型か判定
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}