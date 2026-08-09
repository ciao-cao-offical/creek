package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/stone-game-iv/?envType=daily-question&envId=2026-08-10">1510. 石子游戏 IV</a>
 * @since 2026/8/10 00:35
 * ★★★★★2026cvd
 *
 */
public class WinnerSquareGame {
    public static void main(String[] args) {

    }

    public boolean winnerSquareGame(int n) {
        boolean[] f = new boolean[n + 1];
        for (int i = 1; i <= n; ++i) {
            for (int k = 1; k * k <= i; ++k) {
                if (!f[i - k * k]) {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[n];
    }
}
