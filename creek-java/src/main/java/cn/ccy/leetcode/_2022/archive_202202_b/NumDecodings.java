package cn.ccy.leetcode._2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/12
 * @description https://leetcode-cn.com/problems/decode-ways/
 */
public class NumDecodings {
    public static void main(String[] args) {
        System.out.println(new NumDecodings().numDecodings("12"));
    }

    public int numDecodings(String s) {
        int len = s.length();
        //a:f(i-2) b:f(i-1) c:f(i)
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= len; i++) {
            c = 0;
            if (s.charAt(i - 1) != '0') {
                c += b;
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                c += a;
            }

            a = b;
            b = c;
        }

        return c;
    }
}
