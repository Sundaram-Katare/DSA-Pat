package String;

import java.util.HashMap;

public class RomanToInteger {
    public static int rti(String s){
        int num = 0;
        HashMap<Character, Integer> map = new HashMap<>(7);

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i=0; i<s.length()-1; i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);

            if (map.get(ch) < map.get(ch2)){
                num -= map.get(ch);
            } else {
                num += map.get(ch);
            }
        }

        num += map.get(s.charAt(s.length() - 1));

        return num;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(rti(s));
    }
}
