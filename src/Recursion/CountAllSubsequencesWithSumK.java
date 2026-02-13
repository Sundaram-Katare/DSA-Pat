package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountAllSubsequencesWithSumK {

    public static int countSubsequences(int[] arr, int k) {
        int index = 0;

        return helper(index, k, arr);
    }

    public static int helper(int index, int target, int[] arr) {
        if (target == 0) {
            return 1;
        }

        if (target < 0 || index == arr.length){
            return 0;
        }

        return helper(index+1, target-arr[index], arr) + helper(index+1, target, arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println(countSubsequences(arr, 6));
    }
}
