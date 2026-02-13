package Stacks;

import java.util.Stack;

public class NGEinCircular {
    public static int[] nge(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i=2*n-1; i>=0; i--){
            int index = i % n;
            int currElem = arr[index];

            while (!st.isEmpty() && st.peek() <= currElem){
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }

            st.push(currElem);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,1,7,6,0};

        int[] ans = nge(arr);

        for (int a: ans) {
            System.out.print(a + ", ");
        }
    }
}
