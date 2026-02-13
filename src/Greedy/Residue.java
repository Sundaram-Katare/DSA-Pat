package Greedy;

import java.util.HashSet;

public class Residue {
    public static int countResidue(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
            }
            int currentSize = set.size();
            if (currentSize == ((i+1) % 3)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abc";

        System.out.println(countResidue(s));
    }
}
