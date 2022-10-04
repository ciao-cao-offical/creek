package com.ciao.leetcode.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/4 0004
 * @description https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid/
 */
public class MinAddToMakeValid {
    public static void main(String[] args) {
        String s = "()))((";
        System.out.println(new MinAddToMakeValid().minAddToMakeValid(s));
    }

    //模拟: 将「有效括号问题」转化为「分值有效性」的数学判定。from：https://leetcode.cn/problems/minimum-add-to-make-parentheses-valid/solution/by-ac_oier-9tn1/
    public int minAddToMakeValid(String s) {
        int ans = 0, score = 0;
        for (char c : s.toCharArray()) {
            score += c == '(' ? 1 : -1;
            if (score < 0) {
                score++;
                ans++;
            }
        }

        return ans + score;
    }
}
