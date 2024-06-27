package cn.ccy.leetcode.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/27 23:18:11
 * @description https://leetcode.cn/problems/lexicographically-smallest-string-after-substring-operation/?envType=daily-question&envId=2024-06-27
 */
public class SmallestString {
    public static void main(String[] args) {

    }

    public String smallestString(String s) {
        int indexOfFirstNonA = findFirstNonA(s);
        if (indexOfFirstNonA == s.length()) {
            StringBuilder sb = new StringBuilder(s);
            sb.setCharAt(s.length() - 1, 'z');
            return sb.toString();
        }
        int indexOfFirstA_AfterFirstNonA = findFirstA_AfterFirstNonA(s, indexOfFirstNonA);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i >= indexOfFirstNonA && i < indexOfFirstA_AfterFirstNonA) {
                res.append((char) (c - 1));
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public int findFirstNonA(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                return i;
            }
        }
        return s.length();
    }

    public int findFirstA_AfterFirstNonA(String s, int firstNonA) {
        for (int i = firstNonA; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return i;
            }
        }
        return s.length();
    }
}
