package PrefixSum.LC209;

public class MinSizeSubarray {
   public static int minSizeBrute(int[] nums, int target) {
       int minL = Integer.MAX_VALUE;
       int sum = 0;

       for (int i=0; i<nums.length; i++) {
           sum = 0;
           for (int j=i; j<nums.length; j++) {
               sum += nums[j];
               if (sum >= target) {
                   minL = Math.min(minL, j-i+1);
                   break;
               }
           }
       }

       return minL == Integer.MAX_VALUE ? 0 : minL;
   }

   public static int minSizeOptimal(int[] nums, int target) {
       int l = 0;
       int minL = Integer.MAX_VALUE;
       int sum = 0;

       for (int r=0; r<nums.length; r++) {
           sum += nums[r];

           while (sum >= target) {
               minL = Math.min(minL, r  - l + 1);
               sum -= nums[l];
               l++;
           }
       }

       return minL == Integer.MAX_VALUE ? 0 : minL;
   }

    public static void main(String[] args) {
        int[] arr = { 2,3,1,2,4,3 };

        System.out.println(minSizeBrute(arr, 7));

        System.out.println(minSizeOptimal(arr, 7));
    }
}
