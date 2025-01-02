package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/14 0014
 * @description https://leetcode-cn.com/problems/subarray-product-less-than-k/
 */
public class NumSubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 1;
        System.out.println(new NumSubarrayProductLessThanK().numSubarrayProductLessThanK(nums, k));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int ans = 0;
        int prod = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left];
                left++;
            }

            ans += right - left + 1;
        }
        return ans;
    }
}
