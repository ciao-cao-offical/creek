package cn.ccy.leetcode.archive_202408_hm;

import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/15 01:11
 * @description https://leetcode.cn/problems/maximum-difference-score-in-a-grid/?envType=daily-question&envId=2024-08-15
 */
public class MaxScore {
    public static void main(String[] args) {

    }

    public int maxScore(List<List<Integer>> grid) {
        int m = grid.size(), n = grid.get(0).size();
        int[][] prerow = new int[m][n];
        int[][] precol = new int[m][n];
        int[][] f = new int[m][n];
        for (int i = 0; i < m; ++i) {
            Arrays.fill(f[i], Integer.MIN_VALUE);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i > 0) {
                    f[i][j] = Math.max(f[i][j], grid.get(i).get(j) + precol[i - 1][j]);
                }
                if (j > 0) {
                    f[i][j] = Math.max(f[i][j], grid.get(i).get(j) + prerow[i][j - 1]);
                }
                ans = Math.max(ans, f[i][j]);
                prerow[i][j] = precol[i][j] = Math.max(f[i][j], 0) - grid.get(i).get(j);
                if (i > 0) {
                    precol[i][j] = Math.max(precol[i][j], precol[i - 1][j]);
                }
                if (j > 0) {
                    prerow[i][j] = Math.max(prerow[i][j], prerow[i][j - 1]);
                }
            }
        }
        return ans;
    }
}
