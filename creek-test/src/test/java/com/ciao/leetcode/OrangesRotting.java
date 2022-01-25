package com.ciao.leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/24
 * @description https://leetcode-cn.com/problems/rotting-oranges/
 * ★★
 */
public class OrangesRotting {
    int[] dr = new int[]{-1, 0, 1, 0};
    int[] dc = new int[]{0, -1, 0, 1};

    public static void main(String[] args) {
        int[][] grid = new int[][]{new int[]{2, 1, 1}, new int[]{1, 1, 0}, new int[]{0, 1, 1}};
        int rotting = new OrangesRotting().orangesRotting(grid);
        System.out.println(rotting);
    }

    public int orangesRotting(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        Queue<Integer> queue = new ArrayDeque<>();
        Map<Integer, Integer> depth = new HashMap<>();
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c < C; ++c) {
                if (grid[r][c] == 2) {
                    int code = r * C + c;
                    queue.add(code);
                    depth.put(code, 0);
                }
            }
        }
        int ans = 0;
        while (!queue.isEmpty()) {
            int code = queue.remove();
            int r = code / C, c = code % C;
            for (int k = 0; k < 4; ++k) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    int ncode = nr * C + nc;
                    queue.add(ncode);
                    depth.put(ncode, depth.get(code) + 1);
                    ans = depth.get(ncode);
                }
            }
        }
        for (int[] row : grid) {
            for (int v : row) {
                if (v == 1) {
                    return -1;
                }
            }
        }
        return ans;
    }
}
