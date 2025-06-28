package cn.ccy.leetcode._2025._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-subsequence-of-length-k-with-the-largest-sum/?envType=daily-question&envId=2025-06-28">2099. 找到和最大的长度为 K 的子序列</a>
 * @since 2025/6/28 22:25
 */
public class MaxSubsequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MaxSubsequence().maxSubsequence(new int[]{2, 1, 3, 3}, 2)));

    }

    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] vals = new int[n][2]; // 二维数组存储索引和值
        for (int i = 0; i < n; ++i) {
            vals[i][0] = i;      // 存储索引
            vals[i][1] = nums[i]; // 存储值
        }
        // 按照数值降序排序
        Arrays.sort(vals, (x1, x2) -> Integer.compare(x2[1], x1[1]));
        // 取前 k 个并按照下标升序排序
        Arrays.sort(vals, 0, k, (x1, x2) -> Integer.compare(x1[0], x2[0]));
        int[] res = new int[k]; // 目标子序列
        for (int i = 0; i < k; ++i) {
            res[i] = vals[i][1];
        }
        return res;
    }
}
