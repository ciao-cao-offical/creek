package cn.ccy.leetcode.archive_2024.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/19 23:15:16
 * @description https://leetcode.cn/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-ii/?envType=daily-question&envId=2024-10-19
 */
public class MinOperations2 {
    public int minOperations(int[] nums) {
        int operation = 0;
        for (int num : nums) {
            if (num == (operation % 2)) {
                operation++;
            }
        }
        return operation;
    }
}
