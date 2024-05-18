package cn.ccy.leetcode.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/18 11:51:07
 * @description https://leetcode.cn/problems/find-the-maximum-divisibility-score/?envType=daily-question&envId=2024-05-18
 */
public class MaxDivScore {
    public static void main(String[] args) {

    }


    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = Integer.MIN_VALUE;
        int minDivisor = Integer.MAX_VALUE;

        for (int divisor : divisors) {
            int score = 0;
            for (int num : nums) {
                score += (num % divisor == 0 ? 1 : 0);
            }

            if (score > maxScore) {
                maxScore = score;
                minDivisor = divisor;
            } else if (score == maxScore && divisor < minDivisor) {
                minDivisor = divisor;
            }
        }

        return minDivisor;
    }
}
