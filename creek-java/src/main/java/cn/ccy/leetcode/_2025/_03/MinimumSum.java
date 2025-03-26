package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/determine-the-minimum-sum-of-a-k-avoiding-array/?envType=daily-question&envId=2025-03-26">2829. k-avoiding 数组的最小总和</a>
 * @since 2025/3/26 23:24
 */
public class MinimumSum {
    public static void main(String[] args) {

    }

    public int minimumSum(int n, int k) {
        if (n <= k / 2) {
            return arithmeticSeriesSum(1, 1, n);
        } else {
            return arithmeticSeriesSum(1, 1, k / 2) + arithmeticSeriesSum(k, 1, n - k / 2);
        }
    }

    private int arithmeticSeriesSum(int a1, int d, int n) {
        return (a1 + a1 + (n - 1) * d) * n / 2;
    }
}
