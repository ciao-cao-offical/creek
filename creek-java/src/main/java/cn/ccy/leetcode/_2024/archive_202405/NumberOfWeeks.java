package cn.ccy.leetcode._2024.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/16 00:33:26
 * @description https://leetcode.cn/problems/maximum-number-of-weeks-for-which-you-can-work/?envType=daily-question&envId=2024-05-16
 */
public class NumberOfWeeks {
    public static void main(String[] args) {

    }

    public long numberOfWeeks(int[] milestones) {
        int longest = milestones[0]; // 耗时最长工作所需周数
        long rest = 0;
        for (int count : milestones) {
            longest = Math.max(longest, count);
            rest += count;
        }
        // 其余工作共计所需周数
        rest -= longest;
        if (longest > rest + 1) {
            // 此时无法完成所耗时最长的工作
            return rest * 2 + 1;
        } else {
            // 此时可以完成所有工作
            return longest + rest;
        }
    }
}
