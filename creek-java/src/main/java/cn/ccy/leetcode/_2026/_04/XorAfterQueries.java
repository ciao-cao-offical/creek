package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/xor-after-range-multiplication-queries-i/description/?envType=daily-question&envId=2026-04-08">3653. 区间乘法查询后的异或 I</a>
 * @since 2026/4/8 01:07
 */
public class XorAfterQueries {
    public static void main(String[] args) {

    }

    private static final int MOD = 1_000_000_007;

    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2], v = q[3];
            for (int i = l; i <= r; i += k) {
                nums[i] = (int) ((long) nums[i] * v % MOD);
            }
        }
        int res = 0;
        for (int x : nums) {
            res ^= x;
        }
        return res;
    }
}
