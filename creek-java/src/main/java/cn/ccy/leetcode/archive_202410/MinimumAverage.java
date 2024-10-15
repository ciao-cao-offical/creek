package cn.ccy.leetcode.archive_202410;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/16 00:06:12
 * @description https://leetcode.cn/problems/minimum-average-of-smallest-and-largest-elements/?envType=daily-question&envId=2024-10-16
 */
public class MinimumAverage {
    public static void main(String[] args) {

    }

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double res = Double.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            res = Math.min(res, (nums[i] + nums[n - 1 - i]) / 2.0);
        }
        return res;
    }
}
