package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-number-of-subsequences-with-equal-gcd/?envType=daily-question&envId=2026-07-14">3336. 最大公约数相等的子序列数量</a>
 * @since 2026/7/14 01:30
 * ★★★★★ 2026cvd
 */
public class SubsequencePairCount {
    public static void main(String[] args) {

    }

    static final int MOD = 1000000007;

    public int subsequencePairCount(int[] nums) {
        int m = 0;
        for (int num : nums) {
            m = Math.max(m, num);
        }

        int[][] dp = new int[m + 1][m + 1];
        dp[0][0] = 1;

        for (int num : nums) {
            int[][] ndp = new int[m + 1][m + 1];
            for (int j = 0; j <= m; j++) {
                int divisor1 = gcd(j, num);
                for (int k = 0; k <= m; k++) {
                    int val = dp[j][k];
                    if (val == 0) {
                        continue;
                    }
                    int divisor2 = gcd(k, num);
                    ndp[j][k] = (ndp[j][k] + val) % MOD;
                    ndp[divisor1][k] = (ndp[divisor1][k] + val) % MOD;
                    ndp[j][divisor2] = (ndp[j][divisor2] + val) % MOD;
                }
            }
            dp = ndp;
        }

        int ans = 0;
        for (int j = 1; j <= m; j++) {
            ans = (ans + dp[j][j]) % MOD;
        }
        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
