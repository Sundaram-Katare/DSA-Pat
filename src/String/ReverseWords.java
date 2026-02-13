package String;

public class ReverseWords {
    public static String reverseWords(String s) {
       int flag = 0;
       StringBuilder ans = new StringBuilder();

       for (int i=0; i<s.length(); i++){
           char ch = s.charAt(i);

           if (ch == ' ' && flag == 0){
               continue;
           } else if (ch == ' ') {

           } else {
               
           }
       }
       return "";
    }

    public static String reverse(String s) {
        int left = 0;
        int right = s.length()-1;

        char[] arr = s.toCharArray();

        while (left < right) {
            char temp =  arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        StringBuilder str = new StringBuilder();

        for (char ch: arr){
            str.append(ch);
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(reverse(s));
    }
}
