package Trees;

public class LCA {
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return root;
        }

        if (root == p || root == q) {
            return root;
        }

        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (left == null) {
            return right;
        } else {
            return left;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);
        root.right.right = new Node(7);

        Node lca = lowestCommonAncestor(root, root.left.right.left, root.left.right.right);

        System.out.println(lca.data);
    }
}
