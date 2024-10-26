package cn.ccy.leetcode.archive_202410;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/26 20:55:31
 * @description https://leetcode.cn/problems/maximum-total-reward-using-operations-ii/?envType=daily-question&envId=2024-10-26
 * ☆☆☆☆☆ 2024cvd
 */
public class MaxTotalReward2 {
    public static void main(String[] args) {

    }

    public int maxTotalReward(int[] rewardValues) {
        int n = rewardValues.length;
        Arrays.sort(rewardValues);
        if (n >= 2 && rewardValues[n - 2] == rewardValues[n - 1] - 1) {
            return 2 * rewardValues[n - 1] - 1;
        }
        BigInteger f = BigInteger.ONE;
        for (int x : Arrays.stream(rewardValues).distinct().toArray()) {
            BigInteger mask = BigInteger.ONE.shiftLeft(x).subtract(BigInteger.ONE);
            f = f.or(f.and(mask).shiftLeft(x));
        }
        return f.bitLength() - 1;
    }
}
