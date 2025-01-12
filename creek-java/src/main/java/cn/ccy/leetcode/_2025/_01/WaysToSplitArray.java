package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/13 00:09:57
 * @description https://leetcode.cn/problems/number-of-ways-to-split-array/?envType=daily-question&envId=2025-01-13
 */
public class WaysToSplitArray {
    public static void main(String[] args) {

    }

    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long left = 0, right = 0;
        for (int num : nums) {
            right += num;
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            left += nums[i];
            right -= nums[i];
            if (left >= right) {
                ans++;
            }
        }
        return ans;
    }
}
