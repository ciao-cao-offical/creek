package cn.ccy.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/11 0011
 * @description https://leetcode.cn/problems/minimum-operations-to-make-the-array-increasing/
 */
public class MinOperations3 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 4, 1};
        System.out.println(new MinOperations3().minOperations(nums));
    }

    public int minOperations(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }
        int count = 0;
        int pre = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] <= pre) {
                int gap = pre + 1 - nums[i];
                nums[i] += gap;
                pre = nums[i];
                count += gap;
                
            } else {
                pre = nums[i];
            }
        }
        return count;
    }
}
