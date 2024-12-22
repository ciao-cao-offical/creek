package cn.ccy.leetcode.archive_2023.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/22 0022 23:08:29
 * @description https://leetcode.cn/problems/stone-game-ii/
 * ★★★★★ cvd
 */
public class StoneGameII {
    public static void main(String[] args) {
        int[] piles = {2, 7, 9, 4, 4};
        System.out.println(new StoneGameII().stoneGameII(piles));
    }

    //【回溯】->【记忆化搜索】->【递推】：https://leetcode.cn/problems/stone-game-ii/solutions/2125753/jiao-ni-yi-bu-bu-si-kao-dong-tai-gui-hua-jjax/
    public int stoneGameII(int[] piles) {
        int s = 0, n = piles.length;
        int[][] f = new int[n][n + 1];
        for (int i = n - 1; i >= 0; --i) {
            s += piles[i];
            for (int m = 1; m <= i / 2 + 1; ++m) {
                if (i + m * 2 >= n) f[i][m] = s;
                else {
                    int mn = Integer.MAX_VALUE;
                    for (int x = 1; x <= m * 2; ++x)
                        mn = Math.min(mn, f[i + x][Math.max(m, x)]);
                    f[i][m] = s - mn;
                }
            }
        }
        return f[0][1];
    }
}
