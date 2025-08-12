package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/ways-to-express-an-integer-as-sum-of-powers/?envType=daily-question&envId=2025-08-12">2787. 将一个数字表示成幂的和的方案数</a>
 * @since 2025/8/12 23:12
 */
public class NumberOfWays {
    public static void main(String[] args) {

    }

    final int MOD = 1_000_000_007;

    public int numberOfWays(int n, int x) {
        long[][] dp = new long[n + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            long val = (long) Math.pow(i, x);
            for (int j = 0; j <= n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= val) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - (int) val]) % MOD;
                }
            }
        }
        return (int) dp[n][n];
    }
}
