package cn.ccy.leetcode._2025._02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/13 22:44
 * @description/link https://leetcode.cn/problems/maximum-number-of-balls-in-a-box/?envType=daily-question&envId=2025-02-13
 */
public class CountBalls {
    public static void main(String[] args) {

    }

    public int countBalls(int lowLimit, int highLimit) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0, x = i;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
            max = Math.max(max, map.get(sum));
        }

        return max;
    }
}
