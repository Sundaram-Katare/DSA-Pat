package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceByRight {
    public static ArrayList<Integer> replaceByRightmost(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        int max  = -1;

        for (int i=0; i<n; i++) {
            max = -1;
            for (int j=i+1; j<n; j++){
                max = Math.max(max, arr[j]);
            }
            ans.add(max);
        }

        return ans;
    }

    public static ArrayList<Integer> replaceByRightmostGFG(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        int max  = -1;

        for (int i=0; i<n; i++) {
            max = -1;
            for (int j=i; j<n; j++){
                max = Math.max(max, arr[j]);
            }
            ans.add(max);
        }

        return ans;
    }

    public static ArrayList<Integer> replaceOptimal(int[] arr) {
        int n = arr.length;
        int max = -1;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=n-2; i>=0; i--) {
            max = Math.max(max, arr[i+1]);

            ans.addFirst(max);
        }

        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5 , 4, 6, 1};

        ArrayList<Integer> ans = replaceByRightmost(arr);

        System.out.println(ans);

        System.out.println("In GFG");

        ArrayList<Integer> ans2 = replaceByRightmostGFG(arr);
        System.out.println(ans2);

        System.out.println("Optimal LC");
        ArrayList<Integer> ans3 = replaceOptimal(arr);
        System.out.println(ans3);
    }
}
