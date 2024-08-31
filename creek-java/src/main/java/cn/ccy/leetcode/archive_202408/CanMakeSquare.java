package cn.ccy.leetcode.archive_202408;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/31 21:38
 * @description https://leetcode.cn/problems/make-a-square-with-the-same-color/?envType=daily-question&envId=2024-08-31
 */
public class CanMakeSquare {
    public static void main(String[] args) {

    }

    public boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (check(grid, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] grid, int x, int y) {
        int count = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (grid[x + i][y + j] == 'B') {
                    count++;
                }
            }
        }
        return count != 2;
    }
}
