package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/10
 * @description https://leetcode-cn.com/problems/unique-paths/
 */
public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(new UniquePaths().uniquePaths(3, 7));
    }

    public int uniquePaths(int m, int n) {
        int[][] ss = new int[m][n];
        for (int i = 0; i < m; i++) {
            ss[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            ss[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ss[i][j] = ss[i - 1][j] + ss[i][j - 1];
            }
        }

        return ss[m - 1][n - 1];
    }
}
