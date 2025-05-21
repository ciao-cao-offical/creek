package cn.ccy.leetcode._2025._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/zero-array-transformation-ii/?envType=daily-question&envId=2025-05-21">3356. 零数组变换 II</a>
 * @since 2025/5/21 23:43
 */
public class MinZeroArray {
    public static void main(String[] args) {

    }

    public int minZeroArray(int[] nums, int[][] queries) {
        int left = 0, right = queries.length;
        if (!check(nums, queries, right)) {
            return -1;
        }
        while (left < right) {
            int k = (left + right) / 2;
            if (check(nums, queries, k)) {
                right = k;
            } else {
                left = k + 1;
            }
        }
        return left;
    }

    private boolean check(int[] nums, int[][] queries, int k) {
        int[] deltaArray = new int[nums.length + 1];
        for (int i = 0; i < k; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int value = queries[i][2];
            deltaArray[left] += value;
            deltaArray[right + 1] -= value;
        }
        int[] operationCounts = new int[deltaArray.length];
        int currentOperations = 0;
        for (int i = 0; i < deltaArray.length; i++) {
            currentOperations += deltaArray[i];
            operationCounts[i] = currentOperations;
        }
        for (int i = 0; i < nums.length; i++) {
            if (operationCounts[i] < nums[i]) {
                return false;
            }
        }
        return true;
    }
}
