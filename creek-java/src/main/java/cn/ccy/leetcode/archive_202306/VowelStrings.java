package cn.ccy.leetcode.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/2 0002 23:31:03
 * @description https://leetcode.cn/problems/count-vowel-strings-in-ranges/
 */
public class VowelStrings {
    public static void main(String[] args) {

    }

    // 前缀和
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len = words.length;
        int[] prefixSum = new int[len + 1];
        for (int i = 0; i < len; i++) {
            prefixSum[i + 1] = prefixSum[i] + (isVowelString(words[i]) ? 1 : 0);
        }

        int m = queries.length;
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            res[i] = prefixSum[end + 1] - prefixSum[start];
        }

        return res;
    }

    private boolean isVowelString(String s) {
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1));
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
