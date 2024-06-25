import java.util.Deque;
import java.util.LinkedList;

public class PrintNBase {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("使用法: java PrintNBase <基数> <個数>");
            System.exit(1);
        }

        try {
            int base = Integer.parseInt(args[0]);
            int count = Integer.parseInt(args[1]);
            if (base < 2 || 16 < base || count <= 0) {
                System.err.println("基数は2から16の間で、個数は1以上としてください");
                System.exit(1);
            }
            print(base, count);
        } catch (NumberFormatException e) {
            System.err.println("基数と個数はint型である必要があります");
            System.exit(1);
        }
    }

    public static void print(int base, int count) {
        Deque<String> deque = new LinkedList<>();
        int x =1;
        deque.add("1");//1は条件から

        for (int i = 0; i < count; i++) {
            String current = deque.poll();
            System.out.print(current + " ");
            for(int j =1;j<base+1;j++){
                x=x+1;
                String s = Integer.toString(x,base);
                x = Integer.parseInt(s, base);
                if (i < count - 1) { 
                    deque.add(s);
                }
            }
        }
    }
}