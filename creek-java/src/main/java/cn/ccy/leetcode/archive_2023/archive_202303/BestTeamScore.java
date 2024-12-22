package cn.ccy.leetcode.archive_2023.archive_202303;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/22 0022 22:27:20
 * @description https://leetcode.cn/problems/best-team-with-no-conflicts/
 */
public class BestTeamScore {
    public static void main(String[] args) {

    }

    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int[][] p = new int[n][2];
        for (int i = 0; i < n; i++) {
            p[i] = new int[]{scores[i], ages[i]};
        }
        //按照分数进行升序排列，如果分数相同按照年龄进行升序排列
        Arrays.sort(p, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        int res = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (p[i][1] >= p[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }

            dp[i] += p[i][0];
            res = Math.max(dp[i], res);
        }

        return res;
    }
}
