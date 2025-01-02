package cn.ccy.leetcode._2022.archive_202209;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/9/3 0003
 * @description https://leetcode.cn/problems/maximum-length-of-pair-chain/
 * ☆☆☆ 试试【最长递增子序列】和【贪心】
 */
public class FindLongestChain {
    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(new FindLongestChain().findLongestChain(pairs));
    }

    // 动态规划
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        //System.out.println(Arrays.deepToString(pairs));
        int len = pairs.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp[len - 1];
    }
}
