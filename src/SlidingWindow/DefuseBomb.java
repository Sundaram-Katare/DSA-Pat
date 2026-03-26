package SlidingWindow;

import java.util.Arrays;

public class DefuseBomb {
    public static int[] decode(int[] arr, int k) {
        if (k == 0) {
            Arrays.fill(arr, 0);
            return arr;
        }

        int n = arr.length;

        int[] ans = new int[n];

        int idx;
        int left = 0;
        int right = 0;

        if (k > 0) {
            idx = 0;
            left = 0;
//            right = 0;

            int sum = 0;

            while (left < n){

                if ((right - left + 1) == (k + 1)) {
                    ans[idx++] = sum - arr[left];
                    left++;
                }

                right = right % n;
                sum += arr[right];

                right++;
            }

            return ans;
        }

//        if (k < 0) {
//            idx = arr.length - 1;
//            left = arr.length - 1;
////            right = arr.length - 1;
//        }
//
//

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,1,4};

        int[] ans = decode(arr, 3);

        for (int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
