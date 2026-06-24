package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-subarrays-with-majority-element-i/?envType=daily-question&envId=2026-06-25">3737. 统计主要元素子数组数目 I</a>
 * @since 2026/6/25 00:01
 */
public class CountMajoritySubarrays {
    public static void main(String[] args) {

    }

    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            for (int j = i; j < n; ++j) {
                cnt += (nums[j] == target ? 1 : -1);
                if (cnt > 0) {
                    ++ans;
                }
            }
        }
        return ans;
    }
}
