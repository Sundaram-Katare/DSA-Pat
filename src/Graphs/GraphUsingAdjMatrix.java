package Graphs;

import java.util.Scanner;

public class GraphUsingAdjMatrix {
    public static void main(String[] args) {
        //Graph using Adjacency matrix

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes");
        int n = sc.nextInt();

        System.out.println("Enter number of edges");
        int e = sc.nextInt();

        int[][] matrix = new int[n+1][n+1];

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            matrix[u][v] = 1;
            // remove this line in case of directed graph
            matrix[v][u] = 1;
        }

        sc.close();

        print(matrix);

        // Graph using adjaceny list
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
