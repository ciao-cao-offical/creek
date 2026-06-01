package cn.ccy.leetcode._2026._06;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/earliest-finish-time-for-land-and-water-rides-i/?envType=daily-question&envId=2026-06-02">3633. 最早完成陆地和水上游乐设施的时间 I</a>
 * @since 2026/6/2 00:27
 */
public class EarliestFinishTime {
    public static void main(String[] args) {

    }

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int land = landStartTime[i] + landDuration[i];
                int land_water = Math.max(land, waterStartTime[j]) + waterDuration[j];
                res = Math.min(res, land_water);

                int water = waterStartTime[j] + waterDuration[j];
                int water_land = Math.max(water, landStartTime[i]) + landDuration[i];
                res = Math.min(res, water_land);
            }
        }
        return res;
    }
}
