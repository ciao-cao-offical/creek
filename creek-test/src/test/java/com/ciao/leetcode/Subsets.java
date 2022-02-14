package com.ciao.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/14
 * @description https://leetcode-cn.com/problems/subsets/
 * ★★
 */
public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new Subsets().subsets(nums));
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(ans, cur, nums, 0);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, List<Integer> cur, int[] nums, int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        dfs(ans, cur, nums, i + 1);
        cur.remove(cur.size() - 1);
        dfs(ans, cur, nums, i + 1);
    }

}
