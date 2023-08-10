package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/19
 * @description https://leetcode-cn.com/problems/reverse-string/
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        char[] chars = str.toCharArray();
        new ReverseString().reverseString(chars);
        System.out.println(String.valueOf(chars));
    }

    public void reverseString(char[] s) {
        int len = s.length;
        if (len == 1) {
            return;
        }

        char temp;
        int mi = len - 1;
        for (int i = 0; i < len / 2; i++) {
            temp = s[i];
            s[i] = s[mi - i];
            s[mi - i] = temp;
        }
    }
}
