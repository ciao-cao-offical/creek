package cn.ccy.leetcode._2026._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-k-to-sort-a-permutation/?envType=daily-question&envId=2026-10-23">3644. 排序排列</a>
 * @since 2026/10/25 19:06
 */
public class SortPermutation {
    public static void main(String[] args) {

    }

    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == i) {
                continue;
            }
            res &= nums[i];
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
