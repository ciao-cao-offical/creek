package cn.ccy.leetcode._2025._07;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-erasure-value/?envType=daily-question&envId=2025-07-22">1695. 删除子数组的最大得分</a>
 * @since 2025/7/22 23:25
 */
public class MaximumUniqueSubarray {
    public static void main(String[] args) {

    }

    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int[] psum = new int[n + 1];
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int ans = 0, pre = 0;
        for (int i = 0; i < n; ++i) {
            psum[i + 1] = psum[i] + nums[i];
            pre = Math.max(pre, cnt.getOrDefault(nums[i], 0));
            ans = Math.max(ans, psum[i + 1] - psum[pre]);
            cnt.put(nums[i], i + 1);
        }
        return ans;
    }
}
