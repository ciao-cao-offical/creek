package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/lexicographically-smallest-permutation-greater-than-target/?envType=daily-question&envId=2026-08-27">3720. 大于目标字符串的最小字典序排列</a>
 * @since 2026/8/27 00:26
 */
public class LexGreaterPermutation {
    public static void main(String[] args) {

    }

    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] counts = new int[26];
        for (int i = 0; i < n; i++) {
            counts[s.charAt(i) - 'a']++;
        }
        StringBuffer lexGreatest = new StringBuffer();
        for (char c = 'z'; c >= 'a'; c--) {
            int count = counts[c - 'a'];
            for (int i = 1; i <= count; i++) {
                lexGreatest.append(c);
            }
        }
        if (lexGreatest.toString().compareTo(target) <= 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (char c = 'a'; c <= 'z' && !flag; c++) {
                int index = c - 'a';
                if (counts[index] == 0) {
                    continue;
                }
                counts[index]--;
                if (isPossible(c, sb, target, counts)) {
                    sb.setLength(i + 1);
                    flag = true;
                } else {
                    sb.setLength(i);
                    counts[index]++;
                }
            }
        }
        return sb.toString();
    }

    public boolean isPossible(char c, StringBuffer permutation, String target, int[] counts) {
        permutation.append(c);
        for (char next = 'z'; next >= 'a'; next--) {
            int count = counts[next - 'a'];
            for (int i = 1; i <= count; i++) {
                permutation.append(next);
            }
        }
        return permutation.toString().compareTo(target) > 0;
    }
}
