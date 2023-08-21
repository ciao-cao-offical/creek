package cn.ccy.leetcode.archive_202308;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/22 0022 01:08:30
 * @description https://leetcode.cn/problems/maximize-distance-to-closest-person/
 * ☆☆☆ cvd, it's asm day!
 */
public class MaxDistToClosest {
    public static void main(String[] args) {

    }

    public int maxDistToClosest(int[] seats) {
        int res = 0;
        int l = 0;
        while (l < seats.length && seats[l] == 0) {
            ++l;
        }
        res = Math.max(res, l);
        while (l < seats.length) {
            int r = l + 1;
            while (r < seats.length && seats[r] == 0) {
                ++r;
            }
            if (r == seats.length) {
                res = Math.max(res, r - l - 1);
            } else {
                res = Math.max(res, (r - l) / 2);
            }
            l = r;
        }
        return res;
    }
}
