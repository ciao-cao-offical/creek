package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/14
 * @description https://leetcode-cn.com/problems/subsets-ii/
 */
public class SubsetsWithDup {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(new SubsetsWithDup().subsetsWithDup(nums));
    }

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
