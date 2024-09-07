package cn.ccy.leetcode.archive_202409;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/7 23:24:50
 * @description https://leetcode.cn/problems/find-the-maximum-length-of-a-good-subsequence-ii/?envType=daily-question&envId=2024-09-07
 */
public class MaximumLength2 {
    public static void main(String[] args) {

    }

    public int maximumLength(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, int[]> dp = new HashMap<Integer, int[]>();
        int[] zd = new int[k + 1];

        for (int i = 0; i < len; i++) {
            int v = nums[i];
            dp.putIfAbsent(v, new int[k + 1]);

            int[] tmp = dp.get(v);
            for (int j = 0; j <= k; j++) {
                tmp[j] = tmp[j] + 1;
                if (j > 0) {
                    tmp[j] = Math.max(tmp[j], zd[j - 1] + 1);
                }
            }
            for (int j = 0; j <= k; j++) {
                zd[j] = Math.max(zd[j], tmp[j]);
            }
        }
        return zd[k];
    }
}
