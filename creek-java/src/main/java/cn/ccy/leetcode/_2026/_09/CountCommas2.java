package cn.ccy.leetcode._2026._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-commas-in-range-ii/?envType=daily-question&envId=2026-09-09">3871. 统计范围内的逗号 II</a>
 * @since 2026/9/9 01:32
 */
public class CountCommas2 {
    public static void main(String[] args) {

    }

    public long countCommas(long n) {
        long p = 1000, res = 0;
        while (p <= n) {
            res += n - p + 1;
            p *= 1000;
        }
        return res;
    }
}
