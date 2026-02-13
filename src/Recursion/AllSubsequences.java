package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllSubsequences {
    public static List<String> generate(String s){
        List<String> result = new ArrayList<>();

        StringBuilder curr = new StringBuilder();

        helper(s, 0, curr, result);

        return result;
    }

    public static void helper(String s, int index, StringBuilder curr, List<String> result) {
        if (index == s.length()){
            if (!curr.isEmpty()){
                result.add(curr.toString());
            }
            return;
        }

        //exclude the current char
        helper(s, index + 1, curr, result);

        //include the current char
        curr.append(s.charAt(index));
        helper(s, index + 1, curr, result);

        curr.deleteCharAt(curr.length()-1);
    }

    public static void main(String[] args) {
        List<String> ans = generate("abc");

        System.out.println(ans);
    }
}

/*
                                              help("abc", 0, "", [])
                                                      |
       _______________________________________________|________________________________________
       |
       |


























 */
