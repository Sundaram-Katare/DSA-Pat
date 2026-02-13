package Trees;

import java.util.ArrayList;

public class AllPaths {
    public static ArrayList<ArrayList<Integer>> allPaths(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        dfs(root, new ArrayList<>(), res);

        return res;
    }

    public static void dfs(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
        } else {
            dfs(root.left, path, res);
            dfs(root.right, path, res);
        }

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);
        root.right.right = new Node(7);

        ArrayList<ArrayList<Integer>> ls = allPaths(root);

        for (int i=0; i<ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
    }
}
