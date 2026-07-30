package cn.ccy.leetcode._2026._07;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-number-of-pushes-to-type-word-ii/description/?envType=daily-question&envId=2026-07-31">3016. 输入单词需要的最少按键次数 II</a>
 * @since 2026/7/31 03:14
 */
public class MinimumPushes2 {
    public static void main(String[] args) {

    }

    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Integer[] freqBoxed = Arrays.stream(freq).boxed().toArray(Integer[]::new);
        Arrays.sort(freqBoxed, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < 26 && freqBoxed[i] > 0; i++) {
            ans += (i / 8 + 1) * freqBoxed[i];
        }
        return ans;
    }
}
