package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/2
 * @description https://leetcode-cn.com/problems/search-a-2d-matrix/
 */
public class SearchMatrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int x = matrix[mid / n][mid % n];

            if (x < target) {
                low = mid + 1;

            } else if (x > target) {
                high = mid - 1;

            } else {
                return true;
            }
        }

        return false;
    }
}
