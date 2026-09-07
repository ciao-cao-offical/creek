package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-commas-in-range/?envType=daily-question&envId=2026-09-08">3870. 统计范围内的逗号</a>
 * @since 2026/9/8 00:24
 */
public class CountCommas {
    public static void main(String[] args) {

    }

    public int countCommas(int n) {
        int res = 0;
        for (int a = 1; a <= n; ++a) {
            if (a > 999) {
                res += 1;
            }
        }
        return res;
    }
}
