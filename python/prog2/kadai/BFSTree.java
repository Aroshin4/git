// 課題2 幅優先木の作成と最短経路探索 BFSTree.java
import java.util.*;
public class BFSTree extends Graph {

    public int[] getBFSTree(int root) {
        int n = nodes.size();
        int[] p = new int[n];//親
        boolean[] visit = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        Arrays.fill(p, 0);//初期値は0にしておく
        visit[root] = true;
        queue.offer(root);
        p[0] = root;
        while (queue.isEmpty()==false) {
            int x = queue.poll();
            for (int i = 0; i < nodes.get(x).getList().size(); i++) {
                int next = nodes.get(x).getList().get(i).To();
                if (visit[next]==false) {
                    visit[next] = true;
                    p[next] = x;
                    queue.offer(next);
                }
            }
        }
        return p;
    }
    public int[] getShortestPath(int start, int end) {
        int[] tree = getBFSTree(start);
        List<Integer> way = new ArrayList<>();
        // 逆順にたどる
        int e = end;
        while (e!=start) {
            way.add(e);
            e = tree[e];
        }
        way.add(start);
        // 正しい順序にするためにリストを逆順にする
        Collections.reverse(way);
        // リストを配列に
        int[] result = new int[way.size()];
        for (int i=0;i<way.size();i++) {
            result[i]=way.get(i);
        }
        return result;
    }
}
