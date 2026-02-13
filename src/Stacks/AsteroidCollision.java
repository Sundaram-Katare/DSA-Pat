package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroid(int[] arr) {
        List<Integer> st = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 0){
                st.add(arr[i]);
            } else {
                while (!st.isEmpty() && st.getLast() < Math.abs(arr[i]) && st.getLast() > 0) {
                    st.removeLast();
                }

                if (!st.isEmpty() && st.getLast() == Math.abs(arr[i])) {
                    st.removeLast();
                } else if (st.isEmpty() || st.getLast() < 0) {
                    st.add(arr[i]);
                }
            }
        }

        int[] ans = new int[st.size()];
        for (int i=0; i<ans.length; i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4,7,1,1,2,-3,-7,17,15,-16};

        int[] result = asteroid(arr);

        for (int a: result) {
            System.out.print(a + " ");
        }
    }
}
