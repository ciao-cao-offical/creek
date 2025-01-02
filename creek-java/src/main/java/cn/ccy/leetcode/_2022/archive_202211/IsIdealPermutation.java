package cn.ccy.leetcode._2022.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/16
 * @description https://leetcode.cn/problems/global-and-local-inversions/
 */
public class IsIdealPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2};
        System.out.println(new IsIdealPermutation().isIdealPermutation(nums));
    }

    //【维护后缀最小值】
    public boolean isIdealPermutation(int[] nums) {
        int len = nums.length;
        int min = nums[len - 1];
        for (int i = len - 3; i >= 0; i--) {
            if (nums[i] > min) {
                return false;
            }

            min = Math.min(nums[i + 1], min);
        }

        return true;
    }
}
