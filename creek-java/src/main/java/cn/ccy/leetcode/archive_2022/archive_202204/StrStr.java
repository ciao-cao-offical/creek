package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/7
 * @description https://leetcode-cn.com/problems/implement-strstr/
 * ☆☆ 试试【KMP】
 */
public class StrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(new StrStr().strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();
        if (nl > hl) {
            return -1;
        }

        for (int i = 0; i <= hl - nl; i++) {
            boolean flag = true;
            for (int j = 0; j < nl; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
