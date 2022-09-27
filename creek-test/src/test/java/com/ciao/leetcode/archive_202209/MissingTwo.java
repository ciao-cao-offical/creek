package com.ciao.leetcode.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/27
 * @description https://leetcode.cn/problems/missing-two-lcci/
 */
public class MissingTwo {
    public static void main(String[] args) {

    }

    public int[] missingTwo(int[] nums) {
        int n = nums.length + 2, cur = n * (1 + n) / 2;
        for (int x : nums) cur -= x;
        int sum = cur, t = cur / 2;
        cur = t * (1 + t) / 2;
        for (int x : nums) {
            if (x <= t) cur -= x;
        }
        return new int[]{cur, sum - cur};
    }
}
