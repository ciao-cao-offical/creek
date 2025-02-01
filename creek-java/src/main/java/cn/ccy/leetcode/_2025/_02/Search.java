package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/1 15:34:00
 * @description https://leetcode.cn/problems/search-in-rotated-sorted-array-ii/?envType=daily-question&envId=2025-02-01
 */

public class Search {
    public static void main(String[] args) {

    }

    public boolean search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return nums[0] == target;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                ++l;
                --r;
            } else if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }

}
