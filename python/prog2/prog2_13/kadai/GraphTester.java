//課題1: Graphクラスの重み付きグラフへの拡張 GraphTester.java
public class GraphTester{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法: java GraphTester <file名>");
            return;
        }
        Graph g = new Graph();
        g.loadGraph(args[0]);
        g.printGraph();
    }
}