package Stacks;

import java.util.Stack;

public class RemoveKDigits {
    public static String remove(String s, int k) {
        Stack<Character> st = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            char digit = s.charAt(i);

            while (!st.isEmpty() && st.peek() > digit && k > 0) {
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        while (!sb.isEmpty() && sb.charAt(sb.length()-1) == '0'){
            sb.deleteCharAt(sb.length()-1);
        }

        sb.reverse();

        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "1432219";
        int k =3;

        System.out.println(remove(s, k));
    }
}
