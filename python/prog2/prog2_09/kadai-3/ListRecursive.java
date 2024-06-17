// ListRecursive.java
import java.io.*; 
public class ListRecursive {
    public static void main(String[] args) {
    if (args.length != 1) {
        System.out.println("使用法：java ListRecursive ディレクトリ名");
        System.exit(0);
        }
        String dirname = args[0];
        File dir = new File(dirname);
        printList(0, dir);
    }
    public static void printList(int depth, File dirname) {
        String space = "  ".repeat(depth);
        System.out.println(space+ dirname.getName() + "/");
        File[] files = dirname.listFiles();
        if (files == null) {
            return;
        }
        for (File element : files) {
            if (element.isDirectory()) {
                printList(depth + 1, element);
            } else {
                System.out.println(space+"  "+element.getName());
            }
        }
    }
}
    
