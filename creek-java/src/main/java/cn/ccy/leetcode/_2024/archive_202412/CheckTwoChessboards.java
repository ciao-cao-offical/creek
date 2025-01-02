package cn.ccy.leetcode._2024.archive_202412;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/3 00:04:28
 * @description https://leetcode.cn/problems/check-if-two-chessboard-squares-have-the-same-color/?envType=daily-question&envId=2024-12-03
 */
public class CheckTwoChessboards {
    public static void main(String[] args) {

    }

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0) - coordinate2.charAt(0) + coordinate1.charAt(1) - coordinate2.charAt(1)) % 2 == 0;
    }
}
