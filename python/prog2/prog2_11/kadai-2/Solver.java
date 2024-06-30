// Solver.java
public class Solver {
    int capacity, answer;
    int[] weight, value;
    int[][] np;
    // コンストラクタ
    public Solver(int n, int[] weight, int[] value, int capacity) {
        this.weight = weight;
        this.value = value;
        this.capacity = capacity;
        this.np = new int[n+1][capacity+1];
    }
    int solve(){ 
        return knapsack();
    }
    int knapsack(){
        int n = weight.length;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (j < weight[i - 1]) {
                    np[i][j] = np[i-1][j];
                } else {
                    np[i][j] = Math.max(np[i-1][j], np[i-1][j-weight[i-1]] + value[i-1]);
                }
            }
        }
    return np[n][capacity];
    }
}