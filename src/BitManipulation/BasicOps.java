package BitManipulation;

public class BasicOps {
    public static boolean checkIthBitSetOrNot(int num, int i) {
        return ((1 << i) & num) != 0;
    }

    public static boolean checkNumOddOrNot(int n) {
        return (n & 1) == 1;
    }

    public static boolean isPowerOf2(int n){
        return n > 0 && (n & (n-1)) == 0;
    }

    public static int countSetBitsBrute(int n) {
        // Its TC is O(log n).
        int count = 0;

        while (n > 0) {
            int lsb = checkIthBitSetOrNot(n, 0) ? 1 : 0;
            count += (lsb ^ 0) == 0 ? 0 : 1;
            n = n >> 1;
        }

        return count;
    }

    public static int countSetBitsOptimal(int n) {
        // TC is O(k) where k is the number of setBits in the binary representation of a number.
        int count = 0;

        while(n > 0) {
            n &= (n-1);// Turn off the rightmost set bit. ex:- 1111(15) will become(1110).
            count++;
        }

        return count;
    }


    // Don't use divide/multiply and mod.
    public static int divide(int dividend, int divisor) {

        if (dividend == divisor) return 1;
        if (dividend == Integer.MAX_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor == 1) return dividend;

        boolean isPositive = true;

        if (dividend >=0 && divisor < 0 ){
            isPositive = false;
        } else if (dividend < 0 && divisor > 0) {
            isPositive = false;
        }

        long n = dividend;
        long d = divisor;

        n = Math.abs(n);
        d = Math.abs(d);

        long ans = 0, sum = 0;

        while (sum + d <= n) {
            ans++;
            sum += d;
        }

        if (ans > Integer.MAX_VALUE && isPositive) {
            return Integer.MAX_VALUE;
        }
        if (ans > Integer.MAX_VALUE && !isPositive) {
            return Integer.MIN_VALUE;
        }

        return isPositive ? (int)ans : (int)(-1 * ans);
    }

    public static int setRightMostSetBit(int n) {
        return n | (n+1);
    }

    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return;
    }

    public static void main(String[] args) {
        System.out.println(checkIthBitSetOrNot(87, 4));
        // 87 ----> 0101 0111 { ith bit is from LSB(right) Oth index wise}

        System.out.println(checkNumOddOrNot(12036578));
        // Odd numbers ki LSB is 1 and even ki 0.

        System.out.println(isPowerOf2(1000));

        System.out.println(countSetBitsBrute(87));

        System.out.println(countSetBitsOptimal(87));

        System.out.println(setRightMostSetBit(12367));

        System.out.println(divide(1234567894, 3));

    }
}
