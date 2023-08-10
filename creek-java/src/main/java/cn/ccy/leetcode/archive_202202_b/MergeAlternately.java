package cn.ccy.leetcode.archive_202202_b;

/**
 * @author https://leetcode-cn.com/problems/merge-strings-alternately/
 * @version v 1.0.0
 * @date 2022/2/25
 * @description 当前类の简要描述
 */
public class MergeAlternately {
    public static void main(String[] args) {
        System.out.println(new MergeAlternately().mergeAlternately("ab", "pqrs"));
    }

    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        char[] ans = new char[l1 + l2];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < ans.length; ) {
            if (i1 < l1 && i2 < l2) {
                ans[i] = word1.charAt(i1);
                ans[i + 1] = word2.charAt(i2);
                i += 2;
                i1++;
                i2++;

            } else if (i1 < l1) {
                ans[i] = word1.charAt(i1);
                i++;
                i1++;

            } else if (i2 < l2) {
                ans[i] = word2.charAt(i2);
                i++;
                i2++;
            }
        }

        return String.valueOf(ans);
    }
}
