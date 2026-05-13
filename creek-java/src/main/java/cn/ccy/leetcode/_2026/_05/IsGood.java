package cn.ccy.leetcode._2026._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-array-is-good/?envType=daily-question&envId=2026-05-14">2784. 检查数组是否是好的</a>
 * @since 2026/5/14 00:04
 */
public class IsGood {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 3, 2};
        System.out.println(new IsGood().isGood(nums));
    }

    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }
        return nums[n] == n;
    }
}
