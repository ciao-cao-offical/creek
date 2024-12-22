package cn.ccy.leetcode.archive_2024.archive_202412;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/9 22:15:34
 * @description https://leetcode.cn/problems/determine-color-of-a-chessboard-square/?envType=daily-question&envId=2024-12-09
 */
public class SquareIsWhite {
    public static void main(String[] args) {

    }

    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '0')) % 2 == 1;
    }
}
