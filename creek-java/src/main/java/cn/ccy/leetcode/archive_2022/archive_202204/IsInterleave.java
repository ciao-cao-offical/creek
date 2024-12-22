package cn.ccy.leetcode.archive_2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/22
 * @description https://leetcode-cn.com/problems/interleaving-string/
 * ★★★★★ 试试【滚动数组】
 */
public class IsInterleave {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        System.out.println(new IsInterleave().isInterleave(s1, s2, s3));
    }

    //动态规划
    /*public boolean isInterleave(String s1, String s2, String s3) {
        int s1l = s1.length();
        int s2l = s2.length();
        int s3l = s3.length();

        if (s1l + s2l != s3l) {
            return false;
        }

        boolean[][] dp = new boolean[s1l + 1][s2l + 1];
        dp[0][0] = true;
        for (int i = 0; i <= s1l; i++) {
            for (int j = 0; j <= s2l; j++) {
                int p = i + j - 1;
                if (i > 0) {
                    dp[i][j] = dp[i][j] || (dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(p)));
                }
                if (j > 0) {
                    dp[i][j] = dp[i][j] || (dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(p)));
                }
            }
        }

        return dp[s1l][s2l];
    }*/

    //滚动数组
    public boolean isInterleave(String s1, String s2, String s3) {
        int s1l = s1.length();
        int s2l = s2.length();
        int s3l = s3.length();

        if (s1l + s2l != s3l) {
            return false;
        }
        boolean[] f = new boolean[s2l + 1];
        f[0] = true;
        for (int i = 0; i <= s1l; i++) {
            for (int j = 0; j <= s2l; j++) {
                int p = i + j - 1;
                if (i > 0) {
                    f[j] = f[j] && s1.charAt(i - 1) == s3.charAt(p);
                }

                if (j > 0) {
                    f[j] = f[j] || (f[j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return f[s2l];
    }
}
