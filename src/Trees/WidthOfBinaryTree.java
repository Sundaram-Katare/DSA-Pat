package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class WidthOfBinaryTree {
    public static int width(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()){
            Pair current = queue.poll();
            Node node = current.node;
            int line = current.line;

            map.putIfAbsent(line, node.data);

            if (node.left != null) {
                queue.add(new Pair(node.left, line - 1));
            }

            // Add right child with vertical level + 1
            if (node.right != null) {
                queue.add(new Pair(node.right, line + 1));
            }
        }

        int leftMost = Math.abs(map.firstKey());
        int rightMost = map.lastKey();

        return leftMost + rightMost;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        System.out.println(width(root));
    }
}

class Pair {
    Node node;
    int line;

    Pair(Node n, int l) {
        node = n;
        line = l;
    }
}
