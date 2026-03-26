package SlidingWindow;

public class A_ContainsDuplicateII {
    public static boolean containsNearByDuplicateBrute(int[] nums, int k) {
       int n = nums.length;

       for(int i=0; i<n; i++) {
           for (int j=i+1; j<n; j++) {
               if (nums[i] == nums[j] && Math.abs(i-j) <= k) {
                   return true;
               }
           }
       }

       return false;
    }

    public static boolean containsNearByDuplicatesOptimal(int[] arr, int k) {
        if (arr.length == 1) {
            return false;
        }
        int l = 0;
        int r = l + 1;

        while (l < r) {
            if (arr[l] == arr[r]) {
                if ((r-l) <= k) {
                    return true;
                } else  {
                    l++;
                }
            } else if (arr[l] != arr[r] && r != arr.length - 1) {
                r++;
            } else {
                l++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsNearByDuplicateBrute(arr, 3));

        System.out.println(containsNearByDuplicatesOptimal(arr, 3));
    }
}
