package com.ciao.leetcode.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/25 0025 21:15:03
 * @description https://leetcode.cn/problems/shortest-subarray-to-be-removed-to-make-array-sorted/
 */
public class FindLengthOfShortestSubarray {
    public static void main(String[] args) {

    }

    //同向双指针
    public int findLengthOfShortestSubarray(int[] arr) {
        int len = arr.length;
        int right = len - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            --right;
        }
        if (right == 0) {
            return 0;
        }

        int ans = right;
        for (int left = 0; left == 0 || arr[left - 1] <= arr[left]; ++left) {
            while (right < len && arr[right] < arr[left]) {
                ++right;
            }

            ans = Math.min(ans, right - left - 1);
        }
        return ans;
    }
}
