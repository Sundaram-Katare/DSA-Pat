package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();

        boolean[] vis = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();

        int src = 0;
        queue.add(src);
        vis[0] = true;

        while (!queue.isEmpty()) {
            src = queue.poll();

            ans.add(src);

            for (int i: adj.get(src)) {
                if (!vis[i]) {
                    vis[i] = true;
                    queue.add(i);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
