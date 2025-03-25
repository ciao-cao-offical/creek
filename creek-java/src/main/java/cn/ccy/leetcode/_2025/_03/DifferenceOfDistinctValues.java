package cn.ccy.leetcode._2025._03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/difference-of-number-of-distinct-values-on-diagonals/?envType=daily-question&envId=2025-03-25">2711. 对角线上不同值的数量差</a>
 * @since 2025/3/25 22:38
 */
public class DifferenceOfDistinctValues {
    public static void main(String[] args) {

    }

    public int[][] differenceOfDistinctValues(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                Set<Integer> s1 = new HashSet<>();
                int x = i + 1, y = j + 1;
                while (x < m && y < n) {
                    s1.add(grid[x][y]);
                    x += 1;
                    y += 1;
                }
                Set<Integer> s2 = new HashSet<>();
                x = i - 1;
                y = j - 1;
                while (x >= 0 && y >= 0) {
                    s2.add(grid[x][y]);
                    x -= 1;
                    y -= 1;
                }
                res[i][j] = Math.abs(s1.size() - s2.size());
            }
        }
        return res;
    }
}
