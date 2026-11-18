package cn.ccy.leetcode._2026._11;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-score-by-changing-two-elements/?envType=daily-question&envId=2026-11-19">2567. 修改两个元素的最小分数</a>
 * @since 2026/11/19 00:52
 */
public class MinimizeSum {
    public static void main(String[] args) {

    }

    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.min(Math.min(nums[n - 3] - nums[0], nums[n - 2] - nums[1]), nums[n - 1] - nums[2]);
    }
}
