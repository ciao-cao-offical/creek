package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/31
 * @description https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(new NumberOfSteps().numberOfSteps(8));
    }

    public int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            step++;
            if (num % 2 != 0) {
                num = num - 1;

            } else {
                num >>= 1;
            }
        }

        return step;
    }
}
