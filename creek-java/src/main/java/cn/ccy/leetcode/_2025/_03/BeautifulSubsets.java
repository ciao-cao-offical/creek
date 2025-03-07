package cn.ccy.leetcode._2025._03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/3/7 23:12
 * @description/link https://leetcode.cn/problems/the-number-of-beautiful-subsets/?envType=daily-question&envId=2025-03-07
 */
public class BeautifulSubsets {
    public static void main(String[] args) {

    }

    private int ans = 0;
    private Map<Integer, Integer> cnt = new HashMap<>();

    public int beautifulSubsets(int[] nums, int k) {
        dfs(nums, k, 0);
        return ans - 1;
    }

    public void dfs(int[] nums, int k, int i) {
        if (i == nums.length) {
            ans++;
            return;
        }
        dfs(nums, k, i + 1);
        if (cnt.getOrDefault(nums[i] - k, 0) == 0 && cnt.getOrDefault(nums[i] + k, 0) == 0) {
            cnt.put(nums[i], cnt.getOrDefault(nums[i], 0) + 1);
            dfs(nums, k, i + 1);
            cnt.put(nums[i], cnt.getOrDefault(nums[i], 0) - 1);
        }
    }
}
