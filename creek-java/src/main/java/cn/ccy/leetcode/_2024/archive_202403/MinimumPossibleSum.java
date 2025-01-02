package cn.ccy.leetcode._2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/8 0008 00:39:29
 * @description https://leetcode.cn/problems/find-the-minimum-possible-sum-of-a-beautiful-array/?envType=daily-question&envId=2024-03-08
 */
public class MinimumPossibleSum {
    public static void main(String[] args) {

    }

    public int minimumPossibleSum(int n, int target) {
        final int MOD = (int) 1e9 + 7;
        int m = target / 2;
        if (n <= m) {
            return (int) ((long) (1 + n) * n / 2 % MOD);
        }
        return (int) (((long) (1 + m) * m / 2 +
                ((long) target + target + (n - m) - 1) * (n - m) / 2) % MOD);
    }
}
