package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/4
 * @description https://leetcode-cn.com/problems/sum-of-subarray-ranges/
 * ☆☆ 最好再试一下时间复杂度为O(n)的【单调栈】方式
 */
public class SubArrayRanges {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new SubArrayRanges().subArrayRanges(nums));
    }

    public long subArrayRanges(int[] nums) {
        int len = nums.length;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < len; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                sum += max - min;
            }
        }
        return sum;
    }
}
