package cn.ccy.leetcode._2022.archive_202211;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/11/3
 * @description https://leetcode.cn/problems/maximum-repeating-substring/
 */
public class MaxRepeating {
    public static void main(String[] args) {
        String sequence = "ababc", word = "ab";
        System.out.println(new MaxRepeating().maxRepeating(sequence, word));
    }

    public int maxRepeating(String sequence, String word) {
        int n = sequence.length(), m = word.length();
        if (n < m) {
            return 0;
        }

        int[] f = new int[n];
        for (int i = m - 1; i < n; ++i) {
            boolean valid = true;
            for (int j = 0; j < m; ++j) {
                if (sequence.charAt(i - m + j + 1) != word.charAt(j)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                f[i] = (i == m - 1 ? 0 : f[i - m]) + 1;
            }
        }

        return Arrays.stream(f).max().getAsInt();
    }
}
