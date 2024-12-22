package cn.ccy.leetcode.archive_2022.archive_202206;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/11 0011
 * @description https://leetcode.cn/problems/flip-string-to-monotone-increasing/
 * ☆☆☆ cvd 摆烂一天...
 */
public class MinFlipsMonoIncr {
    public static void main(String[] args) {

    }

    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int dp0 = 0, dp1 = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int dp0New = dp0, dp1New = Math.min(dp0, dp1);
            if (c == '1') {
                dp0New++;
            } else {
                dp1New++;
            }
            dp0 = dp0New;
            dp1 = dp1New;
        }
        return Math.min(dp0, dp1);
    }
}
