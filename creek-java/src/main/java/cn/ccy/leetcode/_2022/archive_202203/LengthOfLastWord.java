package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/8
 * @description https://leetcode-cn.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(new LengthOfLastWord().lengthOfLastWord(s));

    }

    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        boolean t = true;
        for (int i = len - 1; i >= 0; i--) {
            if (t && s.charAt(i) != ' ') {
                t = false;
                count++;

            } else if (!t && s.charAt(i) != ' ') {
                count++;

            } else if (!t) {
                break;
            }
        }
        return count;
    }
}
