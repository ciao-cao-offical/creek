package cn.ccy.leetcode._2026._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-divisibility-by-digit-sum-and-product/?envType=daily-question&envId=2026-08-22">3622. 判断整除性</a>
 * @since 2026/8/22 01:35
 */
public class CheckDivisibility {
    public static void main(String[] args) {

    }

    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;
        int original = n;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            digitSum += digit;
            digitProduct *= digit;
        }

        return original % (digitSum + digitProduct) == 0;
    }
}
