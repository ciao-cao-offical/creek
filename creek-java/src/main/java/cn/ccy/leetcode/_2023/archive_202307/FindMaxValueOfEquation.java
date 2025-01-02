package cn.ccy.leetcode._2023.archive_202307;

import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/21 0021 00:44:18
 * @description https://leetcode.cn/problems/max-value-of-equation/
 * ☆☆☆☆☆ cvd
 */
public class FindMaxValueOfEquation {
    public static void main(String[] args) {

    }

    // 堆：cvd from https://leetcode.cn/problems/max-value-of-equation/solutions/2351324/man-zu-bu-deng-shi-de-zui-da-zhi-by-leet-5rbj/
    public int findMaxValueOfEquation(int[][] points, int k) {
        int res = Integer.MIN_VALUE;
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        for (int[] point : points) {
            int x = point[0], y = point[1];
            while (!heap.isEmpty() && x - heap.peek()[1] > k) {
                heap.poll();
            }
            if (!heap.isEmpty()) {
                res = Math.max(res, x + y - heap.peek()[0]);
            }
            heap.offer(new int[]{x - y, x});
        }
        return res;
    }
}
