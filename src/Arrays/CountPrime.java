package Arrays;

import java.util.Arrays;

public class CountPrime {
    public static int count(int n) {
        int cnt = 0;
        for (int i=2; i<n; i++) {
            boolean prime = true;
            for (int j=2; j*j<=i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int countP(int n) {
        boolean[] arr = new boolean[n];
        Arrays.fill(arr, true);
        int k;
        int cnt = 0;

        for (int i=2; i*i <= n; i++){
            if (arr[i]) {
                k = 1;
                for (int j=i*k+i; j<n; j+=i) {
                    if (arr[j]) {
                        arr[j] = false;
                    }
                }
            }
        }

        for (int i=2; i<n; i++) {
            if (arr[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(count(16));

        System.out.println(countP(40));
    }
}
