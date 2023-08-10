package cn.ccy.leetcode.archive_202307;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/28 0028 00:44:17
 * @description https://leetcode.cn/problems/parallel-courses-iii/
 * ☆☆☆☆☆ cvd
 */
public class MinimumTime {
    public static void main(String[] args) {

    }

    public int minimumTime(int n, int[][] relations, int[] time) {
        int mx = 0;
        List<Integer>[] prev = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            prev[i] = new ArrayList<Integer>();
        }
        for (int[] relation : relations) {
            int x = relation[0], y = relation[1];
            prev[y].add(x);
        }
        Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            mx = Math.max(mx, dp(i, time, prev, memo));
        }
        return mx;
    }

    public int dp(int i, int[] time, List<Integer>[] prev, Map<Integer, Integer> memo) {
        if (!memo.containsKey(i)) {
            int cur = 0;
            for (int p : prev[i]) {
                cur = Math.max(cur, dp(p, time, prev, memo));
            }
            cur += time[i - 1];
            memo.put(i, cur);
        }
        return memo.get(i);
    }
}
