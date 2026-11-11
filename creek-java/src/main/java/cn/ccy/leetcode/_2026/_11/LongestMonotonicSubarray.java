package cn.ccy.leetcode._2026._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/?envType=daily-question&envId=2026-11-12">3105. 最长的严格递增或递减子数组</a>
 * @since 2026/11/12 00:05
 */
public class LongestMonotonicSubarray {
    public static void main(String[] args) {

    }

    public int longestMonotonicSubarray(int[] nums) {
        int cnt1 = 1, cnt2 = 1;
        int ans = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans = Math.max(ans, cnt1);
                cnt1 = 1;
            } else {
                cnt1++;
            }
            if (nums[i] >= nums[i - 1]) {
                ans = Math.max(ans, cnt2);
                cnt2 = 1;
            } else {
                cnt2++;
            }
        }
        ans = Math.max(ans, Math.max(cnt1, cnt2));
        return ans;
    }
}
