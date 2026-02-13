package BitManipulation;

// Number of bits needed to flip to form A to B.
public class NumberOfBitsToFlip {
    public static int countFlipBits(int a, int b) {
        int xor = a ^ b;

        return countSetBits(xor);
    }

    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        System.out.println(countFlipBits(a, b));
    }
}
