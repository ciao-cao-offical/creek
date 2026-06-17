package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/angle-between-hands-of-a-clock/?envType=daily-question&envId=2026-06-18">1344. 时钟指针的夹角</a>
 * @since 2026/6/18 01:25
 */
public class AngleClock {
    public static void main(String[] args) {

    }

    public double angleClock(int hour, int minutes) {
        int oneMinAngle = 6;
        int oneHourAngle = 30;

        double minutesAngle = oneMinAngle * minutes;
        double hourAngle = (hour % 12 + minutes / 60.0) * oneHourAngle;

        double diff = Math.abs(hourAngle - minutesAngle);
        return Math.min(diff, 360 - diff);
    }
}
