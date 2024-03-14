package cn.ccy.leetcode.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/14 0014 22:23:08
 * @description https://leetcode.cn/problems/largest-element-in-an-array-after-merge-operations/?envType=daily-question&envId=2024-03-14
 */
public class MaxArrayValue {
    public static void main(String[] args) {

    }

    public long maxArrayValue(int[] nums) {
        long sum = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sum = nums[i] <= sum ? nums[i] + sum : nums[i];
        }
        return sum;
    }
}
