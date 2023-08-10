package cn.ccy.leetcode.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/22
 * @description https://leetcode-cn.com/problems/rotate-function/
 */
public class MaxRotateFunction {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 6};
        System.out.println(new MaxRotateFunction().maxRotateFunction(nums));
    }

    //迭代 + 找规律（动态规划）
    public int maxRotateFunction(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 0;
        }

        int sum = Arrays.stream(nums).sum();
        int stepSum = 0;
        for (int i = 0; i < len; i++) {
            stepSum += i * nums[i];
        }

        int max = stepSum;
        for (int i = 1; i < len; i++) {
            stepSum = stepSum + sum - len * nums[len - i];
            max = Math.max(max, stepSum);
        }
        return max;
    }
}
