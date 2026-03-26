package Graphs;

public class FloodFillAlgo {
    public static int[][] fill(int[][] img, int sr, int sc, int newColor) {
        if (img[sr][sc] == newColor) {
            return img;
        }

        int initColor = img[sr][sc];
        dfs(img, sr, sc, initColor, newColor);

        return img;
    }

    public static void dfs(int[][] img, int x, int y, int initColor, int newColor) {
        if (x < 0 || y < 0 || x >= img.length || y>= img[0].length || img[x][y] != initColor ) {
            return;
        }

        img[x][y] = newColor;

        dfs(img, x + 1, y, initColor, newColor);
        dfs(img, x - 1, y, initColor, newColor);
        dfs(img, x, y + 1, initColor, newColor);
        dfs(img, x, y - 1, initColor, newColor);
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,0},
                {0,1,1,1},
                {1,0,1,1}
        };

        int[][] ans = fill(mat, 1, 2, 2);

        for (int i=0; i<ans.length; i++) {
            for (int j=0; j<ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
