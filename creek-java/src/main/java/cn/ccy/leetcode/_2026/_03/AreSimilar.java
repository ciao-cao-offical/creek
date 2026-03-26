package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/matrix-similarity-after-cyclic-shifts/?envType=daily-question&envId=2026-03-27">2946. 循环移位后的矩阵相似检查</a>
 * @since 2026/3/27 01:05
 */
public class AreSimilar {
    public static void main(String[] args) {

    }

    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k %= n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[i][(j + k) % n]) {
                    return false;
                }
            }
        }
        return true;
    }
}
