package cn.ccy.leetcode.archive_2024.archive_202401;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/24 0024 00:09:09
 * @description https://leetcode.cn/problems/beautiful-towers-i/?envType=daily-question&envId=2024-01-24
 */
public class MaximumSumOfHeights {
    public static void main(String[] args) {

    }

    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int n = maxHeights.size();
        long res = 0;
        for (int i = 0; i < n; i++) {
            int pre = maxHeights.get(i);
            long sum = pre;
            for (int j = i - 1; j >= 0; j--) {
                pre = Math.min(pre, maxHeights.get(j));
                sum += pre;
            }
            int suf = maxHeights.get(i);
            for (int j = i + 1; j < n; j++) {
                suf = Math.min(suf, maxHeights.get(j));
                sum += suf;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
