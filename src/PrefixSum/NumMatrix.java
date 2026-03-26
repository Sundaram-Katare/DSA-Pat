package PrefixSum;

public class NumMatrix {
    int[][] grid;

    public NumMatrix(int[][] matrix) {
//       for (int i=0; i<matrix.length; i++) {
//           for (int j=0; j<matrix[i].length; j++) {
//               grid[i][j] = matrix[i][j];
//           }
//       }
        this.grid = matrix;
    }

    public int regionSum(int row1, int col1, int row2, int col2) {
        int sum = 0;

        for (int i = Math.min(row1, row2); i<=Math.max(row1, row2); i++) {
            for (int j=Math.min(col1, col2); j<= Math.max(col1, col2); j++) {
                sum += grid[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,0,1,4,2},
                { 5,6,3,2,1},
                {1,2,0,1,5},
                {4,1,0,1,7},
                {1,0,3,0,5}};

        NumMatrix obj = new NumMatrix(matrix);

        System.out.println(obj.regionSum(2,1,4,3));
    }
}
