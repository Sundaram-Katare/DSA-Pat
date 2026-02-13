package Trees;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int key) {
        this.data = key;
        this.left = null;
        this.right = null;
    }
}

public class PreorderTraversal {
  public static List<Integer> preorderTraversal(Node root) {
      List<Integer> ans = new ArrayList<>();

      preorder(root, ans);
      return ans;
  }

  private static void preorder(Node root, List<Integer> ans) {
      if (root == null) {
          return;
      }

       ans.add(root.data);
       preorder(root.left, ans);
       preorder(root.right, ans);
  }
}
