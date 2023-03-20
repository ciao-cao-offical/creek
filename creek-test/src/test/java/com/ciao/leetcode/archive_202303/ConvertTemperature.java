package com.ciao.leetcode.archive_202303;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/21 0021 00:21:45
 * @description https://leetcode.cn/problems/convert-the-temperature/
 */
public class ConvertTemperature {
    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println(Arrays.toString(new ConvertTemperature().convertTemperature(celsius)));
    }

    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        //开氏度 = 摄氏度 + 273.15
        //华氏度 = 摄氏度 * 1.80 + 32.00
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;

        return ans;
    }
}
