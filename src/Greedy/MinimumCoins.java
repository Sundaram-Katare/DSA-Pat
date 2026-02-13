package Greedy;

public class MinimumCoins {
    public static int minCoinsNeeded(int[] coins, int amount) {
        int n = coins.length;
        int count = 0;

        for (int i=n-1; i>=0; i--){
            while (amount >= coins[i]){
                amount -= coins[i];
                count++;
            }
        }

        return amount == 0 ? count : -1;
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5};
        int amount = 17;

        System.out.println(minCoinsNeeded(coins, amount));
    }
}
