package Arrays;

public class Stock {
    public static int maxProfit(int[] arr) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        return maxProfit;
    }

    public static int maxProfit2(int[] arr) {
        int maxProfit = 0;

        for (int i=0; i<arr.length-1; i++){
            if (arr[i] < arr[i+1]){
                maxProfit += arr[i+1] - arr[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,2,4,3,6,5};

        System.out.println(maxProfit(arr));

        int[] arr2 = {1,2,3,4,5};
        System.out.println(maxProfit2(arr2));
    }
}
