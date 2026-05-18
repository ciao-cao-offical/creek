package cn.ccy.leetcode._2026._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-common-value/?envType=daily-question&envId=2026-05-19">2540. 最小公共值</a>
 * @since 2026/5/19 00:19
 */
public class GetCommon {
    public static void main(String[] args) {

    }

    public int getCommon(int[] nums1, int[] nums2) {
        for (int num : nums1) {
            int idx = lowerBound(nums2, num);
            if (idx < nums2.length && nums2[idx] == num) {
                return num;
            }
        }
        return -1;
    }

    private int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
