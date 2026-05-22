package cn.ccy.leetcode._2026._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-array-is-sorted-and-rotated/description/?envType=daily-question&envId=2026-05-23">1752. 检查数组是否经排序和轮转得到</a>
 * @since 2026/5/23 00:06
 */
public class Check {
    public static void main(String[] args) {

    }

    public boolean check(int[] nums) {
        int n = nums.length, x = 0;
        for (int i = 1; i < n; ++i) {
            if (nums[i] < nums[i - 1]) {
                x = i;
                break;
            }
        }
        if (x == 0) {
            return true;
        }
        for (int i = x + 1; i < n; ++i) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return nums[0] >= nums[n - 1];
    }
}
