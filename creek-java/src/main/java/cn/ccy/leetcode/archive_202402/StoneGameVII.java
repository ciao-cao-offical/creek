package cn.ccy.leetcode.archive_202402;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/2/3 0003 14:29:02
 * @description https://leetcode.cn/problems/stone-game-vii/?envType=daily-question&envId=2024-02-03
 */
public class StoneGameVII {
    public static void main(String[] args) {

    }

    public int stoneGameVII(int[] stones) {
        int n = stones.length;
        int[] sum = new int[n + 1];
        int[][] memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + stones[i];
        }
        return dfs(0, n - 1, sum, memo);
    }

    public int dfs(int i, int j, int[] sum, int[][] memo) {
        if (i >= j) {
            return 0;
        }
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        int res = Math.max(sum[j + 1] - sum[i + 1] - dfs(i + 1, j, sum, memo), sum[j] - sum[i] - dfs(i, j - 1, sum, memo));
        memo[i][j] = res;
        return res;
    }
}
