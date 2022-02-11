package com.ciao.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/9
 * @description https://leetcode-cn.com/problems/generate-parentheses/
 */
public class GenerateParenthesis {
    private ArrayList<String>[] cache = new ArrayList[10];

    //["((()))","(()())","(())()","()(())","()()()"]
    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        return generate(n);
    }

    private List<String> generate(int n) {
        if (cache[n] != null) {
            return cache[n];
        }

        ArrayList<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add("");

        } else {
            for (int i = 0; i < n; i++) {
                for (String left : generate(i)) {
                    for (String right : generate(n - i - 1)) {
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }

        cache[n] = ans;
        return ans;
    }
}
