package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/20
 * @description https://leetcode-cn.com/problems/perfect-squares/
 * ☆☆ 试试【数学】
 */
public class NumSquares {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(new NumSquares().numSquares(n));
    }

    //动态规划
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, dp[i - j * j]);
            }

            dp[i] = minn + 1;
        }
        return dp[n];
    }
}
