package com.ciao.leetcode.archive_202205;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/8 0008
 * @description https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/
 * ☆ 试试【将元素交换到对应的位置】和【使用正负号作为标记】
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(new FindDuplicates().findDuplicates(nums));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums == null || nums.length < 2) {
            return ans;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                ans.add(num);
            }
        }
        return ans;
    }
}
