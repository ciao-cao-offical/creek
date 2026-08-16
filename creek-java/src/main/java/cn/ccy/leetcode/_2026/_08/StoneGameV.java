package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/stone-game-v/?envType=daily-question&envId=2026-08-17">1563. 石子游戏 V</a>
 * @since 2026/8/17 00:53
 */
public class StoneGameV {
    public static void main(String[] args) {

    }

    int[][] f;

    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        f = new int[n][n];
        return dfs(stoneValue, 0, n - 1);
    }

    public int dfs(int[] stoneValue, int left, int right) {
        if (left == right) {
            return 0;
        }
        if (f[left][right] != 0) {
            return f[left][right];
        }

        int sum = 0;
        for (int i = left; i <= right; ++i) {
            sum += stoneValue[i];
        }
        int suml = 0;
        for (int i = left; i < right; ++i) {
            suml += stoneValue[i];
            int sumr = sum - suml;
            if (suml < sumr) {
                f[left][right] = Math.max(f[left][right], dfs(stoneValue, left, i) + suml);
            } else if (suml > sumr) {
                f[left][right] = Math.max(f[left][right], dfs(stoneValue, i + 1, right) + sumr);
            } else {
                f[left][right] = Math.max(f[left][right], Math.max(dfs(stoneValue, left, i), dfs(stoneValue, i + 1, right)) + suml);
            }
        }
        return f[left][right];
    }
}
