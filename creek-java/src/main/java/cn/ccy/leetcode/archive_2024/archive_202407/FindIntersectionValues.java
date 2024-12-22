package cn.ccy.leetcode.archive_2024.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/16 22:12:01
 * @description https://leetcode.cn/problems/find-common-elements-between-two-arrays/?envType=daily-question&envId=2024-07-16
 */
public class FindIntersectionValues {
    public static void main(String[] args) {

    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] res = new int[2];
        for (int x1 : nums1) {
            for (int x2 : nums2) {
                if (x1 == x2) {
                    res[0]++;
                    break;
                }
            }
        }
        for (int x2 : nums2) {
            for (int x1 : nums1) {
                if (x2 == x1) {
                    res[1]++;
                    break;
                }
            }
        }
        return res;
    }
}
