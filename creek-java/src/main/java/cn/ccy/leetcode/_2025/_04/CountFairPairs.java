package cn.ccy.leetcode._2025._04;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-fair-pairs/?envType=daily-question&envId=2025-04-19">2563. 统计公平数对的数目</a>
 * @since 2025/4/19 21:17
 * ☆☆☆ 2025cvd
 */
public class CountFairPairs {
    public static void main(String[] args) {

    }

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        for (int j = 0; j < nums.length; j++) {
            int r = lowerBound(nums, j, upper - nums[j] + 1);
            int l = lowerBound(nums, j, lower - nums[j]);
            ans += r - l;
        }
        return ans;
    }

    private int lowerBound(int[] nums, int right, int target) {
        int left = -1;
        while (left + 1 < right) {
            int mid = (left + right) >>> 1;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
