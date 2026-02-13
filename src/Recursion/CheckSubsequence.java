package Recursion;

public class CheckSubsequence {
    public static boolean check(int[] arr, int k) {
        int index = 0;

        return helper(index, arr, k);
    }

    public static boolean helper(int index, int[] arr, int k) {
        if (k == 0) {
            return true;
        }

        if (k < 0) {
            return false;
        }

        if (index == arr.length) {
            return k == 0;
        }

        return helper(index+1, arr, k-arr[index]) || helper(index+1, arr, k);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(check(arr, 7));
    }
}
