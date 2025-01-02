package cn.ccy.leetcode._2023.archive_202302;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/24 0024 22:24:05
 * @description https://leetcode.cn/problems/make-array-zero-by-subtracting-equal-amounts/
 */
public class MinimumOperations {
    public static void main(String[] args) {
        int[] nums = {1, 5, 0, 3, 5};
        System.out.println(new MinimumOperations().minimumOperations(nums));
    }

    //【排序+模拟】，官解里面的【哈希集合】很不错
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 0) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                nums[j] -= num;
            }

            step++;

        }
        return step;
    }
}
