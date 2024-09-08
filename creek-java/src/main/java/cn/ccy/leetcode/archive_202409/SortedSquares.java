package cn.ccy.leetcode.archive_202409;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/8 21:56:22
 * @description https://leetcode.cn/problems/squares-of-a-sorted-array/?envType=daily-question&envId=2024-09-08
 */
public class SortedSquares {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            ans[i] = nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
