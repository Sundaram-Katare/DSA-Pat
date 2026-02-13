package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class HandsOfStraight {
    public static boolean isNHandsStraight(int[] arr, int k) {
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        List<List<Integer>> ans = new ArrayList<>();

        if (arr.length % k != 0) {
            return false;
        }

        for (int i=0; i<arr.length; i++){
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        while (!freqMap.isEmpty()){
            int start = freqMap.firstKey();

            int count = freqMap.get(start);

            List<Integer> ls = new ArrayList<>();
            for (int i=0; i<k; i++){

                int card = start + i;

                if (!freqMap.containsKey(card) || freqMap.get(card) < count) {
                    return false;
                }

                if (freqMap.get(card) == count){
                    ls.add(card);
                    freqMap.remove(card);
                } else {
                    ls.add(card);
                    freqMap.put(card, freqMap.get(card) - count);
                }
            }
            ans.add(ls);
        }


        for (int i=0; i<ans.size(); i++){
            System.out.print("[");
            for (int j=0; j<ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println("]");
        }

        return true;
    }

    public static void main(String[] args) {
        int[] hands = { 1,2,3,3,4,4,5,6 };

        System.out.println(isNHandsStraight(hands, 4));
    }
}
