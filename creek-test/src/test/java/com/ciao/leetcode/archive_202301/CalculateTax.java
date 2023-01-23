package com.ciao.leetcode.archive_202301;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/23
 * @description https://leetcode.cn/problems/calculate-amount-paid-in-taxes/
 */
public class CalculateTax {
    public static void main(String[] args) {

    }

    public double calculateTax(int[][] brackets, int income) {
        int pre = 0;
        double tex = 0D;
        for (int[] bracket : brackets) {
            if (income <= bracket[0]) {
                tex += (double) (income - pre) * bracket[1] / 100;
                break;

            } else {
                tex += (double) (bracket[0] - pre) * bracket[1] / 100;
                pre = bracket[0];
            }

        }
        return tex;
    }
}
