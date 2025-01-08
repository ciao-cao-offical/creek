package cn.ccy.leetcode._2025._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/9 00:40:57
 * @description https://leetcode.cn/problems/count-substrings-that-can-be-rearranged-to-contain-a-string-i/?envType=daily-question&envId=2025-01-09
 */
public class ValidSubstringCount {
    public static void main(String[] args) {

    }

    public long validSubstringCount(String word1, String word2) {
        int[] count = new int[26];
        for (char c : word2.toCharArray()) {
            count[c - 'a']++;
        }
        int n = word1.length();
        int[][] preCount = new int[n + 1][26];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 26; j++) {
                preCount[i][j] = preCount[i - 1][j];
            }
            preCount[i][word1.charAt(i - 1) - 'a']++;
        }
        long res = 0;
        for (int l = 1; l <= n; l++) {
            int r = get(l, n + 1, preCount, count);
            res += n - r + 1;
        }
        return res;
    }

    private int get(int l, int r, int[][] preCount, int[] count) {
        int border = l;
        while (l < r) {
            int m = (l + r) >> 1;
            boolean f = true;
            for (int i = 0; i < 26; i++) {
                if (preCount[m][i] - preCount[border - 1][i] < count[i]) {
                    f = false;
                    break;
                }
            }
            if (f) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }
}
