package cn.ccy.leetcode.archive_2024.archive_202403;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/30 0030 23:30:57
 * @description https://leetcode.cn/problems/minimum-number-of-coins-to-be-added/?envType=daily-question&envId=2024-03-30
 */
public class MinimumAddedCoins {
    public static void main(String[] args) {

    }

    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int ans = 0;
        int x = 1;
        int length = coins.length, index = 0;
        while (x <= target) {
            if (index < length && coins[index] <= x) {
                x += coins[index];
                index++;
            } else {
                x *= 2;
                ans++;
            }
        }
        return ans;
    }
}
