package SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class HarmoniousSubsequences {
    public static int lhsOptimal(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(int num: map.keySet()) {
            if(map.containsKey(num + 1)) {
                int currLen = map.get(num) + map.get(num + 1);
                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }

    public static int lhsSorting(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        int left = 0;

        Arrays.sort(arr);

        for (int right = 0; right<n; right++) {
            while (arr[right] - arr[left] > 1) {
                left++;
            }

            if (arr[right] - arr[left] == 1) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1,3,2,2,5,2,3,7};
        System.out.println(lhsSorting(arr));
    }
}
