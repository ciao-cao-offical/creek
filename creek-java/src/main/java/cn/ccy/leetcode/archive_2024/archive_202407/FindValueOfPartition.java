package cn.ccy.leetcode.archive_2024.archive_202407;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/26 22:19:55
 * @description https://leetcode.cn/problems/find-the-value-of-the-partition/?envType=daily-question&envId=2024-07-26
 */
public class FindValueOfPartition {
    public static void main(String[] args) {

    }

    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            res = Math.min(res, nums[i] - nums[i - 1]);
        }
        return res;
    }
}
