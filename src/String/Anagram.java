package String;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];

        for (int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }

        for (int i=0; i<t.length(); i++) {
            arr[t.charAt(i) - 'A']--;
        }

        for (int i=0; i<26; i++) {
            if (arr[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ACT";
        String t = "PAT";

        System.out.println(isAnagram(s, t));
    }
}
