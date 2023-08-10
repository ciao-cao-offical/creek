package cn.ccy.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/27 0027
 * @description https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 */
public class Search2 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(new Search2().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;

            } else if (nums[0] <= nums[mid]) {
                //左有序
                if (nums[0] <= target && nums[mid] > target) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }

            } else {
                if (nums[mid] < target && nums[len - 1] >= target) {
                    left = mid + 1;

                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
