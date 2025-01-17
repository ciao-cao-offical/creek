package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/17 23:33:01
 * @description https://leetcode.cn/problems/shortest-subarray-with-or-at-least-k-ii/?envType=daily-question&envId=2025-01-17
 */
public class MinimumSubarrayLength2 {
    public static void main(String[] args) {

    }

    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int[] bits = new int[30];
        int res = Integer.MAX_VALUE;
        for (int left = 0, right = 0; right < n; right++) {
            for (int i = 0; i < 30; i++) {
                bits[i] += (nums[right] >> i) & 1;
            }
            while (left <= right && calc(bits) >= k) {
                res = Math.min(res, right - left + 1);
                for (int i = 0; i < 30; i++) {
                    bits[i] -= (nums[left] >> i) & 1;
                }
                left++;
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private int calc(int[] bits) {
        int ans = 0;
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] > 0) {
                ans |= 1 << i;
            }
        }
        return ans;
    }
}
