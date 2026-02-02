package cn.ccy.leetcode._2026._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/trionic-array-i/?envType=daily-question&envId=2026-02-03">3637. 三段式数组 I</a>
 * @since 2026/2/3 00:06
 */
public class IsTrionic {
    public static void main(String[] args) {

    }

    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        // 第一段
        int i = 1;
        while (i < n && nums[i - 1] < nums[i]) {
            i++;
        }
        if (i == 1) { // 第一段至少要有两个数
            return false;
        }

        // 第二段
        int i0 = i;
        while (i < n && nums[i - 1] > nums[i]) {
            i++;
        }
        if (i == i0 || i == n) { // 第二段至少要有两个数，第三段至少要有两个数
            return false;
        }

        // 第三段
        while (i < n && nums[i - 1] < nums[i]) {
            i++;
        }
        return i == n;
    }
}
