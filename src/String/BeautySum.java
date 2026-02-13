package String;

import java.util.HashMap;
import java.util.Map;

public class BeautySum {
    public static int beautySum(String s) {
        int sum = 0;

        for (int i=0; i<s.length(); i++) {
            Map<Character, Integer> freq = new HashMap<>();

            for (int j=i; j<s.length(); j++) {
                freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int val: freq.values()){
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }

                sum += (max - min);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(beautySum("aabcbaa"));
    }
}
