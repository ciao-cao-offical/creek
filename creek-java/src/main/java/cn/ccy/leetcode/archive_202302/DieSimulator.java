package cn.ccy.leetcode.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/10
 * @description https://leetcode.cn/problems/dice-roll-simulation/
 * ⭐️️⭐️️⭐️️⭐️️⭐️️ cvd，【动态规划】
 */
public class DieSimulator {
    public static void main(String[] args) {

    }

    static final int MOD = 1000000007;

    public int dieSimulator(int n, int[] rollMax) {
        int[][] d = new int[n + 1][6];
        int[] sum = new int[n + 1];
        sum[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 6; j++) {
                int pos = Math.max(i - rollMax[j] - 1, 0);
                int sub = ((sum[pos] - d[pos][j]) % MOD + MOD) % MOD;
                d[i][j] = ((sum[i - 1] - sub) % MOD + MOD) % MOD;
                if (i <= rollMax[j]) {
                    d[i][j] = (d[i][j] + 1) % MOD;
                }
                sum[i] = (sum[i] + d[i][j]) % MOD;
            }
        }
        return sum[n];
    }
}
