package cn.ccy.leetcode._2025._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/build-array-from-permutation/?envType=daily-question&envId=2025-05-06">1920. 基于排列构建数组</a>
 * @since 2025/5/6 22:58
 */
public class BuildArray {
    public static void main(String[] args) {

    }

    public int[] buildArray(int[] nums) {
        int[] ana = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ana[i] = nums[nums[i]];
        }
        return ana;
    }
}
