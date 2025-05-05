package cn.ccy.leetcode._2025._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/domino-and-tromino-tiling/?envType=daily-question&envId=2025-05-05">790. 多米诺和托米诺平铺</a>
 * @since 2025/5/5 18:24
 */
public class NumTilings {
    public static void main(String[] args) {

    }

    static final int MOD = 1000000007;

    public int numTilings(int n) {
        int[][] dp = new int[n + 1][4];
        dp[0][3] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = dp[i - 1][3];
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
            dp[i][3] = (((dp[i - 1][0] + dp[i - 1][1]) % MOD + dp[i - 1][2]) % MOD + dp[i - 1][3]) % MOD;
        }
        return dp[n][3];
    }
}
