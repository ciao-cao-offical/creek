package cn.ccy.leetcode._2025._11;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/?envType=daily-question&envId=2025-11-22">3190. 使所有元素都可以被 3 整除的最少操作数</a>
 * @since 2025/11/22 20:23
 */
public class MinimumOperations {
    public static void main(String[] args) {

    }

    public int minimumOperations(int[] nums) {
        return Arrays.stream(nums)
                .map(x -> Math.min(x % 3, 3 - x % 3))
                .sum();
    }
}
