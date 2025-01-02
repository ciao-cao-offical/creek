package cn.ccy.leetcode._2022.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/27 0027
 * @description https://leetcode.cn/problems/sign-of-the-product-of-an-array/
 */
public class ArraySign {
    public static void main(String[] args) {

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
