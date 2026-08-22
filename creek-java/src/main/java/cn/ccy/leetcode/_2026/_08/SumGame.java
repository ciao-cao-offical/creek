package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/sum-game/?envType=daily-question&envId=2026-08-23">1927. 求和游戏</a>
 * @since 2026/8/23 01:22
 */
public class SumGame {
    public static void main(String[] args) {

    }

    public boolean sumGame(String num) {
        int n = num.length();
        int[] left = get(num.substring(0, n / 2));
        int[] right = get(num.substring(n / 2, n));

        int n0 = left[0], q0 = left[1];
        int n1 = right[0], q1 = right[1];

        return ((q0 + q1) % 2 == 1) || (n0 - n1 != (q1 - q0) * 9 / 2);
    }

    private int[] get(String s) {
        int nn = 0, qq = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '?') {
                qq++;
            } else {
                nn += (ch - '0');
            }
        }
        return new int[]{nn, qq};
    }
}
