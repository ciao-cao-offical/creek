package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-digits-are-equal-in-string-after-operations-i/?envType=daily-question&envId=2025-10-23">3461. 判断操作后字符串中的数字是否相等 I</a>
 * @since 2025/10/23 00:19
 */
public class HasSameDigits {
    public static void main(String[] args) {

    }

    public boolean hasSameDigits(String s) {
        int n = s.length();
        char[] sArray = s.toCharArray();
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 0; j <= n - 1 - i; j++) {
                int digit1 = sArray[j] - '0';
                int digit2 = sArray[j + 1] - '0';
                sArray[j] = (char) (((digit1 + digit2) % 10) + '0');
            }
        }
        return sArray[0] == sArray[1];
    }
}
