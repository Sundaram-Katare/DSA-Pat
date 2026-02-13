package Arrays;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
        public static void next(int[] arr) {
            int breakingPoint = -1;
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] < arr[i + 1]) {
                    breakingPoint = i;
                    break;
                }
            }
            if (breakingPoint == -1) {
                reverse(arr, 0, arr.length - 1);
                return;
            }
            for (int i = arr.length - 1; i > breakingPoint; i--) {
                if (arr[i] > arr[breakingPoint]) {
                    int temp = arr[i];
                    arr[i] = arr[breakingPoint];
                    arr[breakingPoint] = temp;
                    break;
                }
            }
            reverse(arr, breakingPoint + 1, arr.length - 1);
        }

        public static void reverse(int[] arr, int s, int e) {
            while (s < e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        public static void recp(int[] arr, int index, List<List<Integer>> ans) {
            if (index == arr.length) {
                List<Integer> ls = new ArrayList<>();

                for (int i=0; i<arr.length; i++) {
                    ls.add(arr[i]);
                }

                ans.add(ls);
                return;
            }

            for (int i=index; i<arr.length; i++){
                swap(i, index, arr);
                recp(arr, index+1, ans);
                swap(i, index, arr);
            }
            return;
        }

        private static void swap(int s, int e, int[] arr) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
        }

        public static void recUniquePerm(int[] arr, int index, List<List<Integer>> ans) {
            if (index == arr.length) {
                List<Integer> ls = new ArrayList<>();

                for (int i=0; i<arr.length; i++) {
                    ls.add(arr[i]);
                }

                if (!ans.contains(ls)){
                    ans.add(ls);
                }

                return;
            }

            for (int i=index; i<arr.length; i++){
                swap(i, index, arr);
                recUniquePerm(arr, index+1, ans);
                swap(i, index, arr);
            }
            return;
        }

        public static List<List<Integer>> allPermutataions(int[] arr) {
            List<List<Integer>> ans = new ArrayList<>();
            recUniquePerm(arr, 0, ans);

            return ans;
        }

        public static List<List<Integer>> uniquePerm(int[] arr) {
            List<List<Integer>> ans = new ArrayList<>();

            recUniquePerm(arr, 0, ans);

            return ans;
        }

        public static void main(String[] args) {
            int[] arr = {1, 1, 2};
            next(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }

            System.out.println();
            System.out.println("All Permutations are: ");

            List<List<Integer>> ans = allPermutataions(arr);

            for (int i=0; i<ans.size();i++) {
                for (int j=0; j<ans.get(i).size(); j++) {
                    System.out.print(ans.get(i).get(j) + " ");
                }
                System.out.println();
            }

            List<List<Integer>> ans2 = uniquePerm(arr);

            System.out.println("Unique Permutations are: ");

            for (int i=0; i<ans.size();i++) {
                for (int j=0; j<ans.get(i).size(); j++) {
                    System.out.print(ans.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
}
