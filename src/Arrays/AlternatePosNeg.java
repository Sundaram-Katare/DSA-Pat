package Arrays;

public class AlternatePosNeg {
    public static void setAlternate(int[] arr) {
        int posIndex = 0;
        int negIndex = 1;

        if (arr.length <=1) {
            return;
        }

        for (int i=0; i< arr.length-2; i++) {
            if (arr[i] > 0) {
                arr[posIndex] = arr[i];
                posIndex += 2;
            }

            if (arr[i] < 0) {
                arr[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        return;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        setAlternate(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " " );
        }
    }
}
