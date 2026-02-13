package Trees;

import java.util.ArrayList;
import java.util.List;

public class Boundary {

    public static boolean isLeaf(Node node) {
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }

    public static void leftSide(Node root, List<Integer> res) {
        Node curr = root.left;
        while (curr != null) {
            // If the current node is not a leaf,
            // add its value to the result
            if (!isLeaf(curr)) {
                res.add(curr.data);
            }
            // Move to the left child if it exists,
            // otherwise move to the right child
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    public static void rightSide() {

    }

    public static List<Integer> boundryTaversal(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        if (!isLeaf(root)){
            res.add(root.data);
        }

        leftSide(root, res);

        return res;
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
    }
}
