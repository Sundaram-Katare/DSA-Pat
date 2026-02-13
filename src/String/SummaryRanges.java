//package String;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SummaryRanges {
//    public static List<String> range(int[] arr) {
//        int n = arr.length;
//        List<String> ans = new ArrayList<>();
//        int start = arr[0];
//        int cnt = 0;
//
//        for (int i=1; i<n; i++) {
//            if (arr[i] != arr[i-1] + 1) {
//                if (cnt > 1) {
//                    String s = String.valueOf(start) + "->" + String.valueOf(arr[i-1]);
//                    start = arr[i];
//                    ans.add(s);
//                } else {
//                    String s = String.valueOf(arr[i-1]);
//                    start = arr[i];
//                    ans.add(s);
//                }
//                cnt = 1;
//            } else {
//                cnt++;
//            }
//        }
//
//        if (cnt > 1) {
//
//        }
//    }
//}
