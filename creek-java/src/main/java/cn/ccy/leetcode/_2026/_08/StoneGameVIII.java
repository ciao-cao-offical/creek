package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/stone-game-viii/?envType=daily-question&envId=2026-08-24">1872. 石子游戏 VIII</a>
 * @since 2026/8/24 00:04
 */
public class StoneGameVIII {
    public static void main(String[] args) {

    }

    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int[] pre = new int[n];
        pre[0] = stones[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + stones[i];
        }

        int[] f = new int[n];
        f[n - 1] = pre[n - 1];
        for (int i = n - 2; i >= 1; i--) {
            f[i] = Math.max(f[i + 1], pre[i] - f[i + 1]);
        }
        return f[1];
    }
}
