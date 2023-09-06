package cn.ccy.leetcode.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/7 0007 00:42:03
 * @description https://leetcode.cn/problems/minimum-time-to-repair-cars/solutions/2425409/xiu-che-de-zui-shao-shi-jian-by-leetcode-if20/?envType=daily-question&envId=2023-09-07
 * ☆☆☆ 好困啊...
 */
public class RepairCars {
    public static void main(String[] args) {

    }

    public long repairCars(int[] ranks, int cars) {
        long l = 1, r = 1l * ranks[0] * cars * cars;
        while (l < r) {
            long m = l + r >> 1;
            if (check(ranks, cars, m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public boolean check(int[] ranks, int cars, long m) {
        long cnt = 0;
        for (int x : ranks) {
            cnt += (long) Math.sqrt(m / x);
        }
        return cnt >= cars;
    }
}
