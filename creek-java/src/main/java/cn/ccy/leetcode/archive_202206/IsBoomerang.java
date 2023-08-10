package cn.ccy.leetcode.archive_202206;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/8 0008
 * @description https://leetcode.cn/problems/valid-boomerang/solution/you-xiao-de-hui-xuan-biao-by-leetcode-so-yqby/
 * ☆☆☆ cvd，继续赶需求，明天（2022年6月9日）应该就可以恢复正常了...ctm ctm...
 */
public class IsBoomerang {
    public static void main(String[] args) {

    }

    public boolean isBoomerang(int[][] points) {
        int[] v1 = {points[1][0] - points[0][0], points[1][1] - points[0][1]};
        int[] v2 = {points[2][0] - points[0][0], points[2][1] - points[0][1]};
        return v1[0] * v2[1] - v1[1] * v2[0] != 0;
    }
}
