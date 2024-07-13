//課題2: ダイクストラ法による最短経路探索 DijkstraTester.java
public class DijkstraTester{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法: java DjkstraTester <file名>");
            return;
        }
        Graph g = new Graph();
        g.loadGraph(args[0]);
        g.printGraph();
    }
}