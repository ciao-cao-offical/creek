package cn.ccy.leetcode._2025._07;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximize-subarrays-after-removing-one-conflicting-pair/?envType=daily-question&envId=2025-07-26">3480. 删除一个冲突对后最大子数组数目</a>
 * @since 2025/7/26 20:41
 * ★★★★★ 2025cvd
 */
public class MaxSubarrays {
    public static void main(String[] args) {

    }

    public long maxSubarrays(int n, int[][] conflictingPairs) {
        int[] bMin1 = new int[n + 1];
        int[] bMin2 = new int[n + 1];
        Arrays.fill(bMin1, Integer.MAX_VALUE);
        Arrays.fill(bMin2, Integer.MAX_VALUE);
        for (int[] pair : conflictingPairs) {
            int a = Math.min(pair[0], pair[1]), b = Math.max(pair[0], pair[1]);
            if (bMin1[a] > b) {
                bMin2[a] = bMin1[a];
                bMin1[a] = b;
            } else if (bMin2[a] > b) {
                bMin2[a] = b;
            }
        }
        long res = 0;
        int ib1 = n, b2 = Integer.MAX_VALUE;
        long[] delCount = new long[n + 1];
        for (int i = n; i >= 1; i--) {
            if (bMin1[ib1] > bMin1[i]) {
                b2 = Math.min(b2, bMin1[ib1]);
                ib1 = i;
            } else {
                b2 = Math.min(b2, bMin1[i]);
            }
            res += Math.min(bMin1[ib1], n + 1) - i;
            delCount[ib1] += Math.min(Math.min(b2, bMin2[ib1]), n + 1) - Math.min(bMin1[ib1], n + 1);
        }
        long max = 0;
        for (long val : delCount) {
            max = Math.max(max, val);
        }
        return res + max;
    }
}
