package cn.ccy.leetcode._2026._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/sum-of-squares-of-special-elements/?envType=daily-question&envId=2026-10-11">2778. 特殊元素平方和</a>
 * @since 2026/10/11 19:54
 */
public class SumOfSquares {
    public static void main(String[] args) {

    }

    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            if (n % (i + 1) == 0) {
                ans += nums[i] * nums[i];
            }
        }
        return ans;
    }
}
