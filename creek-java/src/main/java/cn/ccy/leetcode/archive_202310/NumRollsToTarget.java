package cn.ccy.leetcode.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/24 0024 19:49:03
 * @description https://leetcode.cn/problems/number-of-dice-rolls-with-target-sum/description/?envType=daily-question&envId=2023-10-24
 * ☆☆☆ cvd，感冒了，头疼...
 */
public class NumRollsToTarget {
    public static void main(String[] args) {

    }

    static final int MOD = 1000000007;

    public int numRollsToTarget(int n, int k, int target) {
        int[] f = new int[target + 1];
        f[0] = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = target; j >= 0; --j) {
                f[j] = 0;
                for (int x = 1; x <= k; ++x) {
                    if (j - x >= 0) {
                        f[j] = (f[j] + f[j - x]) % MOD;
                    }
                }
            }
        }
        return f[target];
    }
}
