package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/22 0022
 * @description https://leetcode-cn.com/problems/remove-colored-pieces-if-both-neighbors-are-the-same-color/
 */
public class WinnerOfGame {
    public static void main(String[] args) {
        String colors = "AAABABB";
        System.out.println(new WinnerOfGame().winnerOfGame(colors));
    }

    public boolean winnerOfGame(String colors) {
        char[] chars = colors.toCharArray();
        int len = chars.length;
        int a = 0;
        int b = 0;
        for (int i = 1; i < len - 1; i++) {
            if (chars[i - 1] == 'A' && chars[i] == 'A' && chars[i + 1] == 'A') {
                a++;
            }
            if (chars[i - 1] == 'B' && chars[i] == 'B' && chars[i + 1] == 'B') {
                b++;
            }
        }
        return a > b;
    }
}
