package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-distance-between-a-pair-of-values/description/?envType=daily-question&envId=2026-04-19">1855. 下标对中的最大距离</a>
 * @since 2026/4/19 13:53
 */
public class MaxDistance {
    public static void main(String[] args) {

    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int res = 0;

        for (int j = 0; j < n2; j++) {
            while (i < n1 && nums1[i] > nums2[j]) {
                i++;
            }
            if (i < n1) {
                res = Math.max(res, j - i);
            }
        }

        return res;
    }
}
