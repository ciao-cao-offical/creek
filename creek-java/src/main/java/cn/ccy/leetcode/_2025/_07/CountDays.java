package cn.ccy.leetcode._2025._07;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-days-without-meetings/?envType=daily-question&envId=2025-07-11">3169. 无需开会的工作日</a>
 * @since 2025/7/11 21:15
 */
public class CountDays {
    public static void main(String[] args) {

    }

    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int l = 1, r = 0;
        for (int[] m : meetings) {
            if (m[0] > r) {
                days -= (r - l + 1);
                l = m[0];
            }
            r = Math.max(r, m[1]);
        }
        days -= (r - l + 1);
        return days;
    }
}
