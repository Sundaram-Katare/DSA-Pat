package Recursion;

import java.util.ArrayList;
import java.util.List;

// we have to generate all binary string of length n such no consecutive 1's come together.

public class GenerateAllBinaryStrings {
    public static void generate(int n, String current, List<String> result) {
        if (current.length() == n){
            result.add(current);
            return;
        }

        generate(n, current + "0", result);

        if (current.isEmpty() || current.charAt(current.length() - 1) != '1'){
            generate(n, current + "1", result);
        }
    }

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        generate(3, "", ans);

        System.out.println(ans);
    }
}
