package com.ciao.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/7
 * @description https://leetcode-cn.com/problems/combination-sum-ii/
 */
public class CombinationSum2 {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> comb = new ArrayList<>();
    private List<int[]> freq = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new CombinationSum2().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int candidate : candidates) {
            

        }


        return null;
    }

    private void dfs(int pos, int rest) {

    }

}
