package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/15 0015
 * @description https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) {
            return 1;
        }

        int left = 0;
        int right = 1;
        int count = 1;
        int cur = nums[left];
        while (right < len) {
            if (nums[right] != cur) {
                count++;
                left++;
                nums[left] = nums[right];
                cur = nums[left];
            }
            right++;
        }
        return count;
    }
}
