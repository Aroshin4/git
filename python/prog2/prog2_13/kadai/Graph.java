//課題1: Graphクラスの重み付きグラフの拡張 Graph.java
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
// 課題1: テキストファイルからグラフを作成 Graph.java
class Edge{
    private int to; // 接続先となるノード番号
    private double w;
    Edge(int to){this.to =to;}
    Edge(double wei) {
        this.w =wei;
    }
    int To(){return to;}
    double Wei(){
        return w;
    }
}
    class Node{
    int id; // ノード番号
    ArrayList<Edge> list; // Edge リスト
    ArrayList<Edge> wlist;//重みリスト
    Node(int id){
        this.id = id; list = new ArrayList<Edge>();
        wlist = new ArrayList<Edge>();
    }
    Node(int id, String line){ // コンストラクタ
    this(id);
    String[] sp1 = line.split(":");
    id = Integer.parseInt(sp1[0]);
    try{
        String[] sp2 = sp1[1].split("[,@]");
    for (int i = 0 ;i<=sp2.length-1;i++){
        if(i%2==0){
            int d =Integer.parseInt(sp2[i]);
            addToList(d);
        }else{
            double wei =Double.parseDouble(sp2[i]);
            addToWList(wei);
        }
    }
    }catch (ArrayIndexOutOfBoundsException e){
    }// idが2のときはsp2の要素数が一つしかない
    }
    void addToList(int nid){
        list.add(new Edge(nid));
    } // 隣接ノードをリストに新たに追加
    void addToWList(double wei){
        wlist.add(new Edge(wei));
    }
    ArrayList<Edge> getList(){
        return list;
    } // Edge のリストを返す
    ArrayList<Edge> getWList(){
        return wlist;

}    // その他適当に必要なものを作る
    }
    public class Graph{
        int num; // 配列を利用する場合
        ArrayList<Node> nodes = new ArrayList<Node>();
        public void loadGraph(String filename){
            try {// ファイルの読み込み
                Scanner scanner = new Scanner(new File(filename));
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] sp1 = line.split(":");
                    int id = Integer.parseInt(sp1[0]);
                    nodes.add(new Node(id, line));
                }
                scanner.close();
            }catch(FileNotFoundException e){
                System.out.println(e);
            }
        }
    public void printGraph(){
        for (Node n : nodes) {
        System.out.print(n.id + ":");
        ArrayList<Edge> edges = n.getList();
        ArrayList<Edge> weight = n.getWList();
            for (int i = 0; i <= edges.size()-1; i++) {
                System.out.print(edges.get(i).To());
                System.out.print("@");
                System.out.print(weight.get(i).Wei());
                if (i <= edges.size()- 2) {
                    System.out.print(",");
                }
            }
        System.out.println();
        }
    }
    }
