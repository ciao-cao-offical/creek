package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/smallest-missing-non-negative-integer-after-operations/?envType=daily-question&envId=2025-10-16">2598. 执行操作后的最大 MEX</a>
 * @since 2025/10/16 23:52
 */
public class FindSmallestInteger {
    public static void main(String[] args) {

    }

    public int findSmallestInteger(int[] nums, int value) {
        int[] mp = new int[value];
        for (int x : nums) {
            int v = ((x % value) + value) % value;
            mp[v]++;
        }
        int mex = 0;
        while (mp[mex % value] > 0) {
            mp[mex % value]--;
            mex++;
        }
        return mex;
    }
}
