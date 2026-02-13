package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static List<Integer> leaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();

        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        List<Integer> ls = leaders(arr);

        for (int i=0; i<ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }
}
