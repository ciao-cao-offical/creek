package cn.ccy.leetcode.archive_2023.archive_202308;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/24 0024 00:08:48
 * @description https://leetcode.cn/problems/count-servers-that-communicate/
 */
public class CountServers {
    public static void main(String[] args) {

    }

    // 官解的执行时间比我的长，但是内存消耗相当，🤔
    public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Map<Integer, Integer> rows = new HashMap<Integer, Integer>();
        Map<Integer, Integer> cols = new HashMap<Integer, Integer>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1) {
                    rows.put(i, rows.getOrDefault(i, 0) + 1);
                    cols.put(j, cols.getOrDefault(j, 0) + 1);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1 && (rows.get(i) > 1 || cols.get(j) > 1)) {
                    ++ans;
                }
            }
        }
        return ans;
    }

    /*int m, n;

    public int countServers(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count += dfs(i, j, grid);
                }
            }
        }

        return count;
    }

    private int dfs(int i, int j, int[][] grid) {
        for (int a = 0; a < n; a++) {
            if (a != j) {
                if (grid[i][a] == 1) {
                    return 1;
                }
            }
        }

        for (int b = 0; b < m; b++) {
            if (b != i) {
                if (grid[b][j] == 1) {
                    return 1;
                }
            }
        }

        return 0;
    }*/
}
