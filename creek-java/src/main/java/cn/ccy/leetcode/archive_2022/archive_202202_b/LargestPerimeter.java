package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/20
 * @description https://leetcode-cn.com/problems/largest-perimeter-triangle/
 */
public class LargestPerimeter {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2};
        System.out.println(new LargestPerimeter().largestPerimeter(nums));
    }

    public int largestPerimeter(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int len = nums.length;
        if (len <= 2) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = len - 1; i >= 2; i--) {
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            if (a + b > c && a + c > b && b + c > a) {
                return a + b + c;
            }
        }

        return 0;
    }
}
