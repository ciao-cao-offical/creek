package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/reverse-degree-of-a-string/?envType=daily-question&envId=2026-09-20">3498. 字符串的反转度</a>
 * @since 2026/9/20 00:28
 */
public class ReverseDegree {
    public static void main(String[] args) {

    }

    public int reverseDegree(String s) {
        int ans = 0;
        for (int i = 1; i <= s.length(); i++) {
            ans += (26 - (s.charAt(i - 1) - 'a')) * i;
        }
        return ans;
    }
}
