package PrefixSum;

public class MinSizeSubarray {
    public static int minSize(int[] arr, int target) {
        int l = 0;
        int minL = Integer.MAX_VALUE;
        int sum = 0;

        for (int r=0; r<arr.length; r++) {
            sum += arr[r];

            while (sum >= target) {
                minL = Math.min(minL, r  - l + 1);
                sum -= arr[l];
                l++;
            }
        }

        return minL == Integer.MAX_VALUE ? 0 : minL;
    }

    public static int minSizeBrute(int[] arr, int target) {
        int minL = Integer.MAX_VALUE;
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum = 0;
            for (int j=i; j<arr.length; j++) {
                sum += arr[j];
                if (sum >= target) {
                    minL = Math.min(minL, j-i+1);
                    break;
                }
            }
        }

        return minL == Integer.MAX_VALUE ? 0 : minL;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        int target = 11;

        System.out.println(minSize(arr, target));

        System.out.println(minSizeBrute(arr, target));
    }
}

// In this question, we are given an array of positive integers and a positive integer target. So the first approach that is coming to my mind is
// that we take a variable minLength which keep track of our minLength subarray. Then, we keep check for each possible subarray whether the sum
// is greater than or equal to target or not. However, to achieve this approch, we required 2 nested for loops which lead to O(N^2) time
// complexity.

// So, the optimal approach that we can use is that we can keep track of a prefix sum which reduce the computation and also 