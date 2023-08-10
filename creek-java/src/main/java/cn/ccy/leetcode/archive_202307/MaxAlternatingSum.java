package cn.ccy.leetcode.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/11 0011 00:57:43
 * @description https://leetcode.cn/problems/maximum-alternating-subsequence-sum/
 * ☆☆☆ cvd
 */
public class MaxAlternatingSum {
    public static void main(String[] args) {

    }

    public long maxAlternatingSum(int[] nums) {
        long even = nums[0], odd = 0;
        for (int i = 1; i < nums.length; i++) {
            even = Math.max(even, odd + nums[i]);
            odd = Math.max(odd, even - nums[i]);
        }
        return even;
    }
}
