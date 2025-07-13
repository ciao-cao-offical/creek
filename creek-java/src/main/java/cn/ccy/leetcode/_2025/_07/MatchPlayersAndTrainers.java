package cn.ccy.leetcode._2025._07;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-matching-of-players-with-trainers/?envType=daily-question&envId=2025-07-13">2410. 运动员和训练师的最大匹配数</a>
 * @since 2025/7/13 11:05
 */
public class MatchPlayersAndTrainers {
    public static void main(String[] args) {

    }

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int m = players.length, n = trainers.length;
        int count = 0;
        for (int i = 0, j = 0; i < m && j < n; i++, j++) {
            while (j < n && players[i] > trainers[j]) {
                j++;
            }
            if (j < n) {
                count++;
            }
        }
        return count;
    }
}
