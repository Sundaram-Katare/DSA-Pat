package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleDetectionInUndirectedGraph {
    public static boolean detectUsingBFS(int[][] mat){
        List<List<Integer>> adj = new ArrayList<>();

        for (int i=0; i< mat.length; i++) {
            List<Integer> ls = new ArrayList<>();

            for (int j=0; j<mat[i].length; j++) {
                ls.add(mat[i][j]);
            }
            adj.add(ls);
        }

        int n = adj.size();

        boolean[] visited = new boolean[n];

        for (int i=0; i<visited.length; i++) {
            if (!visited[i]) {
                if (isCycle(visited, adj, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isCycle(boolean[] vis, List<List<Integer>> adj, int s) {
        vis[s] = true;
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {s, -1});

        while (!queue.isEmpty()){
            int node = queue.peek()[0];
            int parent = queue.peek()[1];
            queue.remove();

            for (int adjacent : adj.get(node)){
                if(!vis[adjacent]) {
                    vis[adjacent] = true;
                    queue.add(new int[]{adjacent, node});
                }

                else if (adjacent != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        };

        System.out.println(detectUsingBFS(mat));
    }
}
