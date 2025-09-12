package cn.ccy.leetcode._2025._09;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/vowels-game-in-a-string/?envType=daily-question&envId=2025-09-12">3227. 字符串元音游戏</a>
 * @since 2025/9/12 21:04
 */
public class DoesAliceWin {
    public static void main(String[] args) {

    }

    public boolean doesAliceWin(String s) {
        return s.chars().anyMatch(c -> {
            return "aeiou".indexOf(c) != -1;
        });
    }
}
