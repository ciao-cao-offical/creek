package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-largest-almost-missing-integer/?envType=daily-question&envId=2026-08-18">3471. 找出最大的几近缺失整数</a>
 * @since 2026/8/18 00:56
 */
public class LargestInteger {
    public static void main(String[] args) {

    }

    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (n == k) {
            int res = nums[0];
            for (int x : nums) {
                res = Math.max(res, x);
            }
            return res;
        }
        int[] count = new int[51];
        for (int x : nums) {
            count[x]++;
        }
        if (k == 1) {
            for (int i = 50; i >= 0; --i) {
                if (count[i] == 1) {
                    return i;
                }
            }
            return -1;
        }
        int res = -1;
        if (count[nums[0]] == 1) {
            res = Math.max(res, nums[0]);
        }
        if (count[nums[n - 1]] == 1) {
            res = Math.max(res, nums[n - 1]);
        }
        return res;
    }
}
