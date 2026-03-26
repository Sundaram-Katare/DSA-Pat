package PrefixSum;

public class PivotIndex {
    public static int pivotIndexBrute(int[] arr) {
        int ans = -1;
        int leftSum = 0;
        int rightSum = 0;

        for (int i=0; i<arr.length; i++) {
            rightSum = 0;
            for (int j=i+1; j<arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                ans = i;
            }

            leftSum += arr[i];
        }

        return ans;
    }

    public static int pivotIndexBetter(int[] arr) {
        int ans = -1;

        int n = arr.length;

        int currLeftSum = 0;
        int currRightSum = 0;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        for (int i=0; i<n; i++) {
            leftSum[i] = currLeftSum;
            currLeftSum += arr[i];
        }

        for (int i=n-1; i>= 0; i--) {
            rightSum[i] = currRightSum;
            currRightSum += arr[i];
        }

        for (int i=0; i<n; i++) {
            if (leftSum[i] == rightSum[i]) {
                ans = i;
            }
        }

        return ans;
    }

    public static int pivotIndexOptimal(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        for (int i=0; i<arr.length; i++) {
            totalSum += arr[i];
        }

        for (int i=0; i<arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};

        System.out.println(pivotIndexBrute(arr));

        System.out.println(pivotIndexBetter(arr));

        System.out.println(pivotIndexOptimal(arr));
    }
}
