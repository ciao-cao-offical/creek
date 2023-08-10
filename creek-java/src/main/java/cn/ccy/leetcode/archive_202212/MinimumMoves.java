package cn.ccy.leetcode.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/27 0027 22:22:33
 * @description https://leetcode.cn/problems/minimum-moves-to-convert-string/
 */
public class MinimumMoves {
    public static void main(String[] args) {
        String s = "XXOX";
        System.out.println(new MinimumMoves().minimumMoves(s));
    }

    public int minimumMoves(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'X') {
                i += 2;
                count++;
            }
        }
        return count;
    }
}
