package cn.ccy.leetcode.archive_2022.archive_202210;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/30 0030
 * @description https://leetcode.cn/problems/letter-case-permutation/
 */
public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(new LetterCasePermutation().letterCasePermutation(s));
    }

    //回溯
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        dfs(0, s.toCharArray(), ans);
        return ans;
    }

    private void dfs(int i, char[] charArray, List<String> ans) {
        if (i == charArray.length) {
            ans.add(new String(charArray));
            return;
        }

        dfs(i + 1, charArray, ans);
        if (Character.isLetter(charArray[i])) {
            charArray[i] ^= 1 << 5;
            dfs(i + 1, charArray, ans);
        }
    }

}
