package cn.ccy.leetcode.archive_202211;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/27 0027
 * @description https://leetcode.cn/problems/check-if-array-is-sorted-and-rotated/
 */
public class Check {
    public static void main(String[] args) {
        int[] nums = {6};
        System.out.println(new Check().check(nums));
    }

    public boolean check(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return true;
        }

        int count = 1;
        for (int i = 1; i < 2 * len; i++) {
            if (nums[i % len] >= nums[(i - 1) % len]) {
                ++count;
            } else {
                count = 1;
            }

            if (count == len) {
                break;
            }
        }
        return count == len;
    }
}
