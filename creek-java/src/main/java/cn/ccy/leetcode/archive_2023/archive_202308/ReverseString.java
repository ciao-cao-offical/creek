package cn.ccy.leetcode.archive_2023.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/7 0007 00:14:59
 * @description https://leetcode.cn/problems/reverse-string/
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'1', '2', '3', '4'};
        new ReverseString().reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        if (s == null || s.length == 0 || s.length == 1) {
            return;
        }

        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
