package cn.ccy.leetcode._2026._07;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-product-of-two-digits/description/?envType=daily-question&envId=2026-07-25">3536. 两个数字的最大乘积</a>
 * @since 2026/7/25 18:09
 */
public class MaxProduct {
    public static void main(String[] args) {

    }

    public int maxProduct(int n) {
        int first = 0, second = 0;
        while (n > 0) {
            int x = n % 10;
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second) {
                second = x;
            }
            n /= 10;
        }
        return first * second;
    }
}
