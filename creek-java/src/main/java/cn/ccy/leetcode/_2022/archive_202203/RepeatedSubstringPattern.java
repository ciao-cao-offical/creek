package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/4
 * @description https://leetcode-cn.com/problems/repeated-substring-pattern/
 * ★★ 了解一下KMP算法
 */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern("abab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; 2 * i <= len; i++) {
            boolean match = true;
            if (len % i == 0) {
                for (int j = i; j < len; j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    return true;
                }
            }
        }

        return false;
    }
}
