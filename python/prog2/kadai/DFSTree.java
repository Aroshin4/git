import java.util.*;

    public class DFSTree extends BFSTree {
        public int[] getDFSTree(int start) {
            int n = nodes.size();
            int[] parent = new int[n];
            boolean[] visited = new boolean[n];
            LinkedList<Integer> stack = new LinkedList<>();
            LinkedList<Integer> stackB = new LinkedList<>();
    
            // 全ての頂点を未訪問に設定
            for (int i = 0; i < n; i++) {
                visited[i] = false;
            }
            visited[start] = true;
            parent[start] = start; // 始点の親を自分自身に設定
    
            // 始点から出るすべての辺をスタックに追加
            List<Edge> edges = nodes.get(start).getList();
            for (int i = edges.size() - 1; i >= 0; i--) {
                Edge edge = edges.get(i);
                int neighbor = edge.To();
                stack.push(start);
                stackB.push(neighbor);
            }
    
            // 深さ優先探索
            while (!stack.isEmpty()) {
                int current = stack.pop();
                int next = stackB.pop();
    
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = current;
                    List<Edge> currentEdges = nodes.get(next).getList();
                    for (int i = currentEdges.size() - 1; i >= 0; i--) {
                        Edge edge = currentEdges.get(i);
                        int neighbor = edge.To();
                        stack.push(next);
                        stackB.push(neighbor);
                    }
                }
            }
            return parent;
        }
    public int[] getPath(int start, int end) {
        int[] dfsTree = getDFSTree(start);
        List<Integer> path = new ArrayList<>();
        for (int at = end; at != start; at = dfsTree[at]) {
            path.add(at);
        }
        path.add(start);
        Collections.reverse(path);
        int[] paths = new int[path.size()];
        for (int i = 0; i < path.size(); i++) {
            paths[i] = path.get(i);
        }
        return paths;
    }
}