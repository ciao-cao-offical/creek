package cn.ccy.leetcode.archive_2022.archive_202206;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/7 0007
 * @description https://leetcode.cn/problems/koko-eating-bananas/
 * ☆☆☆ cvd 继续赶需求，ctmd ctmd ctmd...
 */
public class MinEatingSpeed {
    public static void main(String[] args) {

    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int k = high;
        while (low < high) {
            int speed = (high - low) / 2 + low;
            long time = getTime(piles, speed);
            if (time <= h) {
                k = speed;
                high = speed;
            } else {
                low = speed + 1;
            }
        }
        return k;
    }

    public long getTime(int[] piles, int speed) {
        long time = 0;
        for (int pile : piles) {
            int curTime = (pile + speed - 1) / speed;
            time += curTime;
        }
        return time;
    }
}
