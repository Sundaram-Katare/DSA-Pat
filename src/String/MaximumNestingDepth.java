package String;

public class MaximumNestingDepth {
    public static int depth(String s) {
        int count = 0;
        int maxCount = 0;

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
            }

            if (ch  == ')'){
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String s = "()(())((()()))";

        System.out.println(depth(s));
    }
}
