package TwoDArrays;

import java.util.ArrayList;
import java.util.List;

public class SetZeros {

    public static void setZeros(List<List<Integer>> matrix) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i=0; i<n; i++) {
            for (int j=0; i<m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; i<m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        a.add(4);
        a.add(5);
        a.add(8);

        b.add(7);
        b.add(0);
        b.add(3);

        c.add(4);
        c.add(3);
        c.add(2);


        matrix.add(a);
        matrix.add(b);
        matrix.add(c);

        setZeros(matrix);

//        for (int i=0; i<matrix.size(); i++) {
//            for (int j=0; j<matrix.get(i).size(); j++) {
//                System.out.print(matrix.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
    }
}
