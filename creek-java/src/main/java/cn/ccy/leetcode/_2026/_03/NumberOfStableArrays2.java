package cn.ccy.leetcode._2026._03;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-all-possible-stable-binary-arrays-ii/?envType=daily-question&envId=2026-03-10">3130. 找出所有稳定的二进制数组 II</a>
 * @since 2026/3/10 01:20
 */
public class NumberOfStableArrays2 {
    public static void main(String[] args) {

    }

    static final int MOD = 1000000007;
    int[][][] memo;
    int limit;

    public int numberOfStableArrays(int zero, int one, int limit) {
        this.memo = new int[zero + 1][one + 1][2];
        for (int i = 0; i <= zero; i++) {
            for (int j = 0; j <= one; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
        this.limit = limit;
        return (dp(zero, one, 0) + dp(zero, one, 1)) % MOD;
    }

    public int dp(int zero, int one, int lastBit) {
        if (zero == 0) {
            return (lastBit == 0 || one > limit) ? 0 : 1;
        } else if (one == 0) {
            return (lastBit == 1 || zero > limit) ? 0 : 1;
        }

        if (memo[zero][one][lastBit] == -1) {
            int res = 0;
            if (lastBit == 0) {
                res = (dp(zero - 1, one, 0) + dp(zero - 1, one, 1)) % MOD;
                if (zero > limit) {
                    res = (res - dp(zero - limit - 1, one, 1) + MOD) % MOD;
                }
            } else {
                res = (dp(zero, one - 1, 0) + dp(zero, one - 1, 1)) % MOD;
                if (one > limit) {
                    res = (res - dp(zero, one - limit - 1, 0) + MOD) % MOD;
                }
            }
            memo[zero][one][lastBit] = res % MOD;
        }
        return memo[zero][one][lastBit];
    }
}
