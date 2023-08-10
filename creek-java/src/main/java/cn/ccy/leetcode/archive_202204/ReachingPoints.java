package cn.ccy.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/9 0009
 * @description https://leetcode-cn.com/problems/reaching-points/
 */
public class ReachingPoints {
    public static void main(String[] args) {
        int sx = 1;
        int sy = 1;
        int tx = 3;
        int ty = 5;
        System.out.println(new ReachingPoints().reachingPoints(sx, sy, tx, ty));
    }

    //反向计算
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx > sx && ty > sy && tx != ty) {
            if (tx > ty) {
                tx %= ty;
            } else {
                ty %= tx;
            }
        }

        if (tx == sx && ty == sy) {
            return true;

        } else if (tx == sx) {
            return ty > sy && (ty - sy) % tx == 0;

        } else if (ty == sy) {
            return tx > sx && (tx - sx) % ty == 0;

        } else {
            return false;
        }
    }
}
