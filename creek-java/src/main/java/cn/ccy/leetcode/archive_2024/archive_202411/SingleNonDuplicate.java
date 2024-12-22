package cn.ccy.leetcode.archive_2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/10 17:02:51
 * @description https://leetcode.cn/problems/single-element-in-a-sorted-array/?envType=daily-question&envId=2024-11-10
 */
public class SingleNonDuplicate {
    public static void main(String[] args) {

    }

    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
