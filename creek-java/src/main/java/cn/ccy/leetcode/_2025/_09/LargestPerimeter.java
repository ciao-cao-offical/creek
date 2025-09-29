package cn.ccy.leetcode._2025._09;

import java.util.Arrays;

/**
 *
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/largest-perimeter-triangle/?envType=daily-question&envId=2025-09-28">976. 三角形的最大周长</a>
 * @since 2025/9/28 22:56
 */
public class LargestPerimeter {
    public static void main(String[] args) {

    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; --i) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }
        return 0;
    }
}
