package Trees;

// PS:- Given the root of a binary tree, return its maximum depth.
//
//A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

//LeetCode = 104

// Height can be of 2 types:
// i) Edge based = no. of edges along the longest path.
//ii) Node based = no. of nodes along the longest path.

// To solve this question, we have 2 ways:
// i) Use the level order traversal - queue method
//ii) Use the Recursive ost order traversal.

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {
  public static int height(Node root) {
      int height = 0;
      if (root == null) {
          return 0;
      }

      if (root.left == null && root.right == null) {
          return 1;
      }

      Queue<Node> queue = new LinkedList<>();
      queue.add(root);

      while (!queue.isEmpty()){
          int size = queue.size();

          for (int i=0; i<size; i++) {
              Node front = queue.poll();
              System.out.println(front);

              if (front.left != null) {
                  queue.add(front.left);
              }

              if (front.right != null) {
                  queue.add(front.right);
              }
          }
          height++;
      }

      return height;
  }

    public static void main(String[] args) {

    }

  public static int heightViaRecursion(Node root) {
      if (root == null) {
          return 0;
      }

      int leftHeight = heightViaRecursion(root.left);
      int rightHeight = heightViaRecursion(root.right);

      return 1 + Math.max(leftHeight, rightHeight);
  }
}
