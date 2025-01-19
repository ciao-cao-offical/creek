package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/20 00:14:03
 * @description https://leetcode.cn/problems/find-closest-number-to-zero/?envType=daily-question&envId=2025-01-20
 */
public class FindClosestNumber {
    public static void main(String[] args) {

    }

    public int findClosestNumber(int[] nums) {
        int cn = nums[0];
        int absCn = Math.abs(cn);
        for (int i = 1; i < nums.length; i++) {
            int abs = Math.abs(nums[i]);
            if (abs <= absCn) {
                if (abs == absCn) {
                    cn = Math.max(nums[i], cn);

                } else {
                    cn = nums[i];
                    absCn = abs;
                }
            }
        }
        return cn;
    }
}
