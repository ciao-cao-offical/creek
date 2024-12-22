package cn.ccy.leetcode.archive_2023.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/8 0008 00:46:13
 * @description https://leetcode.cn/problems/calculate-delayed-arrival-time/?envType=daily-question&envId=2023-09-08
 */
public class FindDelayedArrivalTime {
    public static void main(String[] args) {

    }

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
