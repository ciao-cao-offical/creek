package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.LinkedList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/13
 * @description https://leetcode-cn.com/problems/shortest-path-in-binary-matrix/
 */
public class ShortestPathBinaryMatrix {

    private int[][] dirs = new int[][]{{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};

    public static void main(String[] args) {
        int[][] grid = {{0, 1}, {1, 0}};
        System.out.println(new ShortestPathBinaryMatrix().shortestPathBinaryMatrix(grid));
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        if (grid[0][0] == 1) {
            return -1;
        }

        int m = grid.length;
        int n = grid[0].length;
        int path = 1;
        LinkedList<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        grid[0][0] = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] poll = queue.poll();
                if (poll == null) {
                    continue;
                }
                int x = poll[0];
                int y = poll[1];

                if (x == m - 1 && y == n - 1) {
                    return path;
                }

                for (int[] dir : dirs) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];
                    if (nx < 0 || nx > m - 1 || ny < 0 || ny > n - 1 || grid[nx][ny] == 1) {
                        continue;
                    }
                    queue.offer(new int[]{nx, ny});
                    grid[nx][ny] = 1;
                }
            }
            path++;
        }
        return -1;
    }
}
