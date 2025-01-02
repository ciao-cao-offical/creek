package cn.ccy.leetcode._2024.archive_202405;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/12 21:01:59
 * @description https://leetcode.cn/problems/minimum-number-of-days-to-eat-n-oranges/?envType=daily-question&envId=2024-05-12
 * ☆☆☆☆☆ 2024cvd
 */
public class MinDays {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int minDays(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, Math.min(n % 2 + 1 + minDays(n / 2), n % 3 + 1 + minDays(n / 3)));
        return memo.get(n);
    }
}
