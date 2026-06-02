package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/earliest-finish-time-for-land-and-water-rides-ii/?envType=daily-question&envId=2026-06-03">3635. 最早完成陆地和水上游乐设施的时间 II</a>
 * @since 2026/6/3 00:54
 */
public class EarliestFinishTime2 {
    public static void main(String[] args) {

    }

    private int solve(int[] start1, int[] duration1, int[] start2, int[] duration2) {
        int finish1 = Integer.MAX_VALUE;
        for (int i = 0; i < start1.length; i++) {
            finish1 = Math.min(finish1, start1[i] + duration1[i]);
        }
        int finish2 = Integer.MAX_VALUE;
        for (int i = 0; i < start2.length; i++) {
            finish2 = Math.min(finish2, Math.max(start2[i], finish1) + duration2[i]);
        }
        return finish2;
    }

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land_water = solve(landStartTime, landDuration, waterStartTime, waterDuration);
        int water_land = solve(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(land_water, water_land);
    }
}
