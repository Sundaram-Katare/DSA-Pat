package String;

public class ReverseVowels {
    public static String rev(String s) {
        int n = s.length();
        int i = 0;
        int j = n -1;
        char[] arr = s.toCharArray();

        while (i < j) {

            while (i < j && !isVowel(s.charAt(i))) {
                i++;
            }

            while ( i < j && !isVowel(s.charAt(j))) {
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return String.valueOf(arr);
    }

    public static boolean isVowel(char ch) {
        char c = Character.toLowerCase(ch);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "IceCreAm";

        String str = rev(s);
        System.out.println(str.toString());
    }
}
