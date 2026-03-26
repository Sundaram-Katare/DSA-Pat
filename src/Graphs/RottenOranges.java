package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static int timeToRotten(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int time = 0;

        int total_oranges = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }

                if (grid[i][j] != 0) {
                    total_oranges++;
                }
            }
        }

        int cnt = 0;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while (!queue.isEmpty()) {
            int size = queue.size();
            cnt += size;

            for (int i=0; i<size; i++) {
                int[] point = queue.poll();

                for (int j=0; j<4; j++) {
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];

                    if (x <0 || y < 0 || x >= n || y >= m || grid[x][y] ==0 || grid[x][y] == 2) {
                        continue;
                    }

                    grid[x][y] = 2;
                    queue.add(new int[] {x, y});
                }
            }

            if (!queue.isEmpty()) {
                time++;
            }
        }

            return total_oranges == cnt ? time : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2,1,1},
                {1,0,1},
                {0,1,1}
        };

        System.out.println(timeToRotten(grid));
    }
}
