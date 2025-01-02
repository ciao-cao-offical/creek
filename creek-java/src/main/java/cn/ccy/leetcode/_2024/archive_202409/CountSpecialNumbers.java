package cn.ccy.leetcode._2024.archive_202409;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/20 01:12:26
 * @description https://leetcode.cn/problems/count-special-integers/?envType=daily-question&envId=2024-09-20
 * ☆☆☆☆☆ 2024cvd
 */
public class CountSpecialNumbers {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int countSpecialNumbers(int n) {
        String nStr = String.valueOf(n);
        int res = 0;
        int prod = 9;
        for (int i = 0; i < nStr.length() - 1; i++) {
            res += prod;
            prod *= 9 - i;
        }
        res += dp(0, false, nStr);
        return res;
    }

    public int dp(int mask, boolean prefixSmaller, String nStr) {
        if (Integer.bitCount(mask) == nStr.length()) {
            return 1;
        }
        int key = mask * 2 + (prefixSmaller ? 1 : 0);
        if (!memo.containsKey(key)) {
            int res = 0;
            int lowerBound = mask == 0 ? 1 : 0;
            int upperBound = prefixSmaller ? 9 : nStr.charAt(Integer.bitCount(mask)) - '0';
            for (int i = lowerBound; i <= upperBound; i++) {
                if (((mask >> i) & 1) == 0) {
                    res += dp(mask | (1 << i), prefixSmaller || i < upperBound, nStr);
                }
            }
            memo.put(key, res);
        }
        return memo.get(key);
    }
}
