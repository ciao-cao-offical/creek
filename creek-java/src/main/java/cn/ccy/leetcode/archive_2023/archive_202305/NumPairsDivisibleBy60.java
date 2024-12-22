package cn.ccy.leetcode.archive_2023.archive_202305;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/7 0007 12:41:42
 * @description https://leetcode.cn/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 */
public class NumPairsDivisibleBy60 {
    public static void main(String[] args) {

    }

    public int numPairsDivisibleBy60(int[] time) {
        int[] cnt = new int[60];
        for (int t : time) {
            cnt[t % 60]++;
        }
        long res = 0;
        for (int i = 1; i < 30; i++) {
            res += cnt[i] * cnt[60 - i];
        }
        res += (long) cnt[0] * (cnt[0] - 1) / 2 + (long) cnt[30] * (cnt[30] - 1) / 2;
        return (int) res;
    }
}
