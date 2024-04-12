package cn.ccy.leetcode.archive_202404;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/12 21:32:55
 * @description https://leetcode.cn/problems/find-champion-i/?envType=daily-question&envId=2024-04-12
 */
public class FindChampion {
    public static void main(String[] args) {

    }

    public int findChampion(int[][] grid) {
        boolean[] flag = new boolean[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == j) {
                    continue;
                }
                if (grid[i][j] == 0) {
                    flag[i] = true;
                    break;
                }
            }
        }

        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                return i;
            }
        }

        return -1;
    }
}
