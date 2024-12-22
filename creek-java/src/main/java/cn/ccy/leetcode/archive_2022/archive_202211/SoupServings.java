package cn.ccy.leetcode.archive_2022.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/21 0021
 * @description https://leetcode.cn/problems/soup-servings/
 * ☆☆☆☆☆ cvd
 */
public class SoupServings {
    public static void main(String[] args) {

    }

    //【动态规划】，md，数学... https://leetcode.cn/problems/soup-servings/solutions/1981704/fen-tang-by-leetcode-solution-0yxs/
    public double soupServings(int n) {
        n = (int) Math.ceil((double) n / 25);
        if (n >= 179) {
            return 1.0;
        }
        double[][] dp = new double[n + 1][n + 1];
        dp[0][0] = 0.5;
        for (int i = 1; i <= n; i++) {
            dp[0][i] = 1.0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = (dp[Math.max(0, i - 4)][j] + dp[Math.max(0, i - 3)][Math.max(0, j - 1)] + dp[Math.max(0, i - 2)][Math.max(0, j - 2)] + dp[Math.max(0, i - 1)][Math.max(0, j - 3)]) / 4.0;
            }
        }
        return dp[n][n];
    }
}
