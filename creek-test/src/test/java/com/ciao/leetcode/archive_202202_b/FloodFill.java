package com.ciao.leetcode.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/23
 * @description https://leetcode-cn.com/problems/flood-fill/
 */
public class FloodFill {
    private static final int[] dx = new int[]{1, 0, -1, 0};
    private static final int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        int[][] image = new int[][]{new int[]{1, 1, 1}, new int[]{1, 1, 0}, new int[]{1, 0, 1}};
        int[][] ints = new FloodFill().floodFill(image, 1, 1, 2);
        System.out.println(Arrays.deepToString(ints));
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int current = image[sr][sc];
        if (current == newColor) {
            return image;
        }
        dfs(image, sr, sc, current, newColor);
        return image;
    }

    //深度优先
    private void dfs(int[][] image, int x, int y, int current, int newColor) {
        if (image[x][y] != current) {
            return;
        }

        image[x][y] = newColor;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < image.length && ny >= 0 && ny < image[0].length) {
                dfs(image, nx, ny, current, newColor);
            }
        }
    }
}
