package Arrays;

import java.util.HashMap;

public class DegreeOfArray {
    public static int findShortestSubArray(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        HashMap<Integer, Integer> startIndexMap = new HashMap<>();

        HashMap<Integer, Integer> endIndexMap = new HashMap<>();

        int maxFrequency = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {

            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);

            maxFrequency = Math.max(maxFrequency, freqMap.get(arr[i]));

            if (!startIndexMap.containsKey(arr[i])) {
                startIndexMap.put(arr[i], i);
            }

            endIndexMap.put(arr[i], i);
        }

        int minLength = Integer.MAX_VALUE;

        for (int num: arr) {
            if (freqMap.get(num) == maxFrequency) {
                int subarrayLength = endIndexMap.get(num) - startIndexMap.get(num) + 1;

                if (subarrayLength < minLength) {
                    minLength = subarrayLength;
                }
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,1,2};

        System.out.println(findShortestSubArray(arr));
    }
}
