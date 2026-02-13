package Graphs;

import java.util.ArrayList;

public class DFS {
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();

        boolean[] vis = new boolean[n];

        ArrayList<Integer> res = new ArrayList<>();

        dfsRec(adj, res, 0, vis);
        return res;
    }

    public static void dfsRec(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res, int s, boolean[] vis) {
        vis[s] = true;
        res.add(s);

        for (int i: adj.get(s)) {
            if (!vis[i]){
                dfsRec(adj, res, s, vis);
            }
        }
    }
}
