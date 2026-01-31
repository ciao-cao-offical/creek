package cn.ccy.leetcode._2026._01;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/find-smallest-letter-greater-than-target/?envType=daily-question&envId=2026-01-31">744. 寻找比目标字母大的最小字母</a>
 * @since 2026/1/31 23:38
 */
public class NextGreatestLetter {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        char nextGreater = letters[0];
        for (int i = 0; i < length; i++) {
            if (letters[i] > target) {
                nextGreater = letters[i];
                break;
            }
        }
        return nextGreater;
    }
}
