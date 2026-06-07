package cn.ccy.leetcode._2026._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/partition-array-according-to-given-pivot/?envType=daily-question&envId=2026-06-08">2161. 根据给定数字划分数组</a>
 * @since 2026/6/8 00:06
 */
public class PivotArray {
    public static void main(String[] args) {

    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, pivot);
        int left = 0, right = n - 1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] < pivot) {
                ans[left] = nums[i];
                ++left;
            } else if (nums[i] > pivot) {
                ans[right] = nums[i];
                --right;
            }
        }
        reverse(ans, right + 1, n - 1);
        return ans;
    }
}
