package cn.ccy.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/30 0030
 * @description https://leetcode-cn.com/problems/smallest-range-i/
 */
public class SmallestRangeI {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6};
        int k = 3;
        System.out.println(new SmallestRangeI().smallestRangeI(nums, k));
    }

    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        return max - min <= 2 * k ? 0 : max - min - 2 * k;
    }
}
