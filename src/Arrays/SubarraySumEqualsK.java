package Arrays;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public  static int  countSubarrays(int[] arr, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        for (int i=0; i<arr.length; i++) {
            prefixSum += arr[i];

            int rem = prefixSum - k;

            if(map.containsKey(rem)) {
                count += map.get(rem);
            }

            if(map.containsKey(prefixSum)){
                map.put(prefixSum, map.get(prefixSum) + 1);
            } else {
                map.put(prefixSum, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,-10};

        System.out.println(countSubarrays(arr, 15));
    }
}
