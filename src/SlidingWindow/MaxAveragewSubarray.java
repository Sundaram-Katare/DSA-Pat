package SlidingWindow;

public class MaxAveragewSubarray {
    public static double maxAvgOptimal(int[] arr, int k) {
        double maxAvg = 0;
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / k;

        maxAvg = Math.max(maxAvg, avg);

        for(int i=k; i<arr.length; i++) {
            sum -= arr[i-k];
            sum += arr[k];

            avg = (double) sum / k;

            maxAvg = Math.max(maxAvg, avg);
        }

        return maxAvg;
    }

    public static void main(String[] args) {
        int[] arr = { 1,12,-5,-6,50,3};

        System.out.println(maxAvgOptimal(arr, 4));
    }
}
