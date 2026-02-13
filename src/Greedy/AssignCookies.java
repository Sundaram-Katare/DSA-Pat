package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class AssignCookies {
    public static int numberOfChildrenAssigned(int[] greed, int[] size){
        int left = 0;
        int right = 0;
        int n = greed.length;
        int m = size.length;
        Arrays.sort(greed);
        Arrays.sort(size);

        while (left < m && right < n) {
          if (greed[right] <= size[left]){
              right = right +1;
          }
          left = left + 1;
        }

        return right;
    }

    public static void main(String[] args) {
        int[] greed = { 1,2,3 };
        int[] size = { 1, 1 };

        System.out.println(numberOfChildrenAssigned(greed, size));
    }
}
