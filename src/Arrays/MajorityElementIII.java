package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementIII {
    public static void majority(int[] arr, int k) {
        int n = arr.length;
        int x = n/k;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1 );
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > x) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 2, 1, 2, 3, 3 };
        int k = 4;

        majority(arr, k);
    }
}
