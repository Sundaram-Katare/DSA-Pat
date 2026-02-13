package Trees;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal{
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();

        inorder(root, ans);
        return ans;
    }

    public static void inorder(Node root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
}
