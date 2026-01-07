package cn.ccy.leetcode._2026._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/max-dot-product-of-two-subsequences/?envType=daily-question&envId=2026-01-08">1458. 两个子序列的最大点积</a>
 * @since 2026/1/8 00:10
 * ☆☆☆☆☆ 2026cvd
 */
public class MaxDotProduct {
    public static void main(String[] args) {

    }

    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] f = new int[m][n];

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int xij = nums1[i] * nums2[j];
                f[i][j] = xij;
                if (i > 0) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j]);
                }
                if (j > 0) {
                    f[i][j] = Math.max(f[i][j], f[i][j - 1]);
                }
                if (i > 0 && j > 0) {
                    f[i][j] = Math.max(f[i][j], f[i - 1][j - 1] + xij);
                }
            }
        }

        return f[m - 1][n - 1];
    }
}
