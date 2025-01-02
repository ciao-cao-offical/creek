package cn.ccy.leetcode._2023.archive_202304;

import java.util.HashSet;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/29 0029 23:32:14
 * @description https://leetcode.cn/problems/remove-letter-to-equalize-frequency/
 * cvd，搬家收拾屋子，累毙...
 */
public class EqualFrequency {
    public static void main(String[] args) {

    }

    public boolean equalFrequency(String word) {
        int[] charCount = new int[26];
        int n = word.length();
        for (int i = 0; i < n; i++) {
            charCount[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (charCount[i] == 0) {
                continue;
            }
            charCount[i]--;
            HashSet<Integer> frequency = new HashSet<Integer>();
            for (int f : charCount) {
                if (f > 0) {
                    frequency.add(f);
                }
            }
            if (frequency.size() == 1) {
                return true;
            }
            charCount[i]++;
        }
        return false;
    }
}
