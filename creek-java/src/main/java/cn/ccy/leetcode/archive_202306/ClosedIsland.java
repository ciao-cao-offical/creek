package cn.ccy.leetcode.archive_202306;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/18 0018 10:15:51
 * @description https://leetcode.cn/problems/number-of-closed-islands/description/
 */
public class ClosedIsland {
    public static void main(String[] args) {
        int[][] grid = {{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}};
        System.out.println(new ClosedIsland().closedIsland(grid));
    }

    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    // 广度优先 + 染色
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Queue<int[]> qu = new ArrayDeque<int[]>();
                    grid[i][j] = 1;
                    boolean closed = true;

                    qu.offer(new int[]{i, j});
                    while (!qu.isEmpty()) {
                        int[] arr = qu.poll();
                        int cx = arr[0], cy = arr[1];
                        if (cx == 0 || cy == 0 || cx == m - 1 || cy == n - 1) {
                            closed = false;
                        }
                        for (int d = 0; d < 4; d++) {
                            int nx = cx + dir[d][0];
                            int ny = cy + dir[d][1];
                            if (nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == 0) {
                                grid[nx][ny] = 1;
                                qu.offer(new int[]{nx, ny});
                            }
                        }
                    }
                    if (closed) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
