package cn.ccy.leetcode._2025._11;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/keep-multiplying-found-values-by-two/?envType=daily-question&envId=2025-11-19">2154. 将找到的值乘以 2</a>
 * @since 2025/11/19 21:58
 */
public class FindFinalValue {
    public static void main(String[] args) {

    }

    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int num : nums) {
            if (original == num) {
                original *= 2;
            }
        }
        return original;
    }
}
