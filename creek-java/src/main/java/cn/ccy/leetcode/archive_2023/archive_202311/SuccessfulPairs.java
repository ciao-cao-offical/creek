package cn.ccy.leetcode.archive_2023.archive_202311;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/10 0010 00:14:19
 * @description https://leetcode.cn/problems/successful-pairs-of-spells-and-potions/?envType=daily-question&envId=2023-11-10
 * ☆☆☆ 2023b2t
 */
public class SuccessfulPairs {
    public static void main(String[] args) {

    }

    // 茶神（排序 + 二分）：https://leetcode.cn/problems/successful-pairs-of-spells-and-potions/solutions/1595712/by-endlesscheng-1kbp/?envType=daily-question&envId=2023-11-10
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            long target = (success - 1) / spells[i];
            if (target < potions[potions.length - 1]) { // 防止 long 转成 int 溢出
                spells[i] = potions.length - upperBound(potions, (int) target);
            } else {
                spells[i] = 0;
            }
        }
        return spells;
    }

    // 直接二分 long 是 28ms，改成 int 是 26ms
    private int upperBound(int[] nums, int target) {
        int left = -1, right = nums.length; // 开区间 (left, right)
        while (left + 1 < right) { // 区间不为空
            // 循环不变量：
            // nums[left] < target
            // nums[right] >= target
            int mid = (left + right) >>> 1;
            if (nums[mid] > target) {
                right = mid; // 二分范围缩小到 (left, mid)
            } else {
                left = mid; // 二分范围缩小到 (mid, right)
            }
        }
        return right;
    }

    // 超时
    /*public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] successes = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            for (int potion : potions) {
                if ((long) spells[i] * potion >= success) {
                    ++successes[i];
                }
            }
        }

        return successes;
    }*/
}
