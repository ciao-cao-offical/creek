package cn.ccy.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/26
 * @description https://leetcode-cn.com/problems/projection-area-of-3d-shapes/
 */
public class ProjectionArea {
    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 4}};
        System.out.println(new ProjectionArea().projectionArea(grid));
    }

    public int projectionArea(int[][] grid) {
        if (grid == null) {
            return 0;
        }

        int n = grid.length;
        //非零个数
        int xy = 0;
        //同行最大值加和
        int xz = 0;
        //同列最大值加和
        int yz = 0;
        for (int i = 0; i < n; i++) {
            int xzMax = 0;
            int yzMax = 0;
            for (int j = 0; j < n; j++) {
                xy += grid[i][j] > 0 ? 1 : 0;
                xzMax = Math.max(xzMax, grid[i][j]);
                yzMax = Math.max(yzMax, grid[j][i]);
            }
            xz += xzMax;
            yz += yzMax;
        }

        return xy + xz + yz;
    }
}
