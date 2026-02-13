//package String;
//
//public class ValidPalindromeII {
//    public static boolean isValid(String s) {
//        int n = s.length();
//        int i =0;
//        int j = n-1;
//
//        while (i < j) {
//            if (s.charAt(i) != s.charAt(j)) {
//                return isPalin(s, i+1, j) || isPalin(s, i, j-1);
//            }
//            i++;
//            j--;
//        }
//        return false;
//    }
//
//    private boolean isPalindrome(int left, int right) {
//        // Check characters from both ends moving toward the center
//        while (left < right) {
//            // If any pair of characters doesn't match, it's not a palindrome
//            if (charArray[left] != charArray[right]) {
//                return false;
//            }
//            // Move both pointers inward
//            left++;
//            right--;
//        }
//        // All character pairs matched, substring is a palindrome
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String s = "abcca";
//
//        System.out.println(isValid(s));
//    }
//}
