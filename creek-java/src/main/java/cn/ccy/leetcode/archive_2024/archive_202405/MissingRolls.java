package cn.ccy.leetcode.archive_2024.archive_202405;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/27 01:18:35
 * @description https://leetcode.cn/problems/find-missing-observations/?envType=daily-question&envId=2024-05-27
 */
public class MissingRolls {
    public static void main(String[] args) {

    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = mean * (n + m);
        int missingSum = sum;
        for (int roll : rolls) {
            missingSum -= roll;
        }
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }
        int quotient = missingSum / n, remainder = missingSum % n;
        int[] missing = new int[n];
        for (int i = 0; i < n; i++) {
            missing[i] = quotient + (i < remainder ? 1 : 0);
        }
        return missing;
    }
}
