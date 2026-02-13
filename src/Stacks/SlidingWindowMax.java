package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {
    public static int[] bruteForce(int[] arr, int k) {
        int[] ans = new int[arr.length-k+1];

        for (int i=0; i<arr.length-k+1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j=i; j<i+k; j++) {
                max = Math.max(max, arr[j]);
            }
            ans[i] = max;
        }

        return ans;
    }

    public static int[] optimal(int[] arr, int k) {
        if (arr == null || k <= 0 || k > arr.length) {
            return new int[0]; // Edge case
        }
        int n = arr.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        int resultIndex = 0;

        for (int i=0; i<n; i++){

            while (!deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]){
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k-1) {
                ans[resultIndex++] = arr[deque.peekFirst()];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] ans = optimal(arr, k);

        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
