package cn.ccy.leetcode._2026._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximize-sum-of-squares-of-digits/?envType=daily-question&envId=2026-10-14">3723. 数位平方和的最大值</a>
 * @since 2026/10/14 00:41
 */
public class MaxSumOfSquares {
    public static void main(String[] args) {

    }

    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        int r = sum % 9;
        StringBuilder ans = new StringBuilder();
        int nines = sum / 9;
        for (int i = 0; i < nines; i++) {
            ans.append('9');
        }
        if (r > 0) {
            ans.append((char) ('0' + r));
        }
        int zeros = num - ans.length();
        for (int i = 0; i < zeros; i++) {
            ans.append('0');
        }
        return ans.toString();
    }
}
