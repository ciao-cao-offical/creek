package cn.ccy.leetcode.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/16 21:51:06
 * @description https://leetcode.cn/problems/distance-between-bus-stops/?envType=daily-question&envId=2024-09-16
 */
public class DistanceBetweenBusStops {
    public static void main(String[] args) {
        int[] distance = new int[]{1, 2, 3, 4};
        System.out.println(new DistanceBetweenBusStops().distanceBetweenBusStops(distance, 0, 1));

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
