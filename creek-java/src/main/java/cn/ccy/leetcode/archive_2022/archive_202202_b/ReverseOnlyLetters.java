package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/23
 * @description https://leetcode-cn.com/problems/reverse-only-letters/
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public String reverseOnlyLetters(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) {
            return s;
        }

        int len = s.length();
        char[] chars = s.toCharArray();
        int l = 0;
        int r = len - 1;
        while (l < r) {
            char left = chars[l];
            if (!(left >= 'a' && left <= 'z') && !(left >= 'A' && left <= 'Z')) {
                l++;
                continue;
            }

            char right = chars[r];
            if (!(right >= 'a' && right <= 'z') && !(right >= 'A' && right <= 'Z')) {
                r--;
                continue;
            }

            chars[l] = right;
            chars[r] = left;
            l++;
            r--;

        }
        return String.valueOf(chars);
    }
}
