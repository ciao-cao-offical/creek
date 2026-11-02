package cn.ccy.leetcode._2026._10;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-moves-to-equal-array-elements-ii/?envType=daily-question&envId=2026-11-02">462. 最小操作次数使数组元素相等 II</a>
 * @since 2026/11/2 19:32
 */
public class MinMoves2 {
    public static void main(String[] args) {

    }

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, ret = 0, x = nums[n / 2];
        for (int i = 0; i < n; i++) {
            ret += Math.abs(nums[i] - x);
        }
        return ret;
    }
}
