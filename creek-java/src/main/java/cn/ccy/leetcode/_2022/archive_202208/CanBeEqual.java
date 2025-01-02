package cn.ccy.leetcode._2022.archive_202208;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/24 0024
 * @description https://leetcode.cn/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 */
public class CanBeEqual {
    public static void main(String[] args) {

    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
