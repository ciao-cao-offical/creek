package cn.ccy.leetcode._2026._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-moves-to-equal-array-elements-iii/?envType=daily-question&envId=2026-11-03">3736. 最小操作次数使数组元素相等 III</a>
 * @since 2026/11/3 00:16
 */
public class MinMoves3 {
    public static void main(String[] args) {

    }

    public int minMoves(int[] nums) {
        int mx = nums[0];
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        int ans = 0;
        for (int x : nums) {
            ans += mx - x;
        }
        return ans;
    }
}
