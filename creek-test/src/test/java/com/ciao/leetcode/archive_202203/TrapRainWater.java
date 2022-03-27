package com.ciao.leetcode.archive_202203;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/25 0025
 * @description https://leetcode-cn.com/problems/trapping-rain-water-ii/
 */
public class TrapRainWater {
    public static void main(String[] args) {
        int[][] heightMap = {{1, 4, 3, 1, 3, 2}, {3, 2, 1, 3, 2, 4}, {2, 3, 3, 2, 3, 1}};
        System.out.println(new TrapRainWater().trapRainWater(heightMap));
    }

    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        if (m <= 2 || n <= 2) {
            return 0;
        }
        //小根堆
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        boolean[][] visit = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    pq.offer(new int[]{i * n + j, heightMap[i][j]});
                    visit[i][j] = true;
                }
            }
        }

        int res = 0;
        int[] dirs = {-1, 0, 1, 0, -1};
        while (!pq.isEmpty()) {
            int[] poll = pq.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] / n + dirs[i];
                int ny = poll[0] % n + dirs[i + 1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visit[nx][ny]) {
                    int pollHigh = poll[1];
                    int curHigh = heightMap[nx][ny];
                    if (pollHigh > curHigh) {
                        res += pollHigh - curHigh;
                    }

                    pq.offer(new int[]{nx * n + ny, Math.max(curHigh, pollHigh)});
                    visit[nx][ny] = true;
                }
            }
        }
        return res;
    }
}
