package cn.ccy.leetcode._2025._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-maximum-sum-of-node-values/description/?envType=daily-question&envId=2025-05-23">3068. 最大节点价值之和</a>
 * @since 2025/5/23 23:58
 */
public class MaximumValueSum {
    public static void main(String[] args) {

    }

    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long res = 0;
        int[] diff = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            res += nums[i];
            diff[i] = (nums[i] ^ k) - nums[i];
        }
        Arrays.sort(diff);
        for (int i = diff.length - 1; i > 0 && diff[i] + diff[i - 1] >= 0; i -= 2) {
            res += diff[i] + diff[i - 1];
        }
        return res;
    }
}
