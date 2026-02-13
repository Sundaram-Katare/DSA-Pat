package Graphs;

public class NumberOfProvinces {
    public static int countProvinces(int[][] isConnected) {
        int edges = isConnected.length;

        boolean[] vis = new boolean[edges];
        int provinceCount = 0;

        for (int i=0; i<edges; i++) {
            if(!vis[i]) {
                provinceCount++;
                dfs(isConnected, vis, i);
            }
        }

        return provinceCount;
    }

    public static void dfs(int[][] matrix, boolean[] vis, int s) {
        vis[s] = true;

        for (int i=0; i<matrix.length; i++) {
            if (matrix[s][i] == 1 && !vis[i]) {
                dfs(matrix, vis, i);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,0},
                {1,1,0},
                {0,0,1}
        };

        System.out.println(countProvinces(matrix));
    }
}
