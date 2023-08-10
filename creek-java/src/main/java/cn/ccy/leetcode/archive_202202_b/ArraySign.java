package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/21
 * @description https://leetcode-cn.com/problems/sign-of-the-product-of-an-array/
 */
public class ArraySign {
    public static void main(String[] args) {
        int[] nums = {7, 36, 96, 70, 85, 23, 5, 18, 4, 12, 89, 92, 9, 30, 53, 14, 96, 32, 13, 43, 37, 60, 75, 7, 83, 68, 20, 8, -24, -80, -27, -92, -96, -20, -16, -52, -49, -38};
        System.out.println(new ArraySign().arraySign(nums));
    }

    public int arraySign(int[] nums) {
        int ans = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                ans = -ans;
            }
        }
        return ans;
    }
}
