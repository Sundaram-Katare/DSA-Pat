//package Trees;
//
//import java.util.*;
//
//// Simple Pair class to hold a node and its vertical level
//
//// Class containing the logic for top view
//public class TopView {
//
//    class Pair {
//        Node node;
//        int vertical;
//
//        Pair(Node node, int vertical) {
//            this.node = node;
//            this.vertical = vertical;
//        }
//    }
//
//    public static List<Integer> topView(Node root) {
//        List<Integer> result = new ArrayList<>();
//
//        if (root == null) {
//            return result;
//        }
//
//        // Map to store vertical level -> node value (only first encountered)
//        Map<Integer, Integer> verticalMap = new TreeMap<>();
//
//        // Queue for BFS storing Pair(node, vertical_level)
//        Queue<Pair> queue = new LinkedList<>();
//        queue.add(new Pair(root, 0));
//
//        // BFS traversal
//        while (!queue.isEmpty()) {
//            Pair current = queue.poll();
//            Node node = current.node;
//            int line = current.vertical;
//
//            // Store the first node encountered at each vertical level
//            verticalMap.putIfAbsent(line, node.data);
//
//            // Add left child with vertical level - 1
//            if (node.left != null) {
//                queue.add(new Pair(node.left, line - 1));
//            }
//
//            // Add right child with vertical level + 1
//            if (node.right != null) {
//                queue.add(new Pair(node.right, line + 1));
//            }
//        }
//
//        // Collect values from the map into the result list
//        result.addAll(verticalMap.values());
//        return result;
//    }
//}
//
//    public static void main(String[] args) {
//        // Create the sample binary tree
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.left.left = new Node(4);
//        root.left.right = new Node(10);
//        root.left.left.right = new Node(5);
//        root.left.left.right.right = new Node(6);
//        root.right = new Node(3);
//        root.right.right = new Node(10);
//        root.right.left = new Node(9);
//
//        List<Integer> result = topV
//
//        System.out.print("Top View Traversal: ");
//        for (int val : result) {
//            System.out.print(val + " ");
//        }
//    }
//}