package SlidingWindow;

// Q1. Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
//
//Note: A subarray is a contiguous part of any given array.

//Input: arr[] = [100, 200, 300, 400], k = 2
//Output: 700
//Explanation: arr2 + arr3 = 700, which is maximum.

public class MaxSubarraySum {
    public static int maxSumBrute(int[] arr, int k) {
        int maxSum  = 0;

        for(int i=0; i<arr.length - k + 1; i++) {
            int sum = 0;

            for (int j =i; j<i+k; j++) {
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static int maxSumOptimal(int[] arr, int k) {
        int maxSum = 0;
        int sum = 0;

        int i = 0;

        for(int j =0; j<arr.length; j++) {
            sum += arr[j];

            if((j - i + 1) > k) {
                sum -= arr[i];
                i++;
            }

            if((j - i + 1) == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static int maxSubSum(int[] arr, int k) {
        int maxSum = 0;
        int sum = 0;

        for (int i=0; i<k; i++) {
            sum += arr[i];
        }

        maxSum = sum;

        for (int i=k; i<arr.length; i++) {
            sum -= arr[i-k];
            sum += arr[i];
            maxSum = Math.max(maxSum,sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {100,200,300,400};

        System.out.println(maxSumBrute(arr, 2));
        System.out.println(maxSubSum(arr, 3));
    }
}