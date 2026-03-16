package cn.ccy.leetcode._2026._03;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/largest-submatrix-with-rearrangements/?envType=daily-question&envId=2026-03-17">1727. 重新排列后的最大子矩阵</a>
 * @since 2026/3/17 00:10
 */
public class LargestSubmatrix {
    public static void main(String[] args) {

    }

    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxArea = 0;

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(matrix[i]);
            reverse(matrix[i]);
            for (int j = 0; j < n; j++) {
                maxArea = Math.max(maxArea, (j + 1) * matrix[i][j]);
            }
        }

        return maxArea;
    }

    private void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
