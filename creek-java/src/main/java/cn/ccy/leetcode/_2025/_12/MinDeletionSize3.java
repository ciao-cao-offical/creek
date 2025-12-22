package cn.ccy.leetcode._2025._12;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/delete-columns-to-make-sorted-iii/?envType=daily-question&envId=2025-12-22">960. 删列造序 III</a>
 * @since 2025/12/22 23:01
 * ☆☆☆☆☆ 2025cvd
 */
public class MinDeletionSize3 {
    public static void main(String[] args) {

    }

    public int minDeletionSize(String[] A) {
        int W = A[0].length();
        int[] dp = new int[W];
        Arrays.fill(dp, 1);
        for (int i = W - 2; i >= 0; --i)
            search:for (int j = i + 1; j < W; ++j) {
                for (String row : A) {
                    if (row.charAt(i) > row.charAt(j)) {
                        continue search;
                    }
                }
                dp[i] = Math.max(dp[i], 1 + dp[j]);
            }

        int kept = 0;
        for (int x : dp) {
            kept = Math.max(kept, x);
        }
        return W - kept;
    }
}
