package cn.ccy.leetcode._2025._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-operations-to-make-array-sum-divisible-by-k/?envType=daily-question&envId=2025-11-29">3512. 使数组和能被 K 整除的最少操作次数</a>
 * @since 2025/11/29 20:00
 */
public class MinOperations3 {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}
