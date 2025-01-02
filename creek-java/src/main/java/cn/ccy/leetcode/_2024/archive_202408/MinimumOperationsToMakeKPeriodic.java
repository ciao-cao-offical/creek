package cn.ccy.leetcode._2024.archive_202408;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/17 22:21:52
 * @description https://leetcode.cn/problems/minimum-number-of-operations-to-make-word-k-periodic/?envType=daily-question&envId=2024-08-17
 */
public class MinimumOperationsToMakeKPeriodic {
    public static void main(String[] args) {

    }

    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        int n = word.length(), res = Integer.MAX_VALUE;
        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i += k) {
            String part = word.substring(i, i + k);
            res = Math.min(res, n / k - count.merge(part, 1, Integer::sum));
        }
        return res;
    }
}
