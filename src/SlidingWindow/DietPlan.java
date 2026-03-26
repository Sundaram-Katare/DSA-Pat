package SlidingWindow;

public class DietPlan {
    public static int totalPointsBrute(int[] arr, int k, int upper, int lower) {
        int totalPoint = 0;

        for (int i=0; i<=arr.length - k; i++) {
            int sum = 0;
            int j = 0;
            while (j < k){
                sum += arr[j + i];
                j++;
            }

            if (sum > upper) {
                totalPoint++;
            }

            if (sum < lower) {
                totalPoint--;
            }
        }

        return totalPoint;
    }

    public static int totalPointsOptimal(int[] arr, int k, int upper, int lower) {
        int totalPoints = 0;

        int left = 0;
        int sum = 0;

        for (int right = 0; right<arr.length; right++) {
            sum += arr[right];

            if ((right - left + 1) > k) {
                sum -= arr[left];
                left++;
            }

            if ((right - left + 1) == k) {
                if (sum > upper) {
                    totalPoints++;
                }
                if (sum < lower) {
                    totalPoints--;
                }
            }
        }
        return totalPoints;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,0,0};

        System.out.println(totalPointsBrute(arr, 2, 5, 1));

        System.out.println(totalPointsOptimal(arr, 2, 5, 1));
    }
}