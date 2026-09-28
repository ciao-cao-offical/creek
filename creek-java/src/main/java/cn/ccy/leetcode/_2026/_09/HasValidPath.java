package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-there-is-a-valid-parentheses-string-path/?envType=daily-question&envId=2026-09-29">2267. 检查是否有合法括号字符串路径</a>
 * @since 2026/9/29 00:45
 * ★★★★★ 2026cvd
 */
public class HasValidPath {
    public static void main(String[] args) {

    }

    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int pathLen = n + m - 1;

        if (pathLen % 2 == 1) {
            return false;
        }
        if (grid[0][0] != '(' || grid[n - 1][m - 1] != ')') {
            return false;
        }

        boolean[][][] dp = new boolean[n][m][pathLen + 1];

        dp[0][0][1] = true;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int change = grid[i][j] == '(' ? 1 : -1;

                if (i > 0) {
                    for (int balance = 0; balance <= pathLen; ++balance) {
                        if (!dp[i - 1][j][balance]) {
                            continue;
                        }

                        int next = balance + change;

                        if (next >= 0) {
                            dp[i][j][next] = true;
                        }
                    }
                }

                if (j > 0) {
                    for (int balance = 0; balance <= pathLen; ++balance) {
                        if (!dp[i][j - 1][balance]) {
                            continue;
                        }

                        int next = balance + change;

                        if (next >= 0) {
                            dp[i][j][next] = true;
                        }
                    }
                }
            }
        }

        return dp[n - 1][m - 1][0];
    }
}
