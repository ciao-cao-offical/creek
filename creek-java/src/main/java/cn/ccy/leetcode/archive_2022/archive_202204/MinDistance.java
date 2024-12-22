package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/4 0004
 * @description https://leetcode-cn.com/problems/edit-distance/
 * ☆☆☆
 */
public class MinDistance {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        System.out.println(new MinDistance().minDistance(word1, word2));
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m == 0 || n == 0) {
            return m + n;
        }

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                //插入
                int left = dp[i - 1][j] + 1;
                //删除
                int down = dp[i][j - 1] + 1;
                //替换
                int left_down = dp[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    left_down++;
                }

                dp[i][j] = Math.min(Math.min(left, down), left_down);
            }
        }

        return dp[m][n];
    }
}
