package cn.ccy.leetcode._2023.archive_202309;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/1 0001 00:08:55
 * @description https://leetcode.cn/problems/number-of-ways-to-buy-pens-and-pencils/
 */
public class WaysToBuyPensPencils {
    public static void main(String[] args) {
        int total = 20, cost1 = 10, cost2 = 5;
        System.out.println(new WaysToBuyPensPencils().waysToBuyPensPencils(total, cost1, cost2));
    }

    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if (cost1 < cost2) {
            return waysToBuyPensPencils(total, cost2, cost1);
        }
        long res = 0, cnt = 0;
        while (cnt * cost1 <= total) {
            res += (total - cnt * cost1) / cost2 + 1;
            cnt++;
        }
        return res;
    }

    /*public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if (total < cost1 && total < cost2) {
            return 1L;
        }

        long res = 0L;
        for (long i = 0; i <= total / cost1; i++) {
            res += (total - cost1 * i) / cost2 + 1;
        }

        return res;
    }*/
}
