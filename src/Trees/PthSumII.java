package Trees;

import java.util.ArrayList;
import java.util.List;

public class PthSumII {
    public static List<List<Integer>> allPaths(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> ls = new ArrayList<>();

        helper(root, ans, ls, targetSum);

        return ans;
    }

    public static void helper(Node root, List<List<Integer>> ans, List<Integer> ls, int targetSum) {
        if (root == null) return;

        // include current node
        ls.add(root.data);

        // check if leaf and sum matches
        if (root.left == null && root.right == null && targetSum == root.data) {
            ans.add(new ArrayList<>(ls)); // add a copy of current path
        } else {
            // recurse on children
            helper(root.left, ans, ls, targetSum - root.data);
            helper(root.right, ans, ls, targetSum - root.data);
        }

        // backtrack
        ls.remove(ls.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);

        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        root.right.right.left = new Node(5);

        List<List<Integer>> ans = allPaths(root, 22);

        for (int i=0; i<ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
