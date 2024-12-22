package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.HashSet;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/19
 * @description https://leetcode-cn.com/problems/contains-duplicate-ii/
 */
public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        boolean b = new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
        System.out.println(b);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 1) {
            return false;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
