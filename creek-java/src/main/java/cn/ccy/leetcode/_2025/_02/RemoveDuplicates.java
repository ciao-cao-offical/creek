package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/9 18:53
 * @description/link https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/?envType=daily-question&envId=2025-02-09
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
