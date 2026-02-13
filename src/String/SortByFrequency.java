package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {
    public static String sort(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>(52);

        for (int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            if (freqMap.containsKey(currentChar)) {
                freqMap.put(currentChar, freqMap.get(currentChar) + 1);
            } else {
                freqMap.put(currentChar, 1);
            }
        }

        List<Character> uniqueChars = new ArrayList<>(freqMap.keySet());
//        System.out.println(uniqueChars);

        uniqueChars.sort((char1, char2) -> freqMap.get(char2) - freqMap.get(char1));

        StringBuilder result = new StringBuilder();

        for (char ch: uniqueChars) {
            int frequency = freqMap.get(ch);
            for (int cnt = 0; cnt < frequency; cnt++){
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";

        System.out.println(sort(s));
    }
}
