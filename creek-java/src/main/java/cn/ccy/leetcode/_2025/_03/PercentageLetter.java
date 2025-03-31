package cn.ccy.leetcode._2025._03;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/percentage-of-letter-in-string/?envType=daily-question&envId=2025-03-31">2278. 字母在字符串中的百分比</a>
 * @since 2025/3/31 23:26
 */
public class PercentageLetter {
    public static void main(String[] args) {

    }

    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }

        return count * 100 / s.length();
    }
}
