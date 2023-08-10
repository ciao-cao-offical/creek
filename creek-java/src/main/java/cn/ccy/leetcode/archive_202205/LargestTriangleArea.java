package cn.ccy.leetcode.archive_202205;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/15 0015
 * @description https://leetcode.cn/problems/largest-triangle-area/
 * ☆☆☆ 试试【凸包】
 * 数学绝对不会背叛你，不会就是不会...
 */
public class LargestTriangleArea {
    public static void main(String[] args) {
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        System.out.println(new LargestTriangleArea().largestTriangleArea(points));
    }

    //枚举 + 线性代数
    public double largestTriangleArea(int[][] points) {
        int len = points.length;
        double area = 0.0D;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    area = Math.max(area, triArea(points[i][0], points[i][1], points[j][0], points[j][1], points[k][0], points[k][1]));
                }
            }
        }
        return area;
    }

    /**
     * || x1 y1 1 || * 0.5 = |(x1*y2 + y1*x3 + x2*y3 - y2*x3 - y1*x2 -y3*x1)| * 0.5
     * || x2 y2 1 ||
     * || x3 y3 1 ||
     */
    private double triArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5d * Math.abs(x1 * y2 + y1 * x3 + x2 * y3 - y2 * x3 - y1 * x2 - y3 * x1);
    }
}
