package cn.ccy.leetcode.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/21 23:00:58
 * @description https://leetcode.cn/problems/node-with-highest-edge-score/?envType=daily-question&envId=2024-09-21
 */
public class EdgeScore {
    public static void main(String[] args) {

    }

    public int edgeScore(int[] edges) {
        int n = edges.length;
        long[] points = new long[n];
        for (int i = 0; i < n; i++) {
            points[edges[i]] += i;
        }
        long maxPoints = -1;
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (points[i] > maxPoints) {
                maxPoints = points[i];
                res = i;
            }
        }
        return res;
    }
}
