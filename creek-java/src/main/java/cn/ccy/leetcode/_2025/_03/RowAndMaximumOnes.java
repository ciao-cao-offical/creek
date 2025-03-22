package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/row-with-maximum-ones/?envType=daily-question&envId=2025-03-22">2643. 一最多的行</a>
 * @since 2025/3/22 20:15
 */
public class RowAndMaximumOnes {
    public static void main(String[] args) {

    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int rowIndex = 0;
        for (int i = 0; i < mat.length; i++) {
            int tot = 0;
            for (int j = 0; j < mat[i].length; j++) {
                tot += mat[i][j];
            }
            if (tot > maxOnes) {
                maxOnes = tot;
                rowIndex = i;
            }
        }
        return new int[]{rowIndex, maxOnes};
    }
}
