package com.ciao.leetcode.archive_202301;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/17
 * @description https://leetcode.cn/problems/count-nice-pairs-in-an-array/
 */
public class CountNicePairs {
    public static void main(String[] args) {
        int[] nums = {42, 11, 1, 97};
        System.out.println(new CountNicePairs().countNicePairs(nums));
    }

    public int countNicePairs(int[] nums) {
        final int MOD = 1000000007;
        int res = 0;
        Map<Integer, Integer> h = new HashMap<>();
        for (int i : nums) {
            int temp = i, j = 0;
            while (temp > 0) {
                j = j * 10 + temp % 10;
                temp /= 10;
            }
            res = (res + h.getOrDefault(i - j, 0)) % MOD;
            h.put(i - j, h.getOrDefault(i - j, 0) + 1);
        }
        return res;
    }
}
