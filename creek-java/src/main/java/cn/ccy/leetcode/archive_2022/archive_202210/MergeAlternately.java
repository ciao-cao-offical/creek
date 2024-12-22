package cn.ccy.leetcode.archive_2022.archive_202210;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/23 0023
 * @description https://leetcode.cn/problems/merge-strings-alternately/
 */
public class MergeAlternately {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(new MergeAlternately().mergeAlternately(word1, word2));
    }

    public String mergeAlternately(String word1, String word2) {

        int n = word1.length(), m = word2.length(), i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < n || j < m) {
            if (i < n) {
                sb.append(word1.charAt(i++));
            }
            if (j < m) {
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}
