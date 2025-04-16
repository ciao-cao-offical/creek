package cn.ccy.leetcode._2025._04;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-good-subarrays/?envType=daily-question&envId=2025-04-16">2537. 统计好子数组的数目</a>
 * @since 2025/4/16 22:37
 * ☆☆☆ 2025cvd
 */
public class CountGood {
    public static void main(String[] args) {

    }

    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int same = 0, right = -1;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        long ans = 0;
        for (int left = 0; left < n; ++left) {
            while (same < k && right + 1 < n) {
                ++right;
                same += cnt.getOrDefault(nums[right], 0);
                cnt.put(nums[right], cnt.getOrDefault(nums[right], 0) + 1);
            }
            if (same >= k) {
                ans += n - right;
            }
            cnt.put(nums[left], cnt.get(nums[left]) - 1);
            same -= cnt.get(nums[left]);
        }
        return ans;
    }
}
