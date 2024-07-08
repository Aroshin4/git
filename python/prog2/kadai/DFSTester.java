import java.util.Arrays;

public class DFSTester {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("使用法: java DFSTester <ファイル名> <start> <end>");
            return;
        }
        String filename = args[0];
        int start = Integer.parseInt(args[1]);
        int end = Integer.parseInt(args[2]);

        DFSTree dfsTree = new DFSTree();
        dfsTree.loadGraph(filename);

        int[] parent = dfsTree.getDFSTree(start);
        System.out.println("DFS Tree: root = " + start);
        System.out.println(Arrays.toString(parent));

        int[] path = dfsTree.getPath(start, end);
        System.out.println("Path " + start + " -> " + end);
        for (int i = 0; i < path.length; i++) {
            if (i > 0) System.out.print("->");
            System.out.print(path[i]);
        }
        System.out.println();
    }
}