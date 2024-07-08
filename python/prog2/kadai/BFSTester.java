// 課題2: 幅優先木の作成と最短経路探索 BFSTester.java

import java.util.Arrays;

public class BFSTester{
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("使用法: java BFSTester <ファイル名> <start> <end>");
            return;
        }
        String filename = args[0];
        int start = Integer.parseInt(args[1]);
        int end = Integer.parseInt(args[2]);
        BFSTree bfsTree = new BFSTree();
        bfsTree.loadGraph(filename);
        int[] Parent = bfsTree.getBFSTree(start);
        System.out.println("BFS Tree: root = "+start);
        System.out.println(Arrays.toString(Parent));

        int[] shortest = bfsTree.getShortestPath(start, end);
        System.out.println("Shortest Path " + start + " -> "+end);
        for (int i = 0; i < shortest.length; i++) {
            if (i > 0) System.out.print("->");
            System.out.print(shortest[i]);
        }
        System.out.println();
    }
}


