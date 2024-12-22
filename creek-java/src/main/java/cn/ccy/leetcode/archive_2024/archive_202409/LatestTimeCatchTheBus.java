package cn.ccy.leetcode.archive_2024.archive_202409;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/18 00:23:24
 * @description https://leetcode.cn/problems/the-latest-time-to-catch-a-bus/?envType=daily-question&envId=2024-09-18
 */
public class LatestTimeCatchTheBus {
    public static void main(String[] args) {

    }

    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int pos = 0;
        int space = 0;

        for (int arrive : buses) {
            space = capacity;
            while (space > 0 && pos < passengers.length && passengers[pos] <= arrive) {
                space--;
                pos++;
            }
        }

        pos--;
        int lastCatchTime = space > 0 ? buses[buses.length - 1] : passengers[pos];
        while (pos >= 0 && passengers[pos] == lastCatchTime) {
            pos--;
            lastCatchTime--;
        }

        return lastCatchTime;
    }
}
