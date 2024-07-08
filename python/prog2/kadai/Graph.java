import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
// 課題1: テキストファイルからグラフを作成 Graph.java
class Edge{
    private int to; // 接続先となるノード番号
    Edge(int to){this.to = to;}
    int To(){return to;}
    }
    class Node{
    int id; // ノード番号
    ArrayList<Edge> list; // Edge リスト
    Node(int id){
        this.id = id; list = new ArrayList<Edge>();
    }
    Node(int id, String line){ // コンストラクタ
    this(id);
    String[] sp1 = line.split(":");
    id = Integer.parseInt(sp1[0]);
    String[] sp2 = sp1[1].split(",");
    for (String s : sp2){
        int i =Integer.parseInt(s);
        addToList(i);
    } // 必用な処理を書く
    }
    void addToList(int nid){
        list.add(new Edge(nid));
    } // 隣接ノードをリストに新たに追加
    ArrayList<Edge> getList(){
        return list;
    } // Edge のリストを返す

    // その他適当に必要なものを作る
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
            for (int i = 0; i <= edges.size()-1; i++) {
                System.out.print(edges.get(i).To());
                if (i <= edges.size() - 2) {
                    System.out.print(",");
                }
            }
        System.out.println();
        }
    }
}