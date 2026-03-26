package Arrays;

public class MaxConsecutiveOnesII {
    public static int maxOnesII(int[] arr) {
        int onesCnt = 0;
        int zeroCnt = 0;
        int maxOnes = Integer.MIN_VALUE;
        int zeroIndex = 0;

        for (int i=0; i<arr.length; i++){

            if (arr[i] == 1) {
                onesCnt++;
            }

            if (arr[i] == 0 && zeroCnt < 1) {
                zeroCnt++;
                onesCnt++;
            } else if (arr[i] == 0 && zeroCnt >= 1) {
                maxOnes = Math.max(maxOnes, onesCnt);
                onesCnt = (onesCnt - zeroIndex) > 0 ? (onesCnt - zeroIndex) : 1;
                zeroCnt = 1;
                zeroIndex = i;
            }
        }

        maxOnes = Math.max(maxOnes, onesCnt);

        return maxOnes;
    }

    public static int maxConsIII(int[] arr, int k) {
        int maxOnes = 0;
        int cntOnes = 0;
        int cntZeros = 0;

        for (int i=0; i<arr.length; i++) {
            cntOnes = 0;
            cntZeros = 0;
            for (int j=i; j<arr.length; j++) {
                if (arr[j] == 1) {
                    cntOnes++;
                } else {
                    if (cntZeros < k) {
                        cntZeros++;
                        cntOnes++;
                    } else {
                        break;
                    }
                }
            }
            maxOnes = Math.max(maxOnes, cntOnes);
        }

        return maxOnes;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0};
        System.out.println(maxConsIII(arr, 3));
    }
}
