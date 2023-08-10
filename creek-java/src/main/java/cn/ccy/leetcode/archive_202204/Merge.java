package cn.ccy.leetcode.archive_202204;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/10 0010
 * @description https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 6, 0};
        int m = 5;
        int[] nums2 = {3};
        int n = 1;
        new Merge().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    //逆向双指针
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int p1 = m - 1;
        int p2 = n - 1;
        int tail = m + n - 1;
        while (p1 >= 0 || p2 >= 0) {
            int cur = 0;
            if (p1 == -1) {
                cur = nums2[p2--];

            } else if (p2 == -1) {
                cur = nums1[p1--];

            } else {
                int i = nums1[p1];
                int j = nums2[p2];
                if (i > j) {
                    cur = i;
                    p1--;
                } else {
                    cur = j;
                    p2--;
                }
            }
            nums1[tail--] = cur;
        }
    }
}
