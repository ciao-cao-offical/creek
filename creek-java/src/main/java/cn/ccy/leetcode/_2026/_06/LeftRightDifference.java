package cn.ccy.leetcode._2026._06;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/left-and-right-sum-differences/?envType=daily-question&envId=2026-06-06">2574. 左右元素和的差值</a>
 * @since 2026/6/6 19:42
 */
public class LeftRightDifference {
    public static void main(String[] args) {

    }
    
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int leftSum = 0;
        for (int i = 0; i < n; ++i) {
            ans[i] = leftSum;
            leftSum += nums[i];
        }

        int rightSum = 0;
        for (int i = n - 1; i >= 0; --i) {
            ans[i] = Math.abs(ans[i] - rightSum);
            rightSum += nums[i];
        }

        return ans;
    }
}
