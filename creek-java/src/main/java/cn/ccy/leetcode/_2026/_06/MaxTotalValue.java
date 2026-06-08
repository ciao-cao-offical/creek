package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-total-subarray-value-i/?envType=daily-question&envId=2026-06-09">3689. 最大子数组总值 I</a>
 * @since 2026/6/9 00:03
 */
public class MaxTotalValue {
    public static void main(String[] args) {

    }

    public long maxTotalValue(int[] nums, int k) {
        int m1 = Integer.MAX_VALUE, m2 = Integer.MIN_VALUE;
        for (int x : nums) {
            m1 = Math.min(m1, x);
            m2 = Math.max(m2, x);
        }
        return (long) (m2 - m1) * k;
    }
}
