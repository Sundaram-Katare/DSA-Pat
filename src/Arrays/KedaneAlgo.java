package Arrays;

// Find the the sum of the subarray with maximum sum.
public class KedaneAlgo {
  public static int maxSubarraySum(int[] arr) {
      int sum = 0;
      int start= 0;
      int s =  -1;
      int e = -1;
      int max = Integer.MIN_VALUE;

      for (int i=0; i<arr.length; i++) {
          if (sum == 0) start = i;

          sum += arr[i];

          if (sum > max) {
              max = sum;
              s = start;
              e = i;
          }

          if (sum < 0 ) {
              sum = 0;
              s = i;
          }
      }

      for (int i=s; i<=e; i++) {
          System.out.print(arr[i] + " ");
      }

      System.out.println();

      return max;
  }

  public static int maxSubarraySumInCircular(int[] arr) {
      int maxNormal;

      int minSum = arr[0];
      int totalSum  = 0;
      int currSum  = 0;

      for (int i=0; i<arr.length; i++){
          totalSum += arr[i];
      }

      maxNormal = maxSubarraySum(arr);

      for (int i=0; i<arr.length; i++) {
          currSum = Math.min(arr[i], currSum + arr[i]);
          minSum = Math.min(minSum, currSum);
      }

      if (maxNormal < 0) return maxNormal;

      return Math.max(maxNormal, totalSum - minSum);
  }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int[] arr2 = {5,-3,5};

        System.out.println(maxSubarraySum(arr));

        System.out.println(maxSubarraySumInCircular(arr2));
    }
}
