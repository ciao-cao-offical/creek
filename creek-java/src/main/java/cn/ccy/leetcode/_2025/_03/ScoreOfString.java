package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/score-of-a-string/?envType=daily-question&envId=2025-03-15">3110. 字符串的分数</a>
 * @since 2025/3/15 13:23
 */
public class ScoreOfString {
    public static void main(String[] args) {

    }

    public int scoreOfString(String s) {
        int score = 0;
        char[] ca = s.toCharArray();
        for (int i = 0; i + 1 < ca.length; i++) {
            score += Math.abs(ca[i + 1] - ca[i]);
        }
        return score;
    }
}
