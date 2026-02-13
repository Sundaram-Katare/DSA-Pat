package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphUsingAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();

        ArrayList<Integer>[] adj = new ArrayList[n+1];

        for (int i=0; i<=n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i=0; i<e; i++) {
            int u =sc.nextInt();
            int v = sc.nextInt();

            adj[u].add(v);
            adj[v].add(u);
        }

        for (int i=0; i<adj.length; i++) {
            System.out.println(adj[i]);
        }
    }

    public static void print(int[][] arr) {
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
