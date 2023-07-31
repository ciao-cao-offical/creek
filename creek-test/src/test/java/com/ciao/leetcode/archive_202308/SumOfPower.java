package com.ciao.leetcode.archive_202308;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/1 0001 00:19:12
 * @description https://leetcode.cn/problems/power-of-heroes/
 * ☆☆☆☆☆ cvd
 */
public class SumOfPower {
    public static void main(String[] args) {

    }

    // 动态规划 + 前缀和：https://leetcode.cn/problems/power-of-heroes/solutions/2359660/ying-xiong-de-li-liang-by-leetcode-solut-9k1g/
    public int sumOfPower(int[] nums) {
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] preSum = new int[nums.length + 1];
        int res = 0, mod = 1000000007;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = (nums[i] + preSum[i]) % mod;
            preSum[i + 1] = (preSum[i] + dp[i]) % mod;
            res = (int) ((res + (long) nums[i] * nums[i] % mod * dp[i]) % mod);
            if (res < 0) {
                res += mod;
            }
        }
        return res;
    }
}
