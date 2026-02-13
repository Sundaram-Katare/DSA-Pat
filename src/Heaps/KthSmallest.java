package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num: arr) {
            maxHeap.add(num);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int k = 4;

        System.out.println(kthSmallest(arr, k));
    }
}
