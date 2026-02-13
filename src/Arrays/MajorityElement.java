package Arrays;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
      int count = 0;
      int element = arr[0];

      for (int i=0; i<arr.length; i++) {
          if(count == 0) {
              count++;
              element = arr[i];
          } else if (arr[i] == element) {
              count++;
          } else{
              count--;
          }
      }

      int countOccurences = 0;
      for (int i=0; i<arr.length; i++) {
          if(arr[i] == element) {
              countOccurences++;
          }
      }

      if (countOccurences > arr.length/2){
          return element;
      }

      return -1;
    }

    public static int approach2(int[] arr) {
        int n = arr.length;
        int count = 1;

        Arrays.sort(arr);

        for (int i=0; i<n-1; i++){
            if (arr[i] == arr[i+1]){
                count++;
            }

            if (count > n/2){
                return arr[i];
            }

            if (arr[i] != arr[i+1]){
                count = 1;
            }
        }

        return -1;
    }

//    public static int approach1(int[] arr) {
//        int n = arr.length;
//
//        int count = 1;
//
//        for (int i=0; i<n; i++) {
//            count = 1;
//            for (int j=i+1; j<n; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {4,8,2,5,8,8,6,8,8};

        System.out.println(majorityElement(arr));

        System.out.println(approach2(arr));
    }
}
