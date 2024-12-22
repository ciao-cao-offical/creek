package cn.ccy.leetcode.archive_2024.archive_202407;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/8 01:03:27
 * @description https://leetcode.cn/problems/find-pivot-index/?envType=daily-question&envId=2024-07-08
 */
public class PivotIndex {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
