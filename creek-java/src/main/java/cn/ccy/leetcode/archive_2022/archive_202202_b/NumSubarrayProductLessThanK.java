package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/11
 * @description https://leetcode-cn.com/problems/subarray-product-less-than-k/
 * ★
 */
public class NumSubarrayProductLessThanK {
    public static void main(String[] args) {
        System.out.println(new NumSubarrayProductLessThanK().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int ans = 0, start = 0, mr = 1;
        int len = nums.length;
        for (int end = 0; end < len; end++) {
            mr *= nums[end];
            while (mr >= k) {
                mr /= nums[start++];
            }
            ans += end - start + 1;
        }

        return ans;
    }
}
