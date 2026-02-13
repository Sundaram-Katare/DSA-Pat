package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int currSum = 0;

        for (int i=0; i<arr.length; i++) {
            currSum = arr[i];

            int rem = target - currSum;

            if (map.containsKey(rem)) {
                return new int[] {map.get(rem), i};
            }

            map.put(currSum, i);
        }

        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] ans = twoSum(arr, target);

        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
