package String;

public class StringToInteger {
    public static int atoi(String s) {
        StringBuilder str = new StringBuilder();
        int flag = 0;

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (ch == ' '){
                continue;
            } else if ((ch == '+' || ch == '-' ) && str.isEmpty()) {
                flag = ch == '+' ? 0 : 1;
            } else if ((ch == '+' || ch == '-' ) && !str.isEmpty()) {
                break;
            } else if (!Character.isDigit(ch)) {
                break;
            } else {
                str.append(ch);
            }
        }

        if (str.isEmpty()){
            return 0;
        }

        int num = Integer.parseInt(str.toString());

        if (flag == 1){
            int a = str.length();
            int n = (int)Math.pow(10, a);
            num = n -  (n+num);
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(atoi("words and 987"));
    }
}
