package cn.ccy.leetcode.archive_202411;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/9 18:54:49
 * @description https://leetcode.cn/problems/design-neighbor-sum-service/?envType=daily-question&envId=2024-11-09
 */
public class NeighborSum {
    public static void main(String[] args) {

    }

    private int[][] grid;
    private Map<Integer, int[]> pos;
    private final int[][][] dirs = {
            {{-1, 0}, {1, 0}, {0, -1}, {0, 1}},
            {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}}
    };

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.pos = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                pos.put(grid[i][j], new int[]{i, j});
            }
        }
    }

    public int adjacentSum(int value) {
        return getSum(value, 0);
    }

    public int diagonalSum(int value) {
        return getSum(value, 1);
    }

    public int getSum(int value, int idx) {
        int[] p = pos.get(value);
        int x = p[0], y = p[1];
        int sum = 0;
        for (int[] dir : dirs[idx]) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length) {
                sum += grid[nx][ny];
            }
        }
        return sum;
    }
}
