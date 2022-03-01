package com.ciao.leetcode.archive_202202_b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/7
 * @description https://leetcode-cn.com/problems/permutations-ii/
 */
public class PermuteUnique {

    private boolean[] vis = null;

    public static void main(String[] args) {
        System.out.println(new PermuteUnique().permuteUnique(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> param = new ArrayList<>();
        Arrays.sort(nums);
        vis = new boolean[nums.length];
        backTrack(nums, ans, param, 0);
        return ans;
    }

    private void backTrack(int[] nums, List<List<Integer>> ans, List<Integer> param, int idx) {
        int len = nums.length;
        if (idx == len) {
            ans.add(new ArrayList<>(param));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (vis[i] || (i >= 1 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                continue;
            }

            vis[i] = true;
            param.add(nums[i]);
            backTrack(nums, ans, param, idx + 1);
            vis[i] = false;
            param.remove(param.size() - 1);
        }
    }
}
