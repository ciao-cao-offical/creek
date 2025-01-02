package cn.ccy.leetcode._2022.archive_202203;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/27 0027
 * @description https://leetcode-cn.com/problems/find-missing-observations/
 */
public class MissingRolls {
    public static void main(String[] args) {
        int[] rolls = {3, 2, 4, 3};
        int mean = 4;
        int n = 2;
        System.out.println(Arrays.toString(new MissingRolls().missingRolls(rolls, mean, n)));
    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int total = (m + n) * mean;
        int mSum = 0;
        for (int roll : rolls) {
            mSum += roll;
        }
        int nSum = total - mSum;
        if (nSum > 6 * n || nSum < n) {
            return new int[0];
        }
        int[] ans = new int[n];
        int quotient = nSum / n;
        int remainder = nSum % n;
        for (int i = 0; i < n; i++) {
            ans[i] = quotient + (i < remainder ? 1 : 0);
        }
        return ans;
    }
}
