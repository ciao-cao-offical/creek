package com.ciao.leetcode.archive_202202_b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/12
 * @description https://leetcode-cn.com/problems/word-break/
 * ☆☆
 */
public class WordBreak {
    public static void main(String[] args) {
        System.out.println(new WordBreak().wordBreak("leetcode", new ArrayList<String>() {{
            add("leet");
            add("code");
        }}));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] d = new boolean[s.length() + 1];
        d[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (d[j] && set.contains(s.substring(j, i))) {
                    d[i] = true;
                    break;
                }
            }
        }

        return d[s.length()];
    }
}
