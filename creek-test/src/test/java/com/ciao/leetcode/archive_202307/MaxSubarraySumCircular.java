package com.ciao.leetcode.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/20 0020 00:09:51
 * @description https://leetcode.cn/problems/maximum-sum-circular-subarray/
 * ★★★ cvd
 */
public class MaxSubarraySumCircular {
    public static void main(String[] args) {
        System.out.println(new MaxSubarraySumCircular().maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
    }

    // 官解：动态规划：https://leetcode.cn/problems/maximum-sum-circular-subarray/solutions/2350660/huan-xing-zi-shu-zu-de-zui-da-he-by-leet-elou/
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        // 对坐标为 0 处的元素单独处理，避免考虑子数组为空的情况
        leftMax[0] = nums[0];
        int leftSum = nums[0];
        int pre = nums[0];
        int res = nums[0];
        for (int i = 1; i < n; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            res = Math.max(res, pre);
            leftSum += nums[i];
            leftMax[i] = Math.max(leftMax[i - 1], leftSum);
        }

        // 从右到左枚举后缀，固定后缀，选择最大前缀
        int rightSum = 0;
        for (int i = n - 1; i > 0; i--) {
            rightSum += nums[i];
            res = Math.max(res, rightSum + leftMax[i - 1]);
        }
        return res;
    }

    // 超时...
    /*public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int sum = nums[i];
            max = Math.max(sum, max);
            int j = i + 1;
            while ((j % len) != i) {
                sum += nums[j % len];
                max = Math.max(sum, max);
                j++;
            }
        }
        return max;
    }*/
}
