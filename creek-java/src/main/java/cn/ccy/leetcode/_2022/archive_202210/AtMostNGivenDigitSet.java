package cn.ccy.leetcode._2022.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/18 0018
 * @description https://leetcode.cn/problems/numbers-at-most-n-given-digit-set/
 */
public class AtMostNGivenDigitSet {
    public static void main(String[] args) {

    }

    //【数位动态规划】 cvd，破B工作！ form：https://leetcode.cn/problems/numbers-at-most-n-given-digit-set/
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String s = Integer.toString(n);
        int m = digits.length, k = s.length();
        int[][] dp = new int[k + 1][2];
        dp[0][1] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < m; j++) {
                if (digits[j].charAt(0) == s.charAt(i - 1)) {
                    dp[i][1] = dp[i - 1][1];
                } else if (digits[j].charAt(0) < s.charAt(i - 1)) {
                    dp[i][0] += dp[i - 1][1];
                } else {
                    break;
                }
            }
            if (i > 1) {
                dp[i][0] += m + dp[i - 1][0] * m;
            }
        }
        return dp[k][0] + dp[k][1];
    }
}
