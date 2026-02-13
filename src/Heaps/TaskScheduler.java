package Heaps;

import java.util.*;

public class TaskScheduler {
    public static int totalTime(char[] tasks, int n) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char task : tasks) {
            freq.put(task, freq.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int count: freq.values()){
            maxHeap.add(count);
        }

        //Total time
        int time = 0;

        while (!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();

            int cycle = n + 1;

            int i = 0;

            while (i < cycle && !maxHeap.isEmpty()){

                int count = maxHeap.poll();

                count--;

                if (count > 0) {
                    temp.add(count);
                }
                time++;
                i++;
            }

            for (int rem: temp) {
                maxHeap.add(rem);
            }

            if (!maxHeap.isEmpty()) {
                time += (cycle - i);
            }
        }
        return time;
    }

    public static void main(String[] args) {
        char[] arr = { 'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;

        System.out.println(totalTime(arr, n));
    }
}
