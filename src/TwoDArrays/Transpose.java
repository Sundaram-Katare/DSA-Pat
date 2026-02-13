package TwoDArrays;

public class Transpose {
    public static void transpose (int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);

        transpose(matrix);

        System.out.println("Matrix after transpose");

        printMatrix(matrix);

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
