package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/9
 * @description https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinations {
    private Map<Character, String> phoneNumbers = new HashMap<Character, String>() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public static void main(String[] args) {
        System.out.println(new LetterCombinations().letterCombinations("2"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        backTrack(0, digits, new StringBuilder(), ans);
        return ans;
    }

    private void backTrack(int idx, String digits, StringBuilder comb, List<String> ans) {
        if (idx == digits.length()) {
            ans.add(comb.toString());
            return;
        }

        char c = digits.charAt(idx);
        String s = phoneNumbers.get(c);
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            comb.append(aChar);
            backTrack(idx + 1, digits, comb, ans);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}
