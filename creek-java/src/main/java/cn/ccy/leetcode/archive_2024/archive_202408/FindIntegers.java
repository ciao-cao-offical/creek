package cn.ccy.leetcode.archive_2024.archive_202408;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/5 23:41:47
 * @description https://leetcode.cn/problems/non-negative-integers-without-consecutive-ones/?envType=daily-question&envId=2024-08-05
 * ☆☆☆☆☆ 2024cvd
 */
public class FindIntegers {
    public static void main(String[] args) {

    }

    public int findIntegers(int n) {
        int[] dp = new int[31];
        dp[0] = dp[1] = 1;
        for (int i = 2; i < 31; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int pre = 0, res = 0;
        for (int i = 29; i >= 0; --i) {
            int val = 1 << i;
            if ((n & val) != 0) {
                res += dp[i + 1];
                if (pre == 1) {
                    break;
                }
                pre = 1;
            } else {
                pre = 0;
            }

            if (i == 0) {
                ++res;
            }
        }

        return res;
    }
}
