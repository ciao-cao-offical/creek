package cn.ccy.leetcode._2023.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/5 16:57
 * @description https://leetcode.cn/problems/apply-operations-to-an-array/
 */
public class ApplyOperations {
    public static void main(String[] args) {

    }

    /*public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        int[] res = new int[n];
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                res[i++] = num;
            }
        }
        return res;
    }*/

    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0, j = 0; i < n; i++) {
            if (i + 1 < n && nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
