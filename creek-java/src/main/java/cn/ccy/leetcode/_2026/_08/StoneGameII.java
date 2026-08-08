package cn.ccy.leetcode._2026._08;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/stone-game-ii/?envType=daily-question&envId=2026-08-09">1140. 石子游戏 II</a>
 * @since 2026/8/9 01:52
 */
public class StoneGameII {
    public static void main(String[] args) {

    }

    public int stoneGameII(int[] piles) {
        int[] prefixSum = new int[piles.length + 1];
        for (int i = 0; i < piles.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + piles[i];
        }

        Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
        return (prefixSum[piles.length] + dp(memo, piles, prefixSum, 0, 1)) / 2;
    }

    public int dp(Map<Integer, Integer> memo, int[] piles, int[] prefixSum, int i, int m) {
        if (i == piles.length) {
            return 0;
        }
        int key = i * 201 + m;
        if (!memo.containsKey(key)) {
            int maxVal = Integer.MIN_VALUE;
            for (int x = 1; x <= 2 * m; x++) {
                if (i + x > piles.length) {
                    break;
                }
                maxVal = Math.max(maxVal, prefixSum[i + x] - prefixSum[i] - dp(memo, piles, prefixSum, i + x, Math.max(m, x)));
            }
            memo.put(key, maxVal);
        }
        return memo.get(key);
    }
}
