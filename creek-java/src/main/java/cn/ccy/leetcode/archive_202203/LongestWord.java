package cn.ccy.leetcode.archive_202203;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/17
 * @description https://leetcode-cn.com/problems/longest-word-in-dictionary/
 * ☆☆ 学习一下【字典树】
 */
public class LongestWord {
    public static void main(String[] args) {
        String[] words = {"w", "wo", "wor", "worl", "world"};
        System.out.println(new LongestWord().longestWord(words));
    }

    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));

        String ans = "";
        for (String s : set) {
            int sl = s.length();
            int al = ans.length();
            if (sl < al) {
                continue;
            }
            if (sl == al && s.compareTo(ans) > 0) {
                continue;
            }

            boolean pass = true;
            for (int i = 0; i < sl; i++) {
                if (!set.contains(s.substring(0, i + 1))) {
                    pass = false;
                    break;
                }
            }

            if (pass) {
                ans = s;
            }
        }
        return ans;
    }
}
