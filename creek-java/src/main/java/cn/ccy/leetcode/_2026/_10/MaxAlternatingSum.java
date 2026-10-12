package cn.ccy.leetcode._2026._10;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-alternating-sum-of-squares/?envType=daily-question&envId=2026-10-13">3727. 最大交替平方和</a>
 * @since 2026/10/13 00:43
 */
public class MaxAlternatingSum {
    public static void main(String[] args) {

    }

    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);

        long ans = 0;
        for (int i = 0; i < n / 2; i++) {
            ans -= nums[i];
        }
        for (int i = n / 2; i < n; i++) {
            ans += nums[i];
        }
        return ans;
    }
}
