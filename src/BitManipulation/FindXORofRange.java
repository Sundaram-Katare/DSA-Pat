package BitManipulation;

public class FindXORofRange {
    public static int findXORinRange(int left, int right){
        return xorTillN(left-1) ^ xorTillN(right);
    }

    public static int xorTillN(int n) {
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return (n+1);
        if (n % 4 == 3) return 0;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(findXORinRange(3, 5));
    }
}
