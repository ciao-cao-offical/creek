package cn.ccy.leetcode.archive_2024.archive_202409;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/12 00:14:02
 * @description https://leetcode.cn/problems/find-the-maximum-number-of-marked-indices/?envType=daily-question&envId=2024-09-12
 * ☆☆☆ 2024cvd
 */
public class MaxNumOfMarkedIndices {
    public static void main(String[] args) {

    }

    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, r = n / 2;
        while (l < r) {
            int m = l + r + 1 >> 1;
            if (check(nums, m)) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l * 2;
    }

    public boolean check(int[] nums, int m) {
        int n = nums.length;
        for (int i = 0; i < m; i++) {
            if (nums[i] * 2 > nums[n - m + i]) {
                return false;
            }
        }
        return true;
    }
}
