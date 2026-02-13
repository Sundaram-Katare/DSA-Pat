package Heaps;

import java.util.*;

public class ReplaceWithRank {
    public static List<Integer> replaced(int[] arr) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        List<Integer> ans = new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            minHeap.offer(new int[] { arr[i], i});
        }

        int rank = 1;
        int[] rankArr = new int[arr.length];

        while (!minHeap.isEmpty()){
            int[] curr = minHeap.poll();
            System.out.println(curr[0] + ", " + curr[1]);
            rankArr[curr[1]] = rank++;
        }

        for (int a : rankArr) {
            ans.add(a);
        }

        return ans;
    }

    public static int[] replcaeWithRankWithHashmap(int[] arr) {
        int[] sortedArr = arr.clone();

        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;

        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 15, 26, 2, 98, 6};

        List<Integer> ls = replaced(arr);

        for (int a: ls){
            System.out.print(a + " ");
        }

        System.out.println();

        int[] ans = replcaeWithRankWithHashmap(arr);

        for (int a: ans) {
            System.out.print(a + " ");
        }
    }
}
