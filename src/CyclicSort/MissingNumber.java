package CyclicSort;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int j = arr[i];

            if ((j < n) && (arr[i] != arr[j])) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                i++;
            }
        }

        for (int j=0; j<n; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,2};

        System.out.println(missingNumber(arr));
    }
}
