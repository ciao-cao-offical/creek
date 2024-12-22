package cn.ccy.leetcode.archive_2022.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/10
 * @description https://leetcode.cn/problems/minimum-swaps-to-make-sequences-increasing/
 */
public class MinSwap {
    public static void main(String[] args) {

    }

    public int minSwap(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int a = 0, b = 1;
        for (int i = 1; i < n; i++) {
            int at = a, bt = b;
            a = b = n;
            if (nums1[i] > nums1[i - 1] && nums2[i] > nums2[i - 1]) {
                a = Math.min(a, at);
                b = Math.min(b, bt + 1);
            }
            if (nums1[i] > nums2[i - 1] && nums2[i] > nums1[i - 1]) {
                a = Math.min(a, bt);
                b = Math.min(b, at + 1);
            }
        }
        return Math.min(a, b);
    }
}
