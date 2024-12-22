package cn.ccy.leetcode.archive_2024.archive_202408;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/16 00:09:35
 * @description https://leetcode.cn/problems/minimum-sum-of-values-by-dividing-array/?envType=daily-question&envId=2024-08-16
 * ☆☆☆☆☆ 2024cvd
 */
public class MinimumValueSum {
    public static void main(String[] args) {

    }

    private static final int INF = (1 << 20) - 1;
    private HashMap<Integer, Integer>[] memo;

    public int minimumValueSum(int[] nums, int[] andValues) {
        int n = nums.length, m = andValues.length;
        memo = new HashMap[m * n];
        for (int i = 0; i < m * n; ++i) {
            memo[i] = new HashMap<Integer, Integer>();
        }
        int res = dfs(0, 0, INF, nums, andValues);
        return res < INF ? res : -1;
    }

    private int dfs(int i, int j, int cur, int[] nums, int[] andValues) {
        int n = nums.length, m = andValues.length, key = i * m + j;
        if (i == nums.length && j == andValues.length) {
            return 0;
        }
        if (i == nums.length || j == andValues.length) {
            return INF;
        }
        if (memo[key].containsKey(cur)) {
            return memo[key].get(cur);
        }
        cur &= nums[i];
        if ((cur & andValues[j]) < andValues[j]) {
            return INF;
        }
        int res = dfs(i + 1, j, cur, nums, andValues);
        if (cur == andValues[j]) {
            res = Math.min(res, dfs(i + 1, j + 1, INF, nums, andValues) + nums[i]);
        }
        memo[key].put(cur, res);
        return res;
    }
}
