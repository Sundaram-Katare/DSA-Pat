package Arrays;

public class CountTrailingZerosInFact {
    public static int countZeros(int n) {
        int cntZeros = 0;

        int num = factorial(n);

        System.out.println(num);

        while(num % 10 == 0) {
            System.out.println(num % 10);
            cntZeros++;
            num = num/10;
            System.out.println(num);
        }
        return cntZeros;
    }

    public static int factorial(int n){
        if(n == 0) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(countZeros(13));
    }
}
