package cn.ccy.leetcode._2023.archive_202309;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/30 22:13
 * @description https://leetcode.cn/problems/earliest-possible-day-of-full-bloom/?envType=daily-question&envId=2023-09-30
 * ⭐️⭐️⭐️⭐️⭐️ cvd
 */
public class EarliestFullBloom {
    public static void main(String[] args) {

    }

    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        Integer[] id = new Integer[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        Arrays.sort(id, (i, j) -> growTime[j] - growTime[i]);
        int ans = 0, days = 0;
        for (int i : id) {
            days += plantTime[i]; // 累加播种天数
            ans = Math.max(ans, days + growTime[i]); // 再加上生长天数，就是这个种子的开花时间
        }
        return ans;
    }
}
