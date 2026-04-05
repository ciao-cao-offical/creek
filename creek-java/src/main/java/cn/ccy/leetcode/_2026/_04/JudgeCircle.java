package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/robot-return-to-origin/?envType=daily-question&envId=2026-04-05">657. 机器人能否返回原点</a>
 * @since 2026/4/5 22:54
 */
public class JudgeCircle {
    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        int length = moves.length();
        for (int i = 0; i < length; i++) {
            char move = moves.charAt(i);
            if (move == 'U') {
                y--;
            } else if (move == 'D') {
                y++;
            } else if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}
