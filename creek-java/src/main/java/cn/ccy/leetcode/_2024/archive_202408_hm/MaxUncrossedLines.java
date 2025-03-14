package cn.ccy.leetcode._2024.archive_202408_hm;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/11 00:48
 * @description https://leetcode.cn/problems/uncrossed-lines/?envType=daily-question&envId=2024-08-11
 */
public class MaxUncrossedLines {
    public static void main(String[] args) {

    }

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int num1 = nums1[i - 1];
            for (int j = 1; j <= n; j++) {
                int num2 = nums2[j - 1];
                if (num1 == num2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
