package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/stone-game-iii/description/?envType=daily-question&envId=2026-08-03">1406. 石子游戏 III</a>
 * @since 2026/8/3 23:19
 * ★★★★★ 2026cvd
 */
public class StoneGameIII {
    public static void main(String[] args) {

    }

    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = stoneValue[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            suffixSum[i] = suffixSum[i + 1] + stoneValue[i];
        }
        int[] f = new int[n + 1];
        // 边界情况，当没有石子时，分数为 0
        // 为了代码的可读性，显式声明
        f[n] = 0;
        for (int i = n - 1; i >= 0; --i) {
            int bestj = f[i + 1];
            for (int j = i + 2; j <= i + 3 && j <= n; ++j) {
                bestj = Math.min(bestj, f[j]);
            }
            f[i] = suffixSum[i] - bestj;
        }
        int total = 0;
        for (int value : stoneValue) {
            total += value;
        }
        if (f[0] * 2 == total) {
            return "Tie";
        } else {
            return f[0] * 2 > total ? "Alice" : "Bob";
        }
    }
}
