package Recursion;

public class LeetCode1498 {
    public static int numSubSeq(int[] arr, int target){
        int index = 0;
        int min = 0;
        int max = 0;

        return helper(arr, target, index, min, max, 0);
    }

    public static int helper(int[] arr, int target, int index, int min, int max, int flag){

        if (min + max <= target && flag ==1){
           return 1;
        }

        flag = 1;

        if (min == 0) {
            min = arr[index];
        } else if (arr[index] < min) {
            min = arr[index];
        }

        if (max == 0) {
            max = arr[index];
        } else if (arr[index] > max) {
            max = arr[index];
        }

        return helper(arr, target, index+1, min, max, flag) + helper(arr, target, index+1, min, max, flag);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,7};

        System.out.println(numSubSeq(arr, 9));
    }
}
