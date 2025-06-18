package cn.ccy.leetcode._2025._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/divide-array-into-arrays-with-max-difference/?envType=daily-question&envId=2025-06-18">2966. 划分数组并满足最大差限制</a>
 * @since 2025/6/18 21:14
 */
public class DivideArray {
    public static void main(String[] args) {

    }

    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] res = new int[n / 3][3];
        for (int i = 0; i < n; i += 3) {
            if (nums[i + 2] - nums[i] > k) {
                return new int[0][];
            }
            res[i / 3][0] = nums[i];
            res[i / 3][1] = nums[i + 1];
            res[i / 3][2] = nums[i + 2];
        }
        return res;
    }
}
