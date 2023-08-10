package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/17
 * @description https://leetcode-cn.com/problems/knight-probability-in-chessboard/
 */
public class KnightProbability {

    private static int[][] dirs = {{1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};

    public static void main(String[] args) {
        System.out.println(new KnightProbability().knightProbability(3, 2, 0, 0));
    }

    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[k + 1][n][n];
        for (int step = 0; step <= k; step++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (step == 0) {
                        dp[step][i][j] = 1;

                    } else {
                        for (int[] dir : dirs) {
                            int x = i + dir[0];
                            int y = j + dir[1];
                            if (x >= 0 && x < n && y >= 0 && y < n) {
                                dp[step][i][j] += dp[step - 1][x][y] / 8;
                            }
                        }
                    }
                }
            }
        }

        return dp[k][row][column];
    }
}
