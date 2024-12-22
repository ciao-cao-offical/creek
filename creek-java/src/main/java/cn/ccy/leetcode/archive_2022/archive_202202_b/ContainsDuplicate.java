package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/28
 * @description https://leetcode-cn.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return false;
        }

        Arrays.sort(nums);
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
