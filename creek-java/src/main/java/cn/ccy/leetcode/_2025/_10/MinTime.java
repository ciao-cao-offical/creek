package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-the-minimum-amount-of-time-to-brew-potions/description/?envType=daily-question&envId=2025-10-09">3494. 酿造药水需要的最少总时间</a>
 * @since 2025/10/9 00:43
 */
public class MinTime {
    public static void main(String[] args) {

    }

    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] times = new long[n];

        for (int j = 0; j < m; j++) {
            long curTime = 0;
            for (int i = 0; i < n; i++) {
                curTime = Math.max(curTime, times[i]) + (long) skill[i] * mana[j];
            }
            times[n - 1] = curTime;
            for (int i = n - 2; i >= 0; i--) {
                times[i] = times[i + 1] - (long) skill[i + 1] * mana[j];
            }
        }
        return times[n - 1];
    }
}
