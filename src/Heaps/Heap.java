package Heaps;

import java.sql.SQLOutput;

public class Heap {
    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        h.insert(1);
        h.insert(3);
        h.insert(6);
        h.insert(5);
        h.insert(9);
        h.insert(8);
        h.insert(0);

        System.out.println("Min is: " + h.getMin());
    }
}

 class MinHeap{

    private int[] heapArray;

    private int capacity;

    private int current_heap_size;

    public MinHeap(int n) {
        capacity = n;
        heapArray = new int[capacity];
        current_heap_size = 0;
    }

     private void swap(int[] arr, int a, int b) {
         int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
     }

     private int parent(int key) {
        return (key -1)/2;
     }

     private int leftChild(int key) {
        return (2*key) + 1;
     }

     private int rightChild(int key){
        return (2*key) + 2;
     }

     public boolean insert(int x) {
        if (capacity == current_heap_size){
            System.out.println("Heap is already reached its full capacity");
            return false;
        }

        int i = current_heap_size;
        heapArray[i] = x;
        current_heap_size++;

        while (i != 0 && heapArray[i] < heapArray[parent(i)])  {
            swap(heapArray, i, parent(i));
            i = parent(i);
        }
         System.out.println("Item Inserted Successfully");
         return true;
     }

     public void decreaseKey(int key, int new_val) {
        heapArray[key] = new_val;

         while (key != 0 && heapArray[key] < heapArray[parent(key)]) {
             swap(heapArray, key, parent(key));
             key = parent(key);
         }
     }

     public int getMin() {
        return heapArray[0];
     }

     public int extractMin() {
        if (current_heap_size <= 0) {
            return Integer.MAX_VALUE;
        }

        if (current_heap_size == 1) {
            current_heap_size--;
            return heapArray[0];
        }

        int root = heapArray[0];

        heapArray[0] = heapArray[current_heap_size-1];
        current_heap_size--;
        minHeapify(0);

        return root;
     }

     public void deleteKey(int key) {
         decreaseKey(key, Integer.MIN_VALUE);
         extractMin();
     }

     private void minHeapify(int key) {
        int l = leftChild(key);
        int r = rightChild(key);

        int smallest = key;

        if (l < current_heap_size && heapArray[l] < heapArray[smallest]) {
            smallest = l;
        }

         if (r < current_heap_size && heapArray[r] < heapArray[smallest]) {
             smallest = r;
         }

         if (smallest != key) {
             swap(heapArray, key, smallest);
             minHeapify(smallest);
         }
     }

     public void increaseKey(int key, int new_val) {
         heapArray[key] = new_val;
         minHeapify(key);
     }

     // Changes value on a key
     public void changeValueOnAKey(int key, int new_val) {
         if (heapArray[key] == new_val) {
             return;
         }
         if (heapArray[key] < new_val) {
             increaseKey(key, new_val);
         } else {
             decreaseKey(key, new_val);
         }
     }
}

class MaxHeap {

    private int[] heapArray;

    private int capacity;

    private int current_heap_size;

    public MaxHeap(int n) {
        capacity = n;
        heapArray = new int[capacity];
        current_heap_size = 0;
    }

    public int parent(int key) {
        return (key -1) / 2;
    }

    public int leftChild(int key) {
        return (2*key) + 1;
    }

    public int rightChild(int key) {
        return (2 * key) + 2;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void insert(int x){
        if (current_heap_size == capacity) {
            System.out.println("Capacity is full");
            return;
        }

        int i = current_heap_size;
        heapArray[i] = x;
        current_heap_size++;

        while (i!=0 && heapArray[i] > heapArray[parent(i)]){
            swap(heapArray, i, parent(i));
            i = parent(i);
        }
        System.out.println("Inserted Successfully");
    }

    public int getMax() {
        return heapArray[0];
    }

    public void decreaseKey(int key, int new_val) {
        heapArray[key] = new_val;
        maxHeapify(key);
    }

    public void maxHeapify(int key) {
        int l = leftChild(key);
        int r = rightChild(key);

        int largest = key;

        if (l<current_heap_size && heapArray[l] > heapArray[largest]) {
            largest = l;
        }

        if (r < current_heap_size && heapArray[r] > heapArray[largest]){
            largest = r;
        }

        if (key != largest) {
            swap(heapArray, key, largest);
            maxHeapify(largest);
        }
    }

    public void increaseKey(int key, int new_val) {
        heapArray[key] = new_val;

        while (key != 0 && heapArray[key] > heapArray[parent(key)]) {
            swap(heapArray, key, parent(key));
            key = parent(key);
        }
    }

    public int extractMax() {
        if (current_heap_size == 0) {
            return Integer.MIN_VALUE;
        }

        if (current_heap_size == 1) {
            current_heap_size--;
            return heapArray[0];
        }

        int root = heapArray[0];

        heapArray[0] = heapArray[current_heap_size - 1];
        current_heap_size--;
        maxHeapify(0);

        return root;
    }
}
