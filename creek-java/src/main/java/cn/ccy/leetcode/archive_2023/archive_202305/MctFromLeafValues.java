package cn.ccy.leetcode.archive_2023.archive_202305;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/31 0031 01:24:42
 * @description https://leetcode.cn/problems/minimum-cost-tree-from-leaf-values/
 * cvd，今天20:00是京东双十一开门红，要加班到凌晨了，提前提交一下，以防忘记！！！
 */
public class MctFromLeafValues {
    public static void main(String[] args) {

    }

    public int mctFromLeafValues(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 4);
        }
        int[][] mval = new int[n][n];
        for (int j = 0; j < n; j++) {
            mval[j][j] = arr[j];
            dp[j][j] = 0;
            for (int i = j - 1; i >= 0; i--) {
                mval[i][j] = Math.max(arr[i], mval[i + 1][j]);
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + mval[i][k] * mval[k + 1][j]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
