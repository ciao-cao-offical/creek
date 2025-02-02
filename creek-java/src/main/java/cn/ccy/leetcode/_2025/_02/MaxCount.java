package cn.ccy.leetcode._2025._02;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/2 22:14:00
 * @description https://leetcode.cn/problems/search-in-rotated-sorted-array-ii/?envType=daily-question&envId=2025-02-01
 */

public class MaxCount {
    public static void main(String[] args) {
        
    }

    public int maxCount(int m, int n, int[][] ops) {
        int mina = m, minb = n;
        for (int[] op : ops) {
            mina = Math.min(mina, op[0]);
            minb = Math.min(minb, op[1]);
        }
        return mina * minb;
    }
}
