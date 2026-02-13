package Stacks;

import java.util.Stack;

public class NGE {
    public static int[] nge(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i=n-1; i>=0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};

        int[] ans = nge(arr);
        for (int a:ans) {
            System.out.print(a + ", ");
        }
    }
}
