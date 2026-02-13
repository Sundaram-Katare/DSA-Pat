package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    public static void generate(int n, String curr, List<String> result, int co, int cc) {

        if (curr.length() == 2*n){
            result.add(curr);
            return;
        }

        if (co < n){
            generate(n, curr + "(", result, co + 1, cc);
        }
        if (cc < co) {
            generate(n, curr + ")", result, co, cc + 1);
        }
        return;
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        generate(3, "", ls, 0, 0);

        System.out.println(ls);
    }
}
