package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KSortedArray {
    public static List<Integer> sort(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0; i<= k; i++){
            minHeap.add(arr[i]);
        }

        for (int i=k+1; i<arr.length; i++) {
            result.add(minHeap.poll());
            minHeap.add(arr[i]);
        }

        while (!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        List<Integer> ans = sort(arr, k);

        for (int a: ans) {
            System.out.print(a + " ");
        }
    }
}
