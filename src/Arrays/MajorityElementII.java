package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public  static List<Integer> majority(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int element1= arr[0];
        int element2 = arr[0];
        int count1= 0;
        int count2 = 0;

        for (int i=0; i<arr.length; i++) {
            if(element1 == arr[i]) {
                count1++;
            } else if (element2 == arr[i]) {
                count2++;
            } else if (count1 == 0) {
                count1++;
                element1 = arr[i];
            } else if (count2 == 0) {
                 count2++;
                 element2 = arr[i];
            } else {
                count2--;
                count1--;
            }
        }

        int countOccurrences1 = 0;
        int countOccurrences2 = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == element1) countOccurrences1++;
            if (arr[i] == element2) countOccurrences2++;
        }

        if (countOccurrences1 > arr.length/3) ans.add(element1);
        if (countOccurrences2 > arr.length/3) ans.add(element2);
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};

        System.out.println(majority(arr).get(0) + " " + majority(arr).get(1));
    }
}
