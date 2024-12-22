package cn.ccy.leetcode.archive_2022.archive_202204;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/1
 * @description https://leetcode-cn.com/problems/generate-parentheses/
 * ☆☆ 试试【按括号序列的长度递归】
 */
public class GenerateParenthesis {
    ArrayList[] cache = new ArrayList[9];

    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(8));
    }

    //按括号序列的长度递归
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
                        ans.add(String.format("(%s)%s", left, right));
                    }
                }
            }
            cache[n] = ans;
        }
        return ans;
    }


    //回溯法
    /*public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder sb, int open, int close, int max) {
        if (sb.length() == max * 2) {
            result.add(sb.toString());
            return;
        }

        if (open < max) {
            sb.append('(');
            backtrack(result, sb, open + 1, close, max);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append(')');
            backtrack(result, sb, open, close + 1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }*/

    //暴力法
    /*public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        generate(new char[2 * n], 0, ans);
        return ans;
    }

    private void generate(char[] chars, int i, List<String> ans) {
        if (i == chars.length) {
            if (isValid(chars)) {
                ans.add(String.valueOf(chars));
            }
        } else {
            chars[i] = '(';
            generate(chars, i + 1, ans);
            chars[i] = ')';
            generate(chars, i + 1, ans);
        }
    }

    private boolean isValid(char[] chars) {
        int balance = 0;
        for (char c : chars) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }*/
}
