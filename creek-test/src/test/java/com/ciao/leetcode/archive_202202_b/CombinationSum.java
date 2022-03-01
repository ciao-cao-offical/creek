package com.ciao.leetcode.archive_202202_b;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/7
 * @description https://leetcode-cn.com/problems/combination-sum/
 */
public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(new CombinationSum().combinationSum(new int[]{2, 3, 5}, 8));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        dfs(candidates, target, ans, comb, 0);

        return ans;
    }

    private void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> comb, int idx) {
        if (target == 0) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        int len = candidates.length;
        if (idx == len) {
            return;
        }

        dfs(candidates, target, ans, comb, idx + 1);

        if (target - candidates[idx] >= 0) {
            comb.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, comb, idx);
            comb.remove(comb.size() - 1);
        }
    }
}
