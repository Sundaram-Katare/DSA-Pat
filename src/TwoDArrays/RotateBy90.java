package TwoDArrays;

import static TwoDArrays.Transpose.transpose;

public class RotateBy90 {
    public static void rotateBy90Clockwise(int[][] matrix) {
        transpose(matrix);

        for (int i=0; i<matrix.length; i++){
            reverseArray(matrix[i]);
        }

        return;
    }

    public static void rotateBy90Anticlockwise(int[][] matrix) {

        for (int i=0; i<matrix.length; i++){
            reverseArray(matrix[i]);
        }

        transpose(matrix);

        return;
    }

    public static void reverseArray(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s != e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
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

        rotateBy90Clockwise(matrix);

        System.out.println("Matrix after Clockwise Rotation");

        printMatrix(matrix);

        System.out.println("Matrix after Anti Clockwise Rotation");

        rotateBy90Anticlockwise(matrix);

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
