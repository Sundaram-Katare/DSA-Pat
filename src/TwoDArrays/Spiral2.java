package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class Spiral2 {
    public static int[][] spiralTwo(int n) {
        int[][] matrix = new int[n][n];

        int currentRow = 0;
        int currentCol = 0;
        int[] directions = {0, 1, 0, -1, 0};
        int directionIndex = 0;

        int val = 1;
        int totalCells = n * n;

        for (int count = 0; count < totalCells; count++) {
            // Fill the current position directly
            matrix[currentRow][currentCol] = val;
            val++;

            // Calculate next position
            int nextRow = currentRow + directions[directionIndex];
            int nextCol = currentCol + directions[directionIndex + 1];

            // Change direction if needed
            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n ||
                    matrix[nextRow][nextCol] != 0) { // Check if already filled
                directionIndex = (directionIndex + 1) % 4;
            }

            // Move to next position
            currentRow += directions[directionIndex];
            currentCol += directions[directionIndex + 1];
        }

        return matrix;
    }
    public static void main(String[] args) {

        int[][] ans = spiralTwo(4);

        for (int i=0; i<ans.length; i++){
            for (int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
