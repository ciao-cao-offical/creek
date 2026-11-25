package cn.ccy.leetcode._2026._11;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/stone-removal-game/?envType=daily-question&envId=2026-11-26">3360. 移除石头游戏</a>
 * @since 2026/11/26 00:57
 */
public class CanAliceWin {
    public static void main(String[] args) {

    }

    public boolean canAliceWin(int n) {
        int take = 10, k = 0;
        while (n >= take) {
            n -= take;
            take--;
            k++;
        }
        return k % 2 == 1;
    }
}
