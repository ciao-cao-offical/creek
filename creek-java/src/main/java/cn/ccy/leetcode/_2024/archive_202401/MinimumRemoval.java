package cn.ccy.leetcode._2024.archive_202401;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/1/18 0018 00:24:45
 * @description https://leetcode.cn/problems/removing-minimum-number-of-magic-beans/?envType=daily-question&envId=2024-01-18
 * ☆☆☆ 2024cvd
 */
public class MinimumRemoval {
    public static void main(String[] args) {

    }

    public long minimumRemoval(int[] beans) {
        int n = beans.length;
        Arrays.sort(beans);
        long total = 0; // 豆子总数
        for (int i = 0; i < n; i++) {
            total += beans[i];
        }
        long res = total; // 最少需要移除的豆子数
        for (int i = 0; i < n; i++) {
            res = Math.min(res, total - (long) beans[i] * (n - i));
        }
        return res;
    }
}
