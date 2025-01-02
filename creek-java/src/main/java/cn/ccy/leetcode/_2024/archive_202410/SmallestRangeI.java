package cn.ccy.leetcode._2024.archive_202410;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/20 19:55:01
 * @description https://leetcode.cn/problems/smallest-range-i/?envType=daily-question&envId=2024-10-20
 */
public class SmallestRangeI {
    public static void main(String[] args) {

    }

    public int smallestRangeI(int[] nums, int k) {
        int minNum = Arrays.stream(nums).min().getAsInt();
        int maxNum = Arrays.stream(nums).max().getAsInt();
        return maxNum - minNum <= 2 * k ? 0 : maxNum - minNum - 2 * k;
    }
}
