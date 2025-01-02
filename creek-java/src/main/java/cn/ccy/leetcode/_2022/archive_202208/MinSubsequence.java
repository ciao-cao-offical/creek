package cn.ccy.leetcode._2022.archive_202208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/4 0004
 * @description https://leetcode.cn/problems/minimum-subsequence-in-non-increasing-order/
 */
public class MinSubsequence {
    public static void main(String[] args) {

    }

    public List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        Arrays.sort(nums);
        int partSum = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            partSum += nums[i];
            res.add(nums[i]);
            if (partSum > sum - partSum) {
                break;
            }
        }
        return res;
    }
}
