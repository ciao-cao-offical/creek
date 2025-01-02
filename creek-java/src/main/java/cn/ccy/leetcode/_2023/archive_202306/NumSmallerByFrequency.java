package cn.ccy.leetcode._2023.archive_202306;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/10 0010 21:42:00
 * @description https://leetcode.cn/problems/compare-strings-by-frequency-of-the-smallest-character/
 */
public class NumSmallerByFrequency {
    public static void main(String[] args) {
        String[] queries = {"bbb", "cc"}, words = {"a", "aa", "aaa", "aaaa"};
        System.out.println(Arrays.toString(new NumSmallerByFrequency().numSmallerByFrequency(queries, words)));
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] wf = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            wf[i] = f(words[i]);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int qf = f(queries[i]);
            for (int j : wf) {
                if (qf < j) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }

    private int f(String s) {
        char c = s.charAt(0);
        int count = 1;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            } else if (chars[i] < c) {
                c = chars[i];
                count = 1;
            }
        }

        return count;
    }
}
