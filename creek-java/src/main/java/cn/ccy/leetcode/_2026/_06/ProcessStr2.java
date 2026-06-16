package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/process-string-with-special-operations-ii/?envType=daily-question&envId=2026-06-17">3614. 用特殊操作处理字符串 II</a>
 * @since 2026/6/17 00:07
 * ★★★★★ 2026cvd
 */
public class ProcessStr2 {
    public static void main(String[] args) {

    }

    public char processStr(String s, long k) {
        long len = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '*':
                    if (len > 0) {
                        len--;
                    }
                    break;
                case '#':
                    len *= 2;
                    break;
                case '%':
                    break;
                default:
                    len++;
                    break;
            }
        }
        if (k + 1 > len) {
            return '.';
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case '*':
                    len++;
                    break;
                case '#':
                    if (k + 1 > (len + 1) / 2) {
                        k -= len / 2;
                    }
                    len = (len + 1) / 2;
                    break;
                case '%':
                    k = len - k - 1;
                    break;
                default:
                    if (k + 1 == len) {
                        return c;
                    }
                    len--;
                    break;
            }
        }
        return '.';
    }
}
