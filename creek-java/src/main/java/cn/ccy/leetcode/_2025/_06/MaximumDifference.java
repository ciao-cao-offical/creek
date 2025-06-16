package cn.ccy.leetcode._2025._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-difference-between-increasing-elements/?envType=daily-question&envId=2025-06-16">2016. 增量元素之间的最大差值</a>
 * @since 2025/6/16 23:06
 */
public class MaximumDifference {
    public static void main(String[] args) {

    }

    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans = -1, premin = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i] > premin) {
                ans = Math.max(ans, nums[i] - premin);
            } else {
                premin = nums[i];
            }
        }
        return ans;
    }

    /*public int maximumDifference(int[] nums) {
        int diff = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    diff = Math.max(diff, nums[j] - nums[i]);
                }
            }
        }

        return diff;
    }*/
}
