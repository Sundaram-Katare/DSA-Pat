package Trees;

import java.util.*;

public class VerticalOrderTraversal {
    public static List<List<Integer>> vertical(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodes = new TreeMap<>();

        Queue<Pair> todo = new LinkedList<>();

        todo.offer(new Pair(root, 0, 0));

        while (!todo.isEmpty()){
            Pair p = todo.poll();

            Node n = p.node;
            int x = p.vertical;
            int y = p.level;

            nodes.putIfAbsent(x, new TreeMap<>());
            nodes.get(x).putIfAbsent(y, new PriorityQueue<>());
            nodes.get(x).get(y).offer(n.data);

            if (n.left != null){
                todo.offer(new Pair(n.left, x-1, y+1));
            }

            if (n.right != null){
                todo.offer(new Pair(n.right, x+1, y+1));
            }
        }

        for (TreeMap<Integer, PriorityQueue<Integer>> ys : nodes.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> pq : ys.values()) {
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            ans.add(col);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();
    }

    static class Pair{
        Node node;
        int vertical;
        int level;

        Pair(Node n, int v, int l) {
            node = n;
            vertical = v;
            level = l;
        }
    }
}
