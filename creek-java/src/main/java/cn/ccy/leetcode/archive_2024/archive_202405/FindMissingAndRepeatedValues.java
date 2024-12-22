package cn.ccy.leetcode.archive_2024.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/31 00:01:12
 * @description https://leetcode.cn/problems/find-missing-and-repeated-values/?envType=daily-question&envId=2024-05-31
 */
public class FindMissingAndRepeatedValues {
    public static void main(String[] args) {

    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }

        int[] res = new int[2];
        for (int i = 1; i <= n * n; i++) {
            if (count[i] == 2) {
                res[0] = i;
            }
            if (count[i] == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}
