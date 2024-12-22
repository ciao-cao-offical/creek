package cn.ccy.leetcode.archive_2024.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/21 23:07:25
 * @description https://leetcode.cn/problems/6CE719/?envType=daily-question&envId=2024-06-21
 */
public class TemperatureTrend {
    public static void main(String[] args) {

    }

    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int n = temperatureA.length;
        int ans = 0, cur = 0;
        for (int i = 1; i < n; ++i) {
            int ta = getTrend(temperatureA[i - 1], temperatureA[i]);
            int tb = getTrend(temperatureB[i - 1], temperatureB[i]);
            if (ta == tb) {
                ++cur;
                ans = Math.max(ans, cur);
            } else {
                cur = 0;
            }
        }
        return ans;
    }

    public int getTrend(int x, int y) {
        if (x == y) {
            return 0;
        }
        return x < y ? -1 : 1;
    }
}
