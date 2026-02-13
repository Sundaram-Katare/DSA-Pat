package Recursion;

import java.util.Stack;

public class SortStack {
    public static void sort(Stack<Integer> st){
        if (st.isEmpty()){
            return;
        }
        int temp = st.pop();
        sort(st);
        insert(st, temp);
    }

    public static void insert(Stack<Integer> st, int data) {
        if (st.isEmpty() || st.peek() <= data){
            st.push(data);
            return;
        }

        int val = st.pop();
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

        sort(st);

        int i = 0;
        while (i < 4){
            System.out.print(st.pop() + " ");
            i++;
        }
    }
}
