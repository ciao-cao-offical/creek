package cn.ccy.leetcode._2026._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-balloons/?envType=daily-question&envId=2026-06-22">1189. “气球” 的最大数量</a>
 * @since 2026/6/22 19:32
 */
public class MaxNumberOfBalloons {
    public static void main(String[] args) {

    }

    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[5];
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                cnt[0]++;
            } else if (ch == 'a') {
                cnt[1]++;
            } else if (ch == 'l') {
                cnt[2]++;
            } else if (ch == 'o') {
                cnt[3]++;
            } else if (ch == 'n') {
                cnt[4]++;
            }
        }
        cnt[2] /= 2;
        cnt[3] /= 2;
        return Arrays.stream(cnt).min().getAsInt();
    }
}
