public class PrintCode {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("引数がありません");
            return;
        }
        for (String i : args) {
            for (char j : i.toCharArray()) {
                System.out.println(j + " " + (int) j);
            }
        }
    }
}