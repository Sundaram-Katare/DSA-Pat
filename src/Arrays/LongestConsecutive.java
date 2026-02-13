package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    public static int longSeq(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;

        Set<Integer> set = new HashSet<>();
        int longest = 1;

        for (int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }

        for (int it: set) {
            if (!set.contains(it-1)){
                int x = it;
                int cnt = 1;

                while (set.contains(x+1)){
                    x++;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

    public static int longSeq2(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;

        Arrays.sort(arr);

        int cnt = 0;
        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] - 1 == lastSmaller){
                cnt++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = arr[i];
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {200,4,100,1,3,2};

        System.out.println(longSeq(arr));

        System.out.println(longSeq2(arr));
    }
}
