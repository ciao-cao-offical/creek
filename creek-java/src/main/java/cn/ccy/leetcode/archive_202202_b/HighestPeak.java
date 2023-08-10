package cn.ccy.leetcode.archive_202202_b;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/29
 * @description https://leetcode-cn.com/problems/map-of-highest-peak/solution/di-tu-zhong-de-zui-gao-dian-by-leetcode-jdkzr/
 */
public class HighestPeak {
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static void main(String[] args) {

    }

    //多远广度优先算法
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(ans[i], -1);
        }

        ArrayDeque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    deque.offer(new int[]{i, j});
                    ans[i][j] = 0;
                }
            }
        }

        while (!deque.isEmpty()) {
            int[] pop = deque.pop();
            for (int[] dir : dirs) {
                int x = pop[0] + dir[0];
                int y = pop[1] + dir[1];
                if (x < m && x >= 0 && y < n && y >= 0 && ans[x][y] == -1) {
                    deque.offer(new int[]{x, y});
                    ans[x][y] = ans[pop[0]][pop[1]] + 1;
                }
            }
        }

        return ans;
    }
}
