package Heaps;

public class MinToMax {
    public static void convertToMax(int[] arr, int n) {
        for (int i=(n-2)/2; i>=0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    public static void maxHeapify(int[] heapArray, int n, int key) {
        int l = (2 * key) + 1;
        int r = (2 * key) + 2;

        int largest = key;

        if (l<n && heapArray[l] > heapArray[largest]) {
            largest = l;
        }

        if (r < n && heapArray[r] > heapArray[largest]){
            largest = r;
        }

        if (key != largest) {
            swap(heapArray, key, largest);
            maxHeapify(heapArray, n, largest);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,3,6,5,9,8 };

        print(arr);

        System.out.println();
        convertToMax(arr, 6);

        print(arr);
    }
}
