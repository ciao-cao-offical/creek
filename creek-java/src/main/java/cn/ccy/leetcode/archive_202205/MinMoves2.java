package cn.ccy.leetcode.archive_202205;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/19 0019
 * @description https://leetcode.cn/problems/minimum-moves-to-equal-array-elements-ii/
 * 试试【方法二：快速选择】
 */
public class MinMoves2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new MinMoves2().minMoves2(nums));
    }

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid = nums[n / 2];
        int ans = 0;
        for (int num : nums) {
            ans += Math.abs(num - mid);
        }
        return ans;
    }
}
