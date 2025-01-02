package cn.ccy.leetcode._2023.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/4 0004 22:43:14
 * @description https://leetcode.cn/problems/minimum-cost-to-merge-stones/solutions/
 * ☆☆☆☆☆ cvd，这道题，好难啊，cv from https://leetcode.cn/problems/minimum-cost-to-merge-stones/solutions/2207235/tu-jie-qu-jian-dpzhuang-tai-she-ji-yu-yo-ppv0/
 */
public class MergeStones {
    public static void main(String[] args) {

    }

    //
    public int mergeStones(int[] stones, int k) {
        int n = stones.length;
        if ((n - 1) % (k - 1) > 0) // 无法合并成一堆
            return -1;

        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++)
            s[i + 1] = s[i] + stones[i]; // 前缀和

        int[][] f = new int[n][n];
        for (int i = n - 1; i >= 0; --i)
            for (int j = i + 1; j < n; ++j) {
                f[i][j] = Integer.MAX_VALUE;
                for (int m = i; m < j; m += k - 1)
                    f[i][j] = Math.min(f[i][j], f[i][m] + f[m + 1][j]);
                if ((j - i) % (k - 1) == 0) // 可以合并成一堆
                    f[i][j] += s[j + 1] - s[i];
            }
        return f[0][n - 1];
    }
}
