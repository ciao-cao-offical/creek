package cn.ccy.leetcode.archive_2024.archive_202412;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/11 00:09:08
 * @description https://leetcode.cn/problems/semi-ordered-permutation/?envType=daily-question&envId=2024-12-11
 */
public class SemiOrderedPermutation {
    public static void main(String[] args) {

    }

    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int first = 0, last = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                first = i;
            }
            if (nums[i] == n) {
                last = i;
            }
        }
        return first + n - 1 - last - (last < first ? 1 : 0);
    }
}
