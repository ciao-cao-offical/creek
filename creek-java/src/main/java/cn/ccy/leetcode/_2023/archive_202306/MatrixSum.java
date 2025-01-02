package cn.ccy.leetcode._2023.archive_202306;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/4 0004 23:02:48
 * @description https://leetcode.cn/problems/sum-in-a-matrix/
 */
public class MatrixSum {
    public static void main(String[] args) {
        int[][] ints = new int[1][1];
        ints[0] = new int[]{1};
        System.out.println(new MatrixSum().matrixSum(ints));
    }

    public int matrixSum(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        for (int[] num : nums) {
            Arrays.sort(num);
        }

        int sum = 0;
        for (int i = m - 1; i >= 0; i--) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                max = Math.max(max, nums[j][i]);
            }
            sum += max;
        }
        return sum;
    }
}
