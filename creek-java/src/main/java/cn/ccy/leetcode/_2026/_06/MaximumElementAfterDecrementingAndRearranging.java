package cn.ccy.leetcode._2026._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-element-after-decreasing-and-rearranging/?envType=daily-question&envId=2026-06-28">1846. 减小和重新排列数组后的最大元素</a>
 * @since 2026/6/28 03:07
 */
public class MaximumElementAfterDecrementingAndRearranging {
    public static void main(String[] args) {

    }

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < n; ++i) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }
        return arr[n - 1];
    }
}
