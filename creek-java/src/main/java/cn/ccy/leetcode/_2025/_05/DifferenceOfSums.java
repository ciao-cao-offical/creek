package cn.ccy.leetcode._2025._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/divisible-and-non-divisible-sums-difference/description/?envType=daily-question&envId=2025-05-27">2894. 分类求和并作差</a>
 * @since 2025/5/27 21:24
 */
public class DifferenceOfSums {
    public static void main(String[] args) {

    }

    public int differenceOfSums(int n, int m) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                ans -= i;
            } else {
                ans += i;
            }
        }
        return ans;
    }
}
