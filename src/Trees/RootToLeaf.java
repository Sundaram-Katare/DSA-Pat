package Trees;

import java.util.ArrayList;

public class RootToLeaf {
    public static ArrayList<Integer> rootToLeaf(Node root, int x) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        getPath(root, res, x);

        return res;
    }

    public static boolean getPath(Node root, ArrayList<Integer> ls, int x) {
        if (root == null) {
            return false;
        }

        ls.add(root.data);

        if (root.data == x){
            return true;
        }

        if (getPath(root.left, ls, x) || getPath(root.right, ls, x)) {
            return true;
        }

        ls.remove(ls.size() - 1);
        return false;
    }
}
