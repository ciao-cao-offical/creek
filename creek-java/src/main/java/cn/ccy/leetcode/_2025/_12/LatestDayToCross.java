package cn.ccy.leetcode._2025._12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/last-day-where-you-can-still-cross/?envType=daily-question&envId=2025-12-31">1970. 你能穿过矩阵的最后一天</a>
 * @since 2026/1/1 23:04
 * ★★★★★ 2025cvd
 */
public class LatestDayToCross {
    public static void main(String[] args) {

    }

    private static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int latestDayToCross(int row, int col, int[][] cells) {
        int left = 0, right = row * col, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            int[][] grid = new int[row][col];
            for (int i = 0; i < row; i++) {
                Arrays.fill(grid[i], 1);
            }
            for (int i = 0; i < mid; i++) {
                grid[cells[i][0] - 1][cells[i][1] - 1] = 0;
            }

            Queue<int[]> q = new LinkedList<>();
            for (int i = 0; i < col; i++) {
                if (grid[0][i] == 1) {
                    q.offer(new int[]{0, i});
                    grid[0][i] = 0;
                }
            }

            boolean found = false;
            while (!q.isEmpty()) {
                int[] cell = q.poll();
                int x = cell[0], y = cell[1];
                for (int[] dir : dirs) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];
                    if (nx >= 0 && nx < row && ny >= 0 && ny < col && grid[nx][ny] == 1) {
                        if (nx == row - 1) {
                            found = true;
                            break;
                        }
                        q.offer(new int[]{nx, ny});
                        grid[nx][ny] = 0;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (found) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
