package cn.ccy.leetcode.archive_2023.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/8 0008 23:03:37
 * @description https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/
 * yyds，有时间学习一下剩下的三种空间优化方法，(๑•̀ㅂ•́)و✧：https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/solutions/2153802/jiao-ni-yi-bu-bu-si-kao-dpcong-hui-su-da-epvl/
 */
public class MaxValue {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(new MaxValue().maxValue(grid));
    }

    //方法二 递归+记忆化搜索->递推
    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] f = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                f[i + 1][j + 1] = Math.max(f[i + 1][j], f[i][j + 1]) + grid[i][j];
            }
        }

        return f[m][n];
    }

    /*//方法一 递归+记忆化搜索

    int[][] grid;
    int[][] memo;

    public int maxValue(int[][] grid) {
        this.grid = grid;
        int n = grid.length;
        int m = grid[0].length;
        memo = new int[n][m];
        return dfs(n - 1, m - 1);
    }

    private int dfs(int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        }
        if (memo[x][y] > 0) {
            return memo[x][y];
        }

        return memo[x][y] = Math.max(dfs(x - 1, y), dfs(x, y - 1)) + grid[x][y];
    }*/

}
