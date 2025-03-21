package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-or/?envType=daily-question&envId=2025-03-21">2680. 最大或值</a>
 * @since 2025/3/21 22:52
 */
public class MaximumOr {
    public static void main(String[] args) {

    }

    public long maximumOr(int[] nums, int k) {
        int n = nums.length;
        long[] suf = new long[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suf[i] = suf[i + 1] | nums[i];
        }
        long res = 0, pre = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, pre | ((long) nums[i] << k) | suf[i + 1]);
            pre |= nums[i];
        }
        return res;
    }
}
