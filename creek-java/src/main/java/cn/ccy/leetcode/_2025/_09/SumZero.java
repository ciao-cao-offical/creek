package cn.ccy.leetcode._2025._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-n-unique-integers-sum-up-to-zero/?envType=daily-question&envId=2025-09-07">1304. 和为零的 N 个不同整数</a>
 * @since 2025/9/7 10:09
 */
public class SumZero {
    public static void main(String[] args) {

    }

    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; ++i) {
            ans[index++] = i;
            ans[index++] = -i;
        }
        if (n % 2 == 1) {
            ans[index] = 0;
        }
        return ans;
    }
}
