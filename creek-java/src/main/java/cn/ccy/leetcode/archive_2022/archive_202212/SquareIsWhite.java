package cn.ccy.leetcode.archive_2022.archive_202212;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/12/8 0008
 * @description https://leetcode.cn/problems/determine-color-of-a-chessboard-square/
 */
public class SquareIsWhite {
    public static void main(String[] args) {
        String coordinates = "a1";
        System.out.println(new SquareIsWhite().squareIsWhite(coordinates));
    }

    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '0')) % 2 == 1;
    }

    /*【找规律】
    public boolean squareIsWhite(String coordinates) {
        int a = (coordinates.charAt(0) - 'a') % 2;
        int b = (coordinates.charAt(1) - '1') % 2;
        boolean isBlack = (a == 0 && b == 0) || (a == 1 && b == 1);
        return !isBlack;
    }*/
}
