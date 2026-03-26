package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfAllSubarray {
    public static List<Integer> sum(int[] arr, int k) {
        List<Integer> ls = new ArrayList<>();

        for (int i=0; i<= arr.length - k; i++) {
            int sum = 0;
            int j = i;

            while (j < k + i) {
                sum += arr[j];
                j++;
            }

            ls.add(sum);
        }

        return ls;
    }

    public static ArrayList<Integer> sum2(int[] arr, int k) {
        int n = arr.length;

        int start = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        int sum = 0;
        for (int end = 0; end < n; end++) {
            if (end < k) {
                sum += arr[end];
            } else {
                ans.add(sum);
                sum -= arr[start];
                sum += arr[end];
                start++;
            }
        }

        ans.add(sum);

        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {2,8,-1,5,4,1,3,0};

        List<Integer> ans = sum2(arr, 4);

        for (int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
