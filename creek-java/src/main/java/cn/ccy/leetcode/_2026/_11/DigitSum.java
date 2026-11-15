package cn.ccy.leetcode._2026._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/calculate-digit-sum-of-a-string/?envType=daily-question&envId=2026-11-16">2243. 计算字符串的数字和</a>
 * @since 2026/11/16 00:19
 */
public class DigitSum {
    public static void main(String[] args) {

    }

    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder tmp = new StringBuilder();   // 每次操作结束的字符串
            int n = s.length();
            for (int i = 0; i < n; i += k) {
                int val = 0;
                for (int j = i; j < Math.min(i + k, n); ++j) {
                    val += s.charAt(j) - '0';
                }
                tmp.append(val);
            }
            s = tmp.toString();
        }
        return s;
    }
}
