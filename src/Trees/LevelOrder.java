package Trees;

import java.util.*;

public class LevelOrder {
    public static List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> currentLevel = new ArrayList<>(level);
            for (int i = 0; i < level; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.data);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }
            result.add(currentLevel);
        }
        return result;
    }

    public static List<List<Integer>> levelOrderBottomUp(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> currentLevel = new ArrayList<>(level);
            for (int i = 0; i < level; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode.data);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            }
            result.add(0, currentLevel);
        }
        return result;
    }

    public static List<List<Integer>> zigzag(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<Node> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;

        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> currentLevel = new ArrayList<>(level);
            for (int i = 0; i < level; i++) {
                if (!reverse) {
                    Node currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.data);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    Node currentNode = queue.pollLast();
                    currentLevel.add(currentNode.data);
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        List<List<Integer>> ans = zigzag(root);

        for (int i=0; i< ans.size(); i++){
                System.out.print(ans.get(i) + " ");
        }
    }
}
