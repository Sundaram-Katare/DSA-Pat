package Heaps;

import java.util.PriorityQueue;

public class CheckKSorted {
    public static boolean check(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i=0; i<arr.length; i++) {
            pq.offer(new int[]{ arr[i], i});
        }

        for (int i=0; i<arr.length; i++){
            int[] curr = pq.poll();
            if (Math.abs(i - curr[1]) > k) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 2;

        System.out.println(check(arr, k));
    }
}
