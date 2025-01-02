package cn.ccy.leetcode._2024.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/10 00:19:34
 * @description https://leetcode.cn/problems/find-the-number-of-good-pairs-i/?envType=daily-question&envId=2024-10-10
 */
public class NumberOfPairs {
    public static void main(String[] args) {

    }

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int res = 0;
        for (int a : nums1) {
            for (int b : nums2) {
                if (a % (b * k) == 0) {
                    res++;
                }
            }
        }
        return res;
    }
}
