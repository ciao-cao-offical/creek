package cn.ccy.leetcode.archive_202412;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/12/5 00:31:29
 * @description https://leetcode.cn/problems/minimum-moves-to-capture-the-queen/submissions/585098440/?envType=daily-question&envId=2024-12-05
 */
public class MinMovesToCaptureTheQueen {
    public static void main(String[] args) {

    }

    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        // 车与皇后处在同一行，且中间没有象
        if (a == e && (c != a || d <= Math.min(b, f) || d >= Math.max(b, f))) {
            return 1;
        }
        // 车与皇后处在同一列，且中间没有象
        if (b == f && (d != b || c <= Math.min(a, e) || c >= Math.max(a, e))) {
            return 1;
        }
        // 象、皇后处在同一条对角线，且中间没有车
        if (Math.abs(c - e) == Math.abs(d - f) && ((c - e) * (b - f) != (a - e) * (d - f)
                || a < Math.min(c, e) || a > Math.max(c, e))) {
            return 1;
        }
        return 2;
    }
}
