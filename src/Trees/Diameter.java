package Trees;
// Length of the longest path between any two nodes.
// Use the DFS or recursive height calculate approach. Keep the track of the diameter in each traversal.

public class Diameter {
    int diameter = 0;

    public int diameter(Node root) {
        depth(root);
        return diameter;
    }

    public int depth(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = depth(root.left);
        int rightHeight = depth(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
