package cn.ccy.leetcode.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/23 00:41:13
 * @description https://leetcode.cn/problems/count-pairs-that-form-a-complete-day-ii/?envType=daily-question&envId=2024-10-23
 */
public class CountCompleteDayPairs2 {
    public static void main(String[] args) {

    }

    public long countCompleteDayPairs(int[] hours) {
        long ans = 0;
        int[] cnt = new int[24];
        for (int hour : hours) {
            ans += cnt[(24 - hour % 24) % 24];
            cnt[hour % 24]++;
        }
        return ans;
    }
}
