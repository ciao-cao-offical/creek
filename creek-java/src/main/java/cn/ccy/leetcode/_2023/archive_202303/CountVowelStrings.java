package cn.ccy.leetcode._2023.archive_202303;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/29 0029 23:07:48
 * @description https://leetcode.cn/problems/count-sorted-vowel-strings/description/
 */
public class CountVowelStrings {
    public static void main(String[] args) {

    }

    //动态规划
    public int countVowelStrings(int n) {
        if (n == 1) {
            return 5;
        }

        int[] dp = new int[5];
        for (int i = 0; i < 5; i++) {
            dp[i] = 1;
        }
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return Arrays.stream(dp).sum();
    }
}
