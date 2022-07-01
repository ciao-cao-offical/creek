package com.ciao.leetcode.archive_202207;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/1 0001
 * @description https://leetcode.cn/problems/different-ways-to-add-parentheses/
 * ★★★ cvd b2y，学习一下宫水三叶的【DFS】解法：https://leetcode.cn/problems/different-ways-to-add-parentheses/solution/by-ac_oier-z07i/
 */
public class DiffWaysToCompute {

    public static void main(String[] args) {
        String expression = "2-1-1";
        System.out.println(new DiffWaysToCompute().diffWaysToCompute(expression));
    }

    char[] cs;

    public List<Integer> diffWaysToCompute(String s) {
        cs = s.toCharArray();
        return dfs(0, cs.length - 1);
    }

    List<Integer> dfs(int l, int r) {
        List<Integer> ans = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (cs[i] >= '0' && cs[i] <= '9') continue;
            List<Integer> l1 = dfs(l, i - 1), l2 = dfs(i + 1, r);
            for (int a : l1) {
                for (int b : l2) {
                    int cur = 0;
                    if (cs[i] == '+') cur = a + b;
                    else if (cs[i] == '-') cur = a - b;
                    else cur = a * b;
                    ans.add(cur);
                }
            }
        }
        if (ans.isEmpty()) {
            int cur = 0;
            for (int i = l; i <= r; i++) cur = cur * 10 + (cs[i] - '0');
            ans.add(cur);
        }
        return ans;
    }
}
