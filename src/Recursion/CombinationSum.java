package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinations(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(arr, target, ans, 0, new ArrayList<>());

        return ans;
    }

    public static void helper(int[] arr, int target, List<List<Integer>> ans, int index, List<Integer> curr) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(curr));
            }


            return;
        }

        if (arr[index] <= target) {
            curr.add(arr[index]);
            helper(arr, target - arr[index], ans, index, curr);
            curr.removeLast();
        }

        helper(arr, target, ans, index+1, curr);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,6,7};
        List<List<Integer>> ans = combinations(arr, 7);

        System.out.println(ans);
    }
}
