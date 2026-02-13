package Trees;

// A height balanced BT is the tree in which the height difference of the left and the right subtree is not more than 1 for every node.

// Create a helper function which uses Post order traversal and calculate the diff. while traversing the tree.
public class HeightBalanced {
    public static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }

        if (helper(root) == -1) {
            return false;
        }

        return true;
    }

    public static int helper(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = helper(root.left);

        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = helper(root.right);

        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
