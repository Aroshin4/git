import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Random;

// PQに追加する要素Pointクラスを宣言
class Point{
    double x, y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    double distance(){
        return Math.sqrt( x*x + y*y);
    }
    @Override 
    public String toString(){
        return String.format("[%.3f,%.3f]", x, y);
    }
}

// Pointクラスのインスタンス間を比較するためのComparatorを実装
class PointCompare implements Comparator<Point>{
    // Comparatorインタフェースの実装によりcompareメソッドをオーバーライド
    // 2つの要素間の大小関係を検査し下記の値を返却する
    // 1: 1つ目のほうが大きい
    // 0: 等しい
    // -1: 2つ目のほうが大きい
    @Override 
	public int compare(Point a, Point b){ 
        // 
		if (a.distance() < b.distance()) return 1;
		else if (a.distance() > b.distance()) return -1;
		else return 0;
	}
}

public class PQsample {
    public static void main(String[] args){
        
        // Pointクラスを要素に持つPQを生成し要素間の順序関係はPointCompareに従う
        PriorityQueue<Point> pq = new PriorityQueue<Point>(new PointCompare());

        Random rnd = new Random();

        System.out.println( "【PQにランダムに生成したPointクラスのインスタンスを10個addする】");
        // 適当な要素をPQに順次追加
        for( int i = 0; i<10; i++){
            Point add = new Point( rnd.nextDouble(), rnd.nextDouble());
            pq.add(add);
            // 生成したPointインスタンスとPQを書き出し
		    System.out.println( "add=" + add + ", pq=" + pq);
        }

        System.out.println( "\n【PQから要素を順番に取り出す】");
        while (! pq.isEmpty()) { //PointインスタンスとPQを書き出し
	        // PQ の先頭要素を取り出す
	        Point poll = pq.poll();
            // 取り出した要素と残りのキューを書き出し
		    System.out.println( "poll=" + poll + ", pq=" + pq);
        }
	}

}
