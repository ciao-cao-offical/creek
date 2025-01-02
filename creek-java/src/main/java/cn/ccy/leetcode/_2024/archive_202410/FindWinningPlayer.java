package cn.ccy.leetcode._2024.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/24 23:32:09
 * @description https://leetcode.cn/problems/find-the-first-player-to-win-k-games-in-a-row/?envType=daily-question&envId=2024-10-24
 */
public class FindWinningPlayer {
    public static void main(String[] args) {

    }

    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;
        int cnt = 0;
        int i = 0, last_i = 0;

        while (i < n) {
            int j = i + 1;
            while (j < n && skills[j] < skills[i] && cnt < k) {
                j++;
                cnt++;
            }
            if (cnt == k) {
                return i;
            }
            cnt = 1;
            last_i = i;
            i = j;
        }
        return last_i;
    }
}
