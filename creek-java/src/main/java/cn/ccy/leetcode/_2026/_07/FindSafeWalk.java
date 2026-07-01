package cn.ccy.leetcode._2026._07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-a-safe-walk-through-a-grid/?envType=daily-question&envId=2026-07-02">3286. 穿越网格图的安全路径</a>
 * @since 2026/7/2 01:26
 */
public class FindSafeWalk {
    public static void main(String[] args) {

    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size(), n = grid.get(0).size();
        int[][] dis = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dis[i], -1);
        }
        int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{grid.get(0).get(0), 0, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int val = cur[0], cx = cur[1], cy = cur[2];
            if (dis[cx][cy] >= 0) {
                continue;
            }
            dis[cx][cy] = val;
            for (int[] d : dirs) {
                int nx = cx + d[0], ny = cy + d[1];
                if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
                    continue;
                }
                if (dis[nx][ny] >= 0) {
                    continue;
                }
                pq.offer(new int[]{val + grid.get(nx).get(ny), nx, ny});
            }
        }

        return dis[m - 1][n - 1] < health;
    }
}
