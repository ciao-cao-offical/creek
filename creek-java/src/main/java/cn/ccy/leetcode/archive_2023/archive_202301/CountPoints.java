package cn.ccy.leetcode.archive_2023.archive_202301;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/24
 * @description https://leetcode.cn/problems/queries-on-number-of-points-inside-a-circle/
 */
public class CountPoints {
    public static void main(String[] args) {

    }

    public int[] countPoints(int[][] points, int[][] queries) {
        int len = queries.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int[] query = queries[i];
            int x = query[0];
            int y = query[1];
            int r = query[2];
            int count = 0;
            for (int[] point : points) {
                if (Math.pow((point[0] - x), 2) + Math.pow(point[1] - y, 2) <= Math.pow(r, 2)) {
                    count++;
                }
            }
            res[i] = count;
        }

        return res;
    }

}
