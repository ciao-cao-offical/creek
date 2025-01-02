package cn.ccy.leetcode._2024.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/13 00:08:35
 * @description https://leetcode.cn/problems/find-if-array-can-be-sorted/?envType=daily-question&envId=2024-07-13
 */
public class CanSortArray {
    public static void main(String[] args) {

    }

    public boolean canSortArray(int[] nums) {
        int lastCnt = 0;
        int lastGroupMax = 0;
        int curGroupMax = 0;
        for (int num : nums) {
            int curCnt = Integer.bitCount(num);
            if (curCnt == lastCnt) {
                curGroupMax = Math.max(curGroupMax, num);
            } else {
                lastCnt = curCnt;
                lastGroupMax = curGroupMax;
                curGroupMax = num;
            }
            if (num < lastGroupMax) {
                return false;
            }
        }
        return true;
    }
}
