package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Postorder {
    public static List<Integer> postIterative(Node root) {
        List<Integer> ans = new ArrayList<>();

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);

        while (!st1.isEmpty()) {
            Node node = st1.pop();
            st2.push(node);

            if (node.left != null) {
                st1.push(node.left);
            }

            if (node.right != null) {
                st1.push(node.right);
            }
        }

        while (!st2.isEmpty()) {
            Node curr = st2.pop();
            ans.add(curr.data);
        }

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<Integer> ans = postIterative(root);

        System.out.println(ans);
    }
}
