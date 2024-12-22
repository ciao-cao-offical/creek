package cn.ccy.leetcode.archive_2022.archive_202206;

import java.util.Random;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/5 0005
 * @description https://leetcode.cn/problems/generate-random-point-in-a-circle/
 * ☆☆☆ cvd 赶需求...
 */
public class randPoint {
    public static void main(String[] args) {

    }

    Random random;
    double xc, yc, r;

    public randPoint(double radius, double x_center, double y_center) {
        random = new Random();
        xc = x_center;
        yc = y_center;
        r = radius;
    }

    public double[] randPoint() {
        while (true) {
            double x = random.nextDouble() * (2 * r) - r;
            double y = random.nextDouble() * (2 * r) - r;
            if (x * x + y * y <= r * r) {
                return new double[]{xc + x, yc + y};
            }
        }
    }
}
