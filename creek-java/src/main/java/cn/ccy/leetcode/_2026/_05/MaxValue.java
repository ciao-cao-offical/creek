package cn.ccy.leetcode._2026._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/jump-game-ix/?envType=daily-question&envId=2026-05-07">3660. 跳跃游戏 IX</a>
 * @since 2026/5/7 00:11
 */
public class MaxValue {
    public static void main(String[] args) {

    }

    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int[] preMax = new int[n];
        preMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            preMax[i] = Math.max(preMax[i - 1], nums[i]);
        }

        int sufMin = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (preMax[i] > sufMin) {
                preMax[i] = preMax[i + 1];
            }
            sufMin = Math.min(sufMin, nums[i]);
        }
        return preMax;
    }
}
