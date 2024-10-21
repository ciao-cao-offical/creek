package cn.ccy.leetcode.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/22 00:56:38
 * @description https://leetcode.cn/problems/count-pairs-that-form-a-complete-day-i/?envType=daily-question&envId=2024-10-22
 */
public class CountCompleteDayPairs {
    public static void main(String[] args) {

    }

    public int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        for (int i = 1; i < hours.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
