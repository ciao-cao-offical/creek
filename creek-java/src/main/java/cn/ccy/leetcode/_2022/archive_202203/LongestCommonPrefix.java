package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/23 0023
 * @description https://leetcode-cn.com/problems/longest-common-prefix/
 * ★ 尝试一下【分治算法】
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }

    //纵向扫描
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return null;
        }
        int n = strs.length;
        String first = strs[0];
        if (n == 1) {
            return strs[0];
        }
        int i = 0;
        A:
        for (; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < n; j++) {
                if (strs[j] == null || strs[j].length() < i + 1 || strs[j].charAt(i) != c) {
                    break A;
                }
            }
        }

        return first.substring(0, i);
    }
}
