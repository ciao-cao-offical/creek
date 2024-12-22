package cn.ccy.leetcode.archive_2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/18 0018 00:06:14
 * @description https://leetcode.cn/problems/range-sum-query-immutable/?envType=daily-question&envId=2024-03-18
 */
public class NumArray {
    public static void main(String[] args) {

    }

    int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
