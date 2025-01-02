package cn.ccy.leetcode._2024.archive_202403;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/23 0023 14:15:38
 * @description https://leetcode.cn/problems/count-distinct-numbers-on-board/?envType=daily-question&envId=2024-03-23
 */
public class DistinctIntegers {
    public static void main(String[] args) {

    }

    public int distinctIntegers(int n) {
        int[] nums = new int[n + 1];
        nums[n] = 1;
        for (int k = 0; k < n; k++) {
            for (int x = 1; x <= n; x++) {
                if (nums[x] == 0) {
                    continue;
                }
                for (int i = 1; i <= n; i++) {
                    if (x % i == 1) {
                        nums[i] = 1;
                    }
                }
            }
        }
        return Arrays.stream(nums).sum();
    }
}
