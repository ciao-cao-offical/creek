package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/smallest-index-with-digit-sum-equal-to-index/?envType=daily-question&envId=2026-09-24">3550. 数位和等于下标的最小下标</a>
 * @since 2026/9/24 02:45
 */
public class SmallestIndex {
    public static void main(String[] args) {

    }

    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digitSum = 0;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }

            if (digitSum == i) {
                return i;
            }
        }

        return -1;
    }
}
