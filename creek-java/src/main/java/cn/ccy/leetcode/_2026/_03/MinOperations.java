package cn.ccy.leetcode._2026._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-changes-to-make-alternating-binary-string/?envType=daily-question&envId=2026-03-05">1758. 生成交替二进制字符串的最少操作数</a>
 * @since 2026/3/5 03:09
 */
public class MinOperations {
    public static void main(String[] args) {

    }

    public int minOperations(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != (char) ('0' + i % 2)) {
                cnt++;
            }
        }
        return Math.min(cnt, s.length() - cnt);
    }
}
