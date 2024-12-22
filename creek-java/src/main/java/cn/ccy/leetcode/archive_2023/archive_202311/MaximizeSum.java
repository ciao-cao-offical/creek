package cn.ccy.leetcode.archive_2023.archive_202311;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/15 0015 00:13:56
 * @description https://leetcode.cn/problems/maximum-sum-with-exactly-k-elements/?envType=daily-question&envId=2023-11-15
 */
public class MaximizeSum {
    public static void main(String[] args) {

    }

    // 数学
    public int maximizeSum(int[] nums, int k) {
        int m = Arrays.stream(nums).max().getAsInt();
        return (2 * m + k - 1) * k / 2;
    }


    /*public int maximizeSum(int[] nums, int k) {
        int max = -1;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int sum = max;
        for (int i = 1; i < k; i++) {
            sum += ++max;
        }

        return sum;
    }*/
}
