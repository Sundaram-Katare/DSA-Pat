package Arrays;

public class ThreeConsecutiveSequence {

    public static int[] threeConsecutive(int num) {
        int n = num/2;
        int[] arr = new int[3];

        for (int i=0; i<= n-2; i++){
            if (i + (i+1) + (i+2) == num) {
                arr[0] = i;
                arr[1] = i+1;
                arr[2] = i+2;
                return arr;
            }
        }
        int[] a = {};
        return a;
    }

    public static void main(String[] args) {
       int[] ans = threeConsecutive(45);

       for (int i=0; i<3; i++) {
           System.out.print(ans[i] + " ");
       }
    }
}
