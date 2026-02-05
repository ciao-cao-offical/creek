package cn.ccy.leetcode._2026._02;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-removals-to-balance-array/?envType=daily-question&envId=2026-02-06">3634. 使数组平衡的最少移除数目</a>
 * @since 2026/2/6 00:18
 */
public class MinRemoval {
    public static void main(String[] args) {

    }

    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int ans = n;
        int right = 0;

        for (int left = 0; left < n; left++) {
            while (right < n && nums[right] <= (long) nums[left] * k) {
                right++;
            }
            ans = Math.min(ans, n - (right - left));
        }

        return ans;
    }
}
