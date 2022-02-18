package com.ciao.leetcode;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/18
 * @description https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class Average {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(new Average().average(salary));
    }

    public double average(int[] salary) {
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i : salary) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        return (sum - min - max) / (salary.length - 2);
    }
}
