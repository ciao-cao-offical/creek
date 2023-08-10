package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/1
 * @description https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        int len = nums.length;
        sums = new int[len + 1];
        for (int i = 0; i < len; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public static void main(String[] args) {

    }

    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }
}
