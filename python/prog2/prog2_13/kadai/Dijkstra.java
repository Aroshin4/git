//課題2: ダイクストラ法による最短経路検索  Dijkstra.java
import java.util.*;
public class Dijkstra extends Graph {

    int[] doDijkstra(int start){
        int n = nodes.size();
        int[] p = new int[n];
        double[] w = new double[n];
        boolean[] visit = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        Arrays.fill(w, Double.POSITIVE_INFINITY);
        p[0]=start;
        w[start]=0;
        for(int i = 0;i<n;i++){
            if(visit[i]){
                continue;
            }else{
                visit[i] = true;
            }
        }
        return p;
    }
}
