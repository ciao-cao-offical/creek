package cn.ccy.leetcode._2025._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/longest-subarray-with-maximum-bitwise-and/?envType=daily-question&envId=2025-07-30">2419. 按位与最大的最长子数组</a>
 * @since 2025/7/30 22:44
 */
public class LongestSubarray {
    public static void main(String[] args) {

    }

    public int longestSubarray(int[] nums) {
        int maxValue = nums[0];
        int ans = 1, cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                ans = cnt = 1;
                maxValue = nums[i];
            } else if (nums[i] < maxValue) {
                cnt = 0;
            } else if (nums[i] == maxValue) {
                cnt++;
            }
            ans = Math.max(cnt, ans);
        }
        return ans;
    }
}
