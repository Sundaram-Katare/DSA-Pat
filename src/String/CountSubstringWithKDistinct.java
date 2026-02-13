package String;

import java.util.HashMap;
import java.util.Map;

public class CountSubstringWithKDistinct {
  public static int countSubstrings(String s, int k) {
      return atMostKDistinct(s, k) - atMostKDistinct(s, k-1);
  }

  public static int atMostKDistinct(String s, int k) {
      int left = 0;
      int res = 0;

      Map<Character, Integer> map = new HashMap<>();

      for (int right=0; right<s.length(); right++){
          if (map.containsKey(s.charAt(right))){
              map.put(s.charAt(right), map.get(s.charAt(right)) + 1);
          } else {
              map.put(s.charAt(right), 1);
          }

          while (map.size() > k){
              char leftChar = s.charAt(left);
              map.put(leftChar, map.get(leftChar) - 1);
              if (map.get(leftChar) == 0){
                  map.remove(leftChar);
              }
              left++;
          }
          res += (right - left + 1);
      }
      return res;
  }

    public static void main(String[] args) {
        String s = "abcbaa";

        System.out.println(countSubstrings(s, 3));
    }
}
