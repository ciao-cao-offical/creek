package cn.ccy.leetcode.archive_202401;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/4 0004 21:05:16
 * @description https://leetcode.cn/problems/maximum-rows-covered-by-columns/?envType=daily-question&envId=2024-01-04
 */
public class MaximumRows {
    public static void main(String[] args) {

    }

    public int maximumRows(int[][] matrix, int numSelect) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] mask = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mask[i] += matrix[i][j] << (n - j - 1);
            }
        }
        int res = 0;
        int cur = 0;
        int limit = (1 << n);
        while (++cur < limit) {
            if (Integer.bitCount(cur) != numSelect) {
                continue;
            }
            int t = 0;
            for (int j = 0; j < m; j++) {
                if ((mask[j] & cur) == mask[j]) {
                    ++t;
                }
            }
            res = Math.max(res, t);
        }
        return res;
    }
}
