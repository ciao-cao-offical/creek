package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/14 0014
 * @description https://leetcode-cn.com/problems/binary-search/
 */
public class Search {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(new Search().search(nums, target));
    }

    public int search(int[] nums, int target) {
        int len = nums.length;
        int s = 0;
        int e = len - 1;
        if (nums[s] == target) {
            return s;
        }
        if (nums[e] == target) {
            return e;
        }
        if (target < nums[s] || target > nums[e]) {
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;

            } else if (num > target) {
                e = mid - 1;

            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
