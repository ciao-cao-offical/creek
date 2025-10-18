package cn.ccy.leetcode._2025._10;

import java.util.Arrays;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-distinct-elements-after-operations/?envType=daily-question&envId=2025-10-18">3397. 执行操作后不同元素的最大数量</a>
 * @since 2025/10/18 20:09
 */
public class MaxDistinctElements {
    public static void main(String[] args) {

    }

    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0;
        int prev = Integer.MIN_VALUE;
        for (int num : nums) {
            int curr = Math.min(Math.max(num - k, prev + 1), num + k);
            if (curr > prev) {
                cnt++;
                prev = curr;
            }
        }
        return cnt;
    }
}
