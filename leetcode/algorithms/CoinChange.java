/*
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)
 * 
 * Example 2:
 * coins = [2], amount = 3
 * return -1.
 * 
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 1; i <= amount; ++i) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; ++j) {
                if (coins[j] == amount) {
                    dp[i] = 1;
                    break;
                }
            }
            if (dp[i] == 1) {
                continue;
            }
            for (int j = 1; j < i; ++j) {
                if (dp[j] != Integer.MAX_VALUE && dp[i - j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[j] + dp[i - 1]);
                }
            }
        }
        return dp[amount];
    }

}
