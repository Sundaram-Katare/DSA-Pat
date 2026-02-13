package BinarySearch;

public class UpperLowerBound {
    public static int lower(int[] arr, int x) {
        int s = 0;
        int e = arr.length-1;
        int ans = -1;

        while (s <= e) {
            int mid = (s+e)/2;

            if(arr[mid] >= x) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static int upper(int[] arr, int x) {
        int s = 0;
        int e = arr.length-1;
        int ans = -1;

        while (s <= e) {
            int mid = (s+e)/2;

            if(arr[mid] > x) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};

        System.out.println(lower(arr, 9));
        System.out.println(upper(arr, 9));
    }
}
