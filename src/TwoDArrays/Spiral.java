package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class Spiral {
    public static List<Integer> spiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] directions = { 0, 1, 0, -1, 0 };

        int currentRow = 0;
        int currentCol = 0;
        int directionIndex = 0; // 0=right, 1=down, 2=left, 3=up

        List<Integer> result = new ArrayList<>();
        boolean[][] visited = new boolean[rows][cols];

        int totalCells = rows*cols;

        for (int count = 0; count < totalCells; count++){

            result.add(matrix[currentRow][currentCol]);

            visited[currentRow][currentCol] = true;

            int nextRow = currentRow + directions[directionIndex];
            int nextCol = currentCol + directions[directionIndex + 1];

            if (nextRow < 0 || nextRow >=rows || nextCol < 0 || nextCol >= cols || visited[nextRow][nextCol] ){
                directionIndex = (directionIndex + 1) % 4;
            }

            currentRow += directions[directionIndex];
            currentCol += directions[directionIndex + 1];
        }

        return result;

    }


    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<Integer> ans =  spiralMatrix(matrix);

        for (Integer x: ans) {
            System.out.print(x + " ");
        }
    }
}
