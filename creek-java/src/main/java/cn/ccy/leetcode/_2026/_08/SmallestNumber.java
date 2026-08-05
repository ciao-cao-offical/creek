package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/smallest-divisible-digit-product-i/?envType=daily-question&envId=2026-08-06">最小可整除数位乘积 I</a>
 * @since 2026/8/6 00:58
 */
public class SmallestNumber {
    public static void main(String[] args) {

    }

    public int smallestNumber(int n, int t) {
        while (!check(n, t)) {
            n++;
        }
        return n;
    }

    private boolean check(int num, int t) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
            if (product == 0) {
                break;
            }
        }
        return product % t == 0;
    }
}
