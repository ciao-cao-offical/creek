package cn.ccy.leetcode.archive_202408;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/22 00:20:25
 * @description https://leetcode.cn/problems/minimum-array-end/?envType=daily-question&envId=2024-08-22
 */
public class MinEnd {
    public static void main(String[] args) {

    }

    public long minEnd(int n, int x) {
        int bitCount = 128 - Long.numberOfLeadingZeros(n) - Long.numberOfLeadingZeros(x);
        long res = x;
        long m = n - 1;
        int j = 0;
        for (int i = 0; i < bitCount; ++i) {
            if (((res >> i) & 1) == 0) {
                if (((m >> j) & 1) == 1) {
                    res |= (1L << i);
                }
                j++;
            }
        }
        return res;
    }
}
