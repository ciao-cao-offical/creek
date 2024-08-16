package cn.ccy.leetcode.archive_202408_hm;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/14 02:07
 * @description https://leetcode.cn/problems/special-array-i/?envType=daily-question&envId=2024-08-13
 */
public class IsArraySpecial {
    public static void main(String[] args) {

    }

    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            if (nums[i - 1] % 2 == nums[i] % 2) {
                return false;
            }
        }
        return true;
    }
}
