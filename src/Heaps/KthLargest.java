package Heaps;

import java.util.PriorityQueue;

public class KthLargest {
    public static int kthLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0; i<k; i++) {
            minHeap.add(arr[i]);
        }

        for (int i=k; i<arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {6,5,1,2,4,8};

        System.out.println(kthLargestElement(arr, 3));
    }
}
