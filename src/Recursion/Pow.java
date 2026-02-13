package Recursion;

public class Pow {
    public static double pow(int x, int n) {
        double ans = 1.0;
        while(n > 0){
            if ( (n & 1) == 1){
                ans = ans * x;
            }
            x *= x;

            n = n >> 1;
        }
        return ans;
    }

    public static double powRecursive(int x, int n) {
        double ans = 1.0;
        return powHelper(ans, x, n);
    }

    public static double powHelper(double ans, int x, int n) {
        if (n == 0){
            return ans;
        }
        if ((n & 1) == 1){
            ans = ans * x;
        }
        x *= x;
        return powHelper(ans, x, n>>1);
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 10));

        System.out.println(powRecursive(5, 5));
    }
}
