package cn.ccy.leetcode._2025._12;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-number-of-trapezoids-i/?envType=daily-question&envId=2025-12-02">3623. 统计梯形的数目 I</a>
 * @since 2025/12/2 23:06
 */
public class CountTrapezoids {
    public static void main(String[] args) {

    }

    public int countTrapezoids(int[][] points) {
        Map<Integer, Integer> pointNum = new HashMap<>();
        final int mod = 1000000007;
        long ans = 0, sum = 0;
        for (int[] point : points) {
            pointNum.put(point[1], pointNum.getOrDefault(point[1], 0) + 1);
        }
        for (int pNum : pointNum.values()) {
            long edge = (long) pNum * (pNum - 1) / 2;
            ans = (ans + edge * sum) % mod;
            sum = (sum + edge) % mod;
        }
        return (int) ans;
    }
}
