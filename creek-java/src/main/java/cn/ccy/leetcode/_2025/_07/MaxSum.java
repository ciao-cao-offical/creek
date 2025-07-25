package cn.ccy.leetcode._2025._07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-unique-subarray-sum-after-deletion/?envType=daily-question&envId=2025-07-25">3487. 删除后的最大子数组元素和</a>
 * @since 2025/7/25 22:41
 */
public class MaxSum {
    public static void main(String[] args) {

    }

    public int maxSum(int[] nums) {
        Set<Integer> positiveNumsSet = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                positiveNumsSet.add(num);
            }
        }
        if (positiveNumsSet.isEmpty()) {
            return Arrays.stream(nums).max().getAsInt();
        }
        return positiveNumsSet.stream().mapToInt(Integer::intValue).sum();
    }
}
