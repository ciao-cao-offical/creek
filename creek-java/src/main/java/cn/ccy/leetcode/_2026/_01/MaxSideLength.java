package cn.ccy.leetcode._2026._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/?envType=daily-question&envId=2026-01-19">1292. 元素和小于等于阈值的正方形的最大边长</a>
 * @since 2026/1/19 22:53
 */
public class MaxSideLength {
    public static void main(String[] args) {

    }

    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length, n = mat[0].length;
        int[][] P = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                P[i][j] = P[i - 1][j] + P[i][j - 1] - P[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }

        int l = 1, r = Math.min(m, n), ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            boolean find = false;
            for (int i = 1; i <= m - mid + 1; i++) {
                for (int j = 1; j <= n - mid + 1; j++) {
                    int sum = P[i + mid - 1][j + mid - 1] - P[i - 1][j + mid - 1] - P[i + mid - 1][j - 1] + P[i - 1][j - 1];
                    if (sum <= threshold) {
                        find = true;
                        break;
                    }
                }
                if (find) break;
            }
            if (find) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
