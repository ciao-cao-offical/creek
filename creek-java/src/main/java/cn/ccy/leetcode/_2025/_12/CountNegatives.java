package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/?envType=daily-question&envId=2025-12-28">1351. 统计有序矩阵中的负数</a>
 * @since 2025/12/28 12:45
 */
public class CountNegatives {
    public static void main(String[] args) {

    }

    public int countNegatives(int[][] grid) {
        int num = 0;
        for (int[] row : grid) {
            for (int value : row) {
                if (value < 0) {
                    num++;
                }
            }
        }
        return num;
    }
}
