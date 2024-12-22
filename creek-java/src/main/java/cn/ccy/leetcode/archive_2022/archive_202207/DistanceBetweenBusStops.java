package cn.ccy.leetcode.archive_2022.archive_202207;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/7/24 0024
 * @description https://leetcode.cn/problems/distance-between-bus-stops/
 * ☆☆ 摆烂 cvd 好累啊...
 */
public class DistanceBetweenBusStops {
    public static void main(String[] args) {

    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < distance.length; i++) {
            if (i >= start && i < destination) {
                sum1 += distance[i];
            } else {
                sum2 += distance[i];
            }
        }
        return Math.min(sum1, sum2);
    }
}
