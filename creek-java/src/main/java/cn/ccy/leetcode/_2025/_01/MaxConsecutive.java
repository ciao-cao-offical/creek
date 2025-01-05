package cn.ccy.leetcode._2025._01;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/1/6 00:03:56
 * @description https://leetcode.cn/problems/maximum-consecutive-floors-without-special-floors/?envType=daily-question&envId=2025-01-06
 */
public class MaxConsecutive {
    public static void main(String[] args) {

    }

    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int ans = 0;
        ans = Math.max(ans, special[0] - bottom);
        for (int i = 1; i < special.length; ++i) {
            ans = Math.max(ans, special[i] - special[i - 1] - 1);
        }
        ans = Math.max(ans, top - special[special.length - 1]);
        return ans;
    }
}
