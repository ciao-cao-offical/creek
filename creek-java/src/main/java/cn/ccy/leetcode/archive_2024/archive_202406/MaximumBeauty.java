package cn.ccy.leetcode.archive_2024.archive_202406;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/15 14:22:30
 * @description https://leetcode.cn/problems/maximum-beauty-of-an-array-after-applying-operation/?envType=daily-question&envId=2024-06-15
 */
public class MaximumBeauty {
    public static void main(String[] args) {

    }

    public int maximumBeauty(int[] nums, int k) {
        int res = 0, n = nums.length;
        Arrays.sort(nums);
        for (int i = 0, j = 0; i < n; i++) {
            while (nums[i] - 2 * k > nums[j]) {
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}
