package cn.ccy.leetcode._2026._05;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-special-characters-ii/?envType=daily-question&envId=2026-05-27">3121. 统计特殊字母的数量 II</a>
 * @since 2026/5/27 00:34
 */
public class NumberOfSpecialChars2 {
    public static void main(String[] args) {

    }

    public int numberOfSpecialChars(String word) {
        int[] lastLow = new int[26];
        int[] firstUp = new int[26];
        Arrays.fill(lastLow, -1);
        Arrays.fill(firstUp, -1);
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) {
                lastLow[c - 'a'] = i;
            } else {
                if (firstUp[c - 'A'] == -1) {
                    firstUp[c - 'A'] = i;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (lastLow[i] != -1 && firstUp[i] != -1 && lastLow[i] < firstUp[i]) {
                ans++;
            }
        }
        return ans;
    }
}
