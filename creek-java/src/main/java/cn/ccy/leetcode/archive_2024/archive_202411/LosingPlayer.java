package cn.ccy.leetcode.archive_2024.archive_202411;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/5 00:29:13
 * @description https://leetcode.cn/problems/find-the-winning-player-in-coin-game/?envType=daily-question&envId=2024-11-05
 */
public class LosingPlayer {
    public static void main(String[] args) {

    }

    public String losingPlayer(int x, int y) {
        return Math.min(x, y / 4) % 2 == 0 ? "Bob" : "Alice";
    }
}
