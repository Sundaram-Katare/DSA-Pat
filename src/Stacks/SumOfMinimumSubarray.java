package Stacks;

import java.util.Stack;

public class SumOfMinimumSubarray {
    public static int sum(int[] arr) {
        int n = arr.length;

        int[] nse = nse(arr);
        int[] pse = pse(arr);

        int sum  = 0;
        int mod = (int)1e9 + 7;

        for (int i=0; i<n; i++) {
             int left = i - pse[i];
             int right = nse[i] - i;

             long freq = left * right * 1L;

             int val = (int)((freq * arr[i]) % mod);

              sum = (sum + val) % mod;
        }

        return sum;
    }

    public static int[] nse(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n= arr.length;
        int[] ans = new int[n];

        for (int i=n-1; i>=0; i--){
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }
        return ans;
    }

    public static int[] pse(int[] arr) {
        int n= arr.length;
        int[] ans = new  int[n];

        Stack<Integer> st = new Stack<>();

        for (int i=0; i<n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,3};

        System.out.println(sum(arr));

        int[] arr2 = {1,3,3};

        System.out.println(sumOfSubarrayMaximum(arr2));

        System.out.println("The Sum of subarray ranges of this array is shown below:- ");
        System.out.println(sumOfSubarrayMaximum(arr2) - sum(arr2));
    }

    public static int sumOfSubarrayMaximum(int[] arr){
        int n = arr.length;

        int[] nge = nge(arr);
        int[] pge = pge(arr);

        int sum  = 0;
        int mod = (int)1e9 + 7;

        for (int i=0; i<n; i++) {
            int left = i - pge[i];
            int right = nge[i] - i;

            long freq = left * right * 1L;

            int val = (int)((freq * arr[i]) % mod);

            sum = (sum + val) % mod;
        }

        return sum;
    }

    public static int[] nge(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i=n-1; i>=0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = n;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }
        return ans;
    }

    public static int[] pge(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }
        return ans;
    }
}
