package cn.ccy.leetcode._2026._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/?envType=daily-question&envId=2026-05-15">153. 寻找旋转排序数组中的最小值</a>
 * @since 2026/5/15 00:08
 */
public class FindMin {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}
