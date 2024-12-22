package cn.ccy.leetcode.archive_2024.archive_202408_hm;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/8 00:10
 * @description https://leetcode.cn/problems/find-the-integer-added-to-array-i/description/?envType=daily-question&envId=2024-08-08
 */
public class AddedInteger {
    public static void main(String[] args) {

    }

    public int addedInteger(int[] nums1, int[] nums2) {
        return Arrays.stream(nums2).min().getAsInt() - Arrays.stream(nums1).min().getAsInt();
    }
}
