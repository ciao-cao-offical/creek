package cn.ccy.leetcode._2026._10;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/apply-operations-on-array-to-maximize-sum-of-squares/?envType=daily-question&envId=2026-10-12">2897. 对数组执行操作使平方和最大</a>
 * @since 2026/10/12 00:49
 * ★★★★★ 2026cvd
 */
public class MaxSum {
    public static void main(String[] args) {

    }

    public int maxSum(List<Integer> nums, int k) {
        final int MOD = 1000000007;
        int[] cnt = new int[30];

        // 统计每个位上 1 的数量
        for (int num : nums) {
            for (int i = 0; i < 30; i++) {
                if ((num & (1 << i)) != 0) {
                    cnt[i]++;
                }
            }
        }

        long res = 0;
        for (int i = 0; i < k; i++) {
            long cur = 0;
            // 从高位到低位构造当前数字
            for (int j = 29; j >= 0; j--) {
                if (cnt[j] > 0) {
                    cur |= (1L << j);
                    cnt[j]--;
                }
            }
            res = (res + cur * cur) % MOD;
        }

        return (int) res;
    }
}
