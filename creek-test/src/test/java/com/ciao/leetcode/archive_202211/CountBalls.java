package com.ciao.leetcode.archive_202211;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/23 0023
 * @description https://leetcode.cn/problems/maximum-number-of-balls-in-a-box/
 */
public class CountBalls {
    public static void main(String[] args) {
        System.out.println(new CountBalls().countBalls(1, 10));
    }

    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            int num = map.getOrDefault(sum, 0) + 1;
            max = Math.max(max, num);
            map.put(sum, num);
        }
        return max;
    }
}
