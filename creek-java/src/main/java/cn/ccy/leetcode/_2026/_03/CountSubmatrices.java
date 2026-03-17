package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/?envType=daily-question&envId=2026-03-18">3070. 元素和小于等于 k 的子矩阵的数目</a>
 * @since 2026/3/18 00:41
 */
public class CountSubmatrices {
    public static void main(String[] args) {

    }

    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int[] cols = new int[m];
        int res = 0;

        for (int i = 0; i < n; i++) {
            int rows = 0;
            for (int j = 0; j < m; j++) {
                cols[j] += grid[i][j];
                rows += cols[j];
                if (rows <= k) {
                    res++;
                }
            }
        }

        return res;
    }
}
