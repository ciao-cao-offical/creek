package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-sets-of-k-non-overlapping-line-segments/?envType=daily-question&envId=2026-09-16">1621. 大小为 K 的不重叠线段的数目</a>
 * @since 2026/9/16 01:36
 */
public class NumberOfSets {
    public static void main(String[] args) {

    }

    private static final int MOD = 1000000007;

    public int numberOfSets(int n, int k) {
        int[] dp = new int[n];
        int[] prefixSums = new int[n + 1];
        for (int j = 0; j < n; j++) {
            dp[j] = 1;
            prefixSums[j + 1] = (prefixSums[j] + dp[j]) % MOD;
        }
        for (int i = 1; i <= k; i++) {
            dp[0] = 0;
            for (int j = 1; j < n; j++) {
                dp[j] = (dp[j - 1] + prefixSums[j]) % MOD;
            }
            for (int j = 0; j < n; j++) {
                prefixSums[j + 1] = (prefixSums[j] + dp[j]) % MOD;
            }
        }
        return dp[n - 1];
    }
}
