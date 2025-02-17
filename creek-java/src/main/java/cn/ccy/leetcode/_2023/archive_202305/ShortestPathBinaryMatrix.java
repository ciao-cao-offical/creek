package cn.ccy.leetcode._2023.archive_202305;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/26 0026 20:24:07
 * @description https://leetcode.cn/problems/shortest-path-in-binary-matrix/
 */
public class ShortestPathBinaryMatrix {
    public static void main(String[] args) {
        int[][] grid = {{0, 1
        }, {1, 0
        }};
        System.out.println(new ShortestPathBinaryMatrix().shortestPathBinaryMatrix(grid));
    }

    //广度优先
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) {
            return -1;
        }
        int n = grid.length;
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        Queue<int[]> queue = new ArrayDeque<int[]>();
        queue.offer(new int[]{0, 0});
        dist[0][0] = 1;
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[0], y = arr[1];
            if (x == n - 1 && y == n - 1) {
                return dist[x][y];
            }
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (x + dx < 0 || x + dx >= n || y + dy < 0 || y + dy >= n) { // 越界
                        continue;
                    }
                    if (grid[x + dx][y + dy] == 1 || dist[x + dx][y + dy] <= dist[x][y] + 1) { // 单元格值不为 0 或已被访问
                        continue;
                    }
                    dist[x + dx][y + dy] = dist[x][y] + 1;
                    queue.offer(new int[]{x + dx, y + dy});
                }
            }
        }
        return -1;
    }
}
