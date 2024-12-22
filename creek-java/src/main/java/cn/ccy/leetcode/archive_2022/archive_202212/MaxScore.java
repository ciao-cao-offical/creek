package cn.ccy.leetcode.archive_2022.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/22 0022 22:30:58
 * @description https://leetcode.cn/problems/maximize-score-after-n-operations/
 * ★★★★★ cvd
 */
public class MaxScore {
    public static void main(String[] args) {

    }

    //【状态压缩 + 动态规划】cvd from：https://leetcode.cn/problems/maximize-score-after-n-operations/solutions/2028201/n-ci-cao-zuo-hou-de-zui-da-fen-shu-he-by-i9k5/
    public int maxScore(int[] nums) {
        int m = nums.length;
        int[] dp = new int[1 << m];
        int[][] gcdTmp = new int[m][m];
        for (int i = 0; i < m; ++i) {
            for (int j = i + 1; j < m; ++j) {
                gcdTmp[i][j] = gcd(nums[i], nums[j]);
            }
        }
        int all = 1 << m;
        for (int s = 1; s < all; ++s) {
            int t = Integer.bitCount(s);
            if ((t & 1) != 0) {
                continue;
            }
            for (int i = 0; i < m; ++i) {
                if (((s >> i) & 1) != 0) {
                    for (int j = i + 1; j < m; ++j) {
                        if (((s >> j) & 1) != 0) {
                            dp[s] = Math.max(dp[s], dp[s ^ (1 << i) ^ (1 << j)] + t / 2 * gcdTmp[i][j]);
                        }
                    }
                }
            }
        }
        return dp[all - 1];
    }

    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }
}
