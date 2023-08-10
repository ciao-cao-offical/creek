package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/2
 * @description https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 */
public class Search {
    public static void main(String[] args) {
        System.out.println(new Search().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    public int search(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        int len = nums.length;
        if (len == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && nums[mid] > target) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }

            } else {
                if (nums[mid] < target && target <= nums[len - 1]) {
                    left = mid + 1;

                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
