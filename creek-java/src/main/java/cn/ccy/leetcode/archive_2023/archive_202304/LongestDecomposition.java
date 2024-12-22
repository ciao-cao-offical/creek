package cn.ccy.leetcode.archive_2023.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/12 0012 22:52:17
 * @description https://leetcode.cn/problems/longest-chunked-palindrome-decomposition/description/
 */
public class LongestDecomposition {
    public static void main(String[] args) {
        String text = "ghiabcdefhelloadamhelloabcdefghi";
        System.out.println(new LongestDecomposition().longestDecomposition(text));
    }

    // 递归
    public int longestDecomposition(String text) {
        int len = text.length();
        if (len == 0) {
            return 0;
        }
        for (int i = 0; i < len / 2; i++) {
            if (text.substring(0, i + 1).equals(text.substring(len - 1 - i))) {
                return 2 + longestDecomposition(text.substring(i + 1, len - 1 - i));
            }
        }

        return 1;
    }
}
