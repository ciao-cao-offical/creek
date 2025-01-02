package cn.ccy.leetcode._2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/23 00:00:54
 * @description https://leetcode.cn/problems/best-sightseeing-pair/?envType=daily-question&envId=2024-09-23
 */
public class MaxScoreSightseeingPair {
    public static void main(String[] args) {

    }

    public int maxScoreSightseeingPair(int[] values) {
        int ans = 0, mx = values[0] + 0;
        for (int j = 1; j < values.length; ++j) {
            ans = Math.max(ans, mx + values[j] - j);
            // 边遍历边维护
            mx = Math.max(mx, values[j] + j);
        }
        return ans;
    }
}
