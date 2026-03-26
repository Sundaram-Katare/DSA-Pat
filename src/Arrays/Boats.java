package Arrays;

public class Boats {
    public static int countBoats(int[] people, int limit) {
        int n = people.length;
        int cnt = 0;

        for (int i=0; i<n; i++) {
            int sum = 0;

            while (sum <= limit && i<n) {
                sum += people[i];
                i++;
            }
            if (sum > limit) {
                i--;
            }
            i--;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,3,4};
        System.out.println(countBoats(arr, 5));
    }
}
