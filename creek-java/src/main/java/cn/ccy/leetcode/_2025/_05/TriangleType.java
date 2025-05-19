package cn.ccy.leetcode._2025._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/type-of-triangle/?envType=daily-question&envId=2025-05-19">3024. 三角形类型</a>
 * @since 2025/5/19 23:07
 */
public class TriangleType {
    public static void main(String[] args) {

    }

    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        } else if (nums[0] == nums[2]) {
            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
