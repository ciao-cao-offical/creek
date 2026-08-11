package cn.ccy.leetcode._2026._08;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/length-of-longest-subarray-with-at-most-k-frequency/?envType=daily-question&envId=2026-08-12">2958. 最多 K 个重复元素的最长子数组</a>
 * @since 2026/8/12 00:11
 */
public class MaxSubarrayLength {
    public static void main(String[] args) {

    }

    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> occ = new HashMap<>();
        int right = -1;
        int ans = 0;

        for (int left = 0; left < n; left++) {
            if (left > 0) {
                int prevNum = nums[left - 1];
                occ.put(prevNum, occ.get(prevNum) - 1);
                if (occ.get(prevNum) == 0) {
                    occ.remove(prevNum);
                }
            }

            while (right + 1 < n && occ.getOrDefault(nums[right + 1], 0) < k) {
                right++;
                occ.put(nums[right], occ.getOrDefault(nums[right], 0) + 1);
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
