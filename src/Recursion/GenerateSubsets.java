//package Recursion;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GenerateSubsets {
//     public static List<Integer> generate(int[] arr) {
////         List<List<Integer>> ans = new ArrayList<>();
//
//         List<Integer> ans = new ArrayList<>();
//
//         List<Integer> curr = new ArrayList<>();
//         int sum = 0;
//
//         helper(arr, 0, curr, ans, sum);
//
//         return ans;
//     }
//
//     public static void helper(int[] arr, int index, List<Integer> curr, List<Integer> result, int sum) {
//         if (index == arr.length){
//
//             result.add(sum);//⭐⭐⭐⭐
//             return;
//         }
//
//         //exclude
//         helper(arr, index+1, curr, result, sum);
//
//         //include
//         curr.add(arr[index]);
//         helper(arr, index+1, curr, result, sum + arr[index]);
//
//         curr.removeLast();
//     }
//
//    public static void main(String[] args) {
//         int[] arr = {1,2,3};
////        List<List<Integer>> ans = generate(arr);
//
//        List<Integer> ans = generate(arr);
//
//        System.out.println(ans);
//    }
//
//    public static boolean binary(int[] arr, int target) {
//         int s = 0;
//         int e = arr.length - 1;
//
//         while (s < e){
//             int m = (s + (e-s))/2;
//
//             if ()
//         }
//    }
//}
