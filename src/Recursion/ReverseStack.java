package Recursion;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int temp = st.pop();
        reverse(st);
        insert(st, temp);
        return;
    }

    public static void insert(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }

        int val =st.pop();
        insert(st, data);
        st.push(val);
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
        st.push(1);
        st.push(2);

        int i = 0;

//        while (i < 4){
//            System.out.println(st.pop() + " ");
//            i++;
//        }

        reverse(st);

        i = 0;

        while (i < 4){
            System.out.println(st.pop() + " ");
            i++;
        }
    }
}
