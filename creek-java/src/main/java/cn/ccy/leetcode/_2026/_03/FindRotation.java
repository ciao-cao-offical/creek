package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/determine-whether-matrix-can-be-obtained-by-rotation/?envType=daily-question&envId=2026-03-22">1886. 判断矩阵经轮转后是否一致</a>
 * @since 2026/3/22 20:11
 */
public class FindRotation {
    public static void main(String[] args) {

    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        // 最多旋转 4 次
        for (int k = 0; k < 4; k++) {
            // 旋转操作
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (n + 1) / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[n - 1 - j][i];
                    mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
                    mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
                    mat[j][n - 1 - i] = temp;
                }
            }

            if (isEqual(mat, target)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
