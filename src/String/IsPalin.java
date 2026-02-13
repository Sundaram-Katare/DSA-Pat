package String;

public class IsPalin {
    public static boolean isPalin(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;

        while (i < j) {

            while( i<n && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while(j >= 0 && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (i < n && j >= 0 && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;
    }

    public static boolean isPalinBrute(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        String filtered = str.toString();
        String rev = str.reverse().toString();

        return filtered.equals(rev);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canl: Panama";

        System.out.println(isPalin(s));

        System.out.println(isPalinBrute(s));
    }
}
