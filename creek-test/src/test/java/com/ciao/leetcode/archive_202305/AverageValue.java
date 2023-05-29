package com.ciao.leetcode.archive_202305;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/29 18:39
 * @description https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/
 */
public class AverageValue {
    public static void main(String[] args) {

    }

    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
                count++;
            }
        }

        return count == 0 ? 0 : sum / count;
    }
}
