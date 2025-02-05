package cn.ccy.leetcode._2025._02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/5 19:08
 * @description/link https://leetcode.cn/problems/subsets-ii/?envType=daily-question&envId=2025-02-05
 */
public class SubsetsWithDup {
    public static void main(String[] args) {

    }

    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(false, nums, 0);
        return ans;
    }

    private void dfs(boolean cp, int[] nums, int cur) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        dfs(false, nums, cur + 1);
        if (!cp && cur > 0 && nums[cur] == nums[cur - 1]) {
            return;
        }
        temp.add(nums[cur]);
        dfs(true, nums, cur + 1);
        temp.remove(temp.size() - 1);
    }
}
