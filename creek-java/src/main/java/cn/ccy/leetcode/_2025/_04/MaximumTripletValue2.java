package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-value-of-an-ordered-triplet-ii/?envType=daily-question&envId=2025-04-03">2874. 有序三元组中的最大值 II</a>
 * @since 2025/4/3 23:26
 */
public class MaximumTripletValue2 {
    public static void main(String[] args) {

    }

    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i - 1]);
            rightMax[n - 1 - i] = Math.max(rightMax[n - i], nums[n - i]);
        }
        long res = 0;
        for (int j = 1; j < n - 1; j++) {
            res = Math.max(res, (long) (leftMax[j] - nums[j]) * rightMax[j]);
        }
        return res;
    }
}
